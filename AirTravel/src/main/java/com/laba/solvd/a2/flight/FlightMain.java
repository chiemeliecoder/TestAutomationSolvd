package com.laba.solvd.a2.flight;


import static com.laba.solvd.a2.flight.Flight.getConnectionFromPool;
import static com.laba.solvd.a2.flight.Flight.releaseConnectionToPool;

import com.laba.solvd.a2.MainClass;
import java.io.IOException;
import java.sql.SQLException;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import org.apache.log4j.Logger;
import org.apache.log4j.chainsaw.Main;


public class FlightMain {
  private static final Logger logger = Logger.getLogger(Main.class);

  public static void main(String[] args) {
    Flight fly = new Flight("SA917", "Nashville", "Boston", 400);
    Flight fly2 = new Flight("JAL678", "Tokyo", "Boston", 2500);
    Flight fly3 = new Flight(fly);
    Flight fly4 = new Flight(fly2);

//    Flight[] flights = new Flight[7];
//    for (int i = 0; i < flights.length; i++) {
//      if (i % 2 == 0) {
//        flights[i] = new Flight(fly3.getFlghtname(), fly3.getSource(), fly3.getDestination(),
//            fly3.getPrice());
//      } else {
//        flights[i] = new Flight(fly4.getFlghtname(), fly4.getSource(), fly4.getDestination(),
//            fly4.getPrice());
//      }
//    }

    Flight[] flights = IntStream.range(0, 7)
        .mapToObj(i -> (i % 2 == 0) ? new Flight(fly3.getFlghtname(), fly3.getSource(), fly3.getDestination(), fly3.getPrice())
            : new Flight(fly4.getFlghtname(), fly4.getSource(), fly4.getDestination(), fly4.getPrice()))
        .toArray(Flight[]::new);





    // Create and start threads for each Flight instance
    Thread[] threads = new Thread[flights.length];
    IntStream.range(0, threads.length)
        .mapToObj(i -> {
          threads[i] = new Thread(flights[i]);
          return threads[i];
        })
        .forEach(Thread::start);

    Connection connection = null;
    try {
      // Wait for all threads to finish
      synchronized (threads) {
        Stream.of(threads)
            .forEach(thread -> {
              try {
                thread.join();
              } catch (InterruptedException e) {
                e.printStackTrace();
              }
            });
      }
    } finally {
      // Close a database connection
      if (connection != null) {
        try {
          connection.close();
          System.out.println("Database connection closed.");
        } catch (IOException e) {
          System.out.println("Error closing database connection: " + e.getMessage());
        }
      }

      // system resources
      try{
        getConnectionFromPool();
      }catch(InterruptedException e){
        logger.debug("Operation interrupted.");
      }
    }
    logger.info("All threads have completed.");
  }
}
