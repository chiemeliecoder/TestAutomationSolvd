package com.laba.solvd.a2.flight;

import com.laba.solvd.a2.exceptions.FlightException;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Flight implements Runnable {
  protected String flghtname;
  private String source;
  private String destination;
  private Integer price;
  private Flight flight;
  private static final int CONNECTION_POOL_SIZE = 5;
  private static BlockingQueue<Connection> connectionPool;

  public Flight(String flghtname, String source, String destination, Integer price) {

    this.flghtname = flghtname;
    this.source = source;
    this.destination = destination;
    this.price = price;
  }

  public Flight(Flight flight) {
    if (flight == null) {
      throw new IllegalArgumentException("Flight cannot be null");
    }
    this.flight = flight;
  }


  static {
    connectionPool = new ArrayBlockingQueue<>(CONNECTION_POOL_SIZE);
    initializeConnectionPool();
    executeFlightThreads();
  }

  public void setFlight(String flghtname, String source, String destination, Integer price) throws FlightException {
    if (flghtname == null || flghtname.isEmpty()) {
      throw new FlightException("Flight name cannot be null or empty");
    }
    if (source == null || source.isEmpty()) {
      throw new FlightException("Source cannot be null or empty");
    }
    if (destination == null || destination.isEmpty()) {
      throw new FlightException("Destination cannot be null or empty");
    }
    if (price == null || price < 0) {
      throw new FlightException("Price must be a positive integer");
    }
  }

  public String getFlghtname() {
    return flghtname;
  }


  public void setFlghtname(String flghtname) {
    this.flghtname = flghtname;
  }

  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public String getDestination() {
    return destination;
  }

  public void setDestination(String destination) {
    this.destination = destination;
  }

  public Integer getPrice() {
    return price;
  }

  public void setPrice(Integer price) {
    this.price = price;
  }

  private static void initializeConnectionPool() {
    // Initialize the connection pool with connections
    CountDownLatch latch = new CountDownLatch(CONNECTION_POOL_SIZE);
    ExecutorService executor = Executors.newFixedThreadPool(CONNECTION_POOL_SIZE);

    for (int i = 0; i < CONNECTION_POOL_SIZE; i++) {
      executor.execute(() -> {
        Connection connection = createConnection();
        connectionPool.offer(connection);
        latch.countDown();
      });
    }

    executor.shutdown();

  }

  private static Connection createConnection() {
    // Create and return a new connection
    return new Connection();
  }

  public static Connection getConnectionFromPool() throws InterruptedException {
    // Get a connection from the pool
    return connectionPool.take();
  }

  public static void releaseConnectionToPool(Connection connection) {
    // Release a connection back to the pool
    connectionPool.offer(connection);
  }

  public CompletableFuture<Connection> getConnectionAsync() {
    initializeConnectionPool();
    CompletableFuture<Connection> future = new CompletableFuture<>();
    try {
      Connection connection = connectionPool.take();
      future.complete(connection);
    } catch (InterruptedException e) {
      future.completeExceptionally(e);
    }
    return future;
  }

  private static void executeFlightThreads() {
    ExecutorService executor = Executors.newFixedThreadPool(CONNECTION_POOL_SIZE);
    for (int i = 0; i < CONNECTION_POOL_SIZE; i++) {
      Flight flight = new Flight("Flight " + (i + 1), "Source " + (i + 1),
          "Destination " + (i + 1), (i + 1) * 100);
      Flight flightThread = new Flight(flight);
      flight.flight = flight;
      executor.execute(flightThread);
    }
    executor.shutdown();
  }


  @Override
  public void run() {
    try {
      System.out.println("Thread: " + Thread.currentThread().getName() + " is running.");

//      int totalPrice = flight.getPrice() * 2; // Multiply the price by 2
//
//      System.out.println("Total price for " + flight.getFlghtname() + ": $" + totalPrice);
      if (this.flight != null) {
        int totalPrice = this.flight.getPrice() * 2; // Multiply the price by 2
        System.out.println("Total price for " + this.flight.getFlghtname() + ": $" + totalPrice);
      } else {
        System.out.println("Flight is not initialized.");
      }


      // Get a connection asynchronously from the pool
      CompletableFuture<Connection> connectionFuture = getConnectionAsync();

      // Wait for the connection to be available
      Connection connection = connectionFuture.get();

      // Get a connection from the pool
      //Connection connection = getConnectionFromPool();

      // Perform operations with the connection
      if (connection.isOpen()) {
        byte [] packet = connection.readPacket();
        // Process the packet
        connection.writePacket(packet);
      }

      // Release the connection back to the pool
      releaseConnectionToPool(connection);

    }catch (InterruptedException | IOException | ExecutionException e) {
      e.printStackTrace();
    }


  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Flight)) {
      return false;
    }
    Flight flight = (Flight) o;
    return getFlghtname().equals(flight.getFlghtname()) && getSource().equals(flight.getSource())
        && getDestination().equals(flight.getDestination()) && getPrice().equals(flight.getPrice());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getFlghtname(), getSource(), getDestination(), getPrice());
  }

  @Override
  public String toString() {
    return "Flight{" +
        "flghtname='" + flghtname + '\'' +
        ", source='" + source + '\'' +
        ", destination='" + destination + '\'' +
        ", price=" + price +
        '}';
  }
}
