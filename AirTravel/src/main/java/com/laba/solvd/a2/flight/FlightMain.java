package com.laba.solvd.a2.flight;

public class FlightMain {

  public static void main(String[] args) {
    Flight fly = new Flight("SA917", "Nashville", "Boston", 400);
    Flight fly2 = new Flight("JAL678", "Tokyo", "Boston", 2500);
    Flight fly3 = new Flight(fly);
    Flight fly4 = new Flight(fly2);

    Flight[] flights = new Flight[7];
    for (int i = 0; i < flights.length; i++) {
      if (i % 2 == 0) {
        flights[i] = new Flight(fly3.getFlghtname(), fly3.getSource(), fly3.getDestination(),
            fly3.getPrice());
      } else {
        flights[i] = new Flight(fly4.getFlghtname(), fly4.getSource(), fly4.getDestination(),
            fly4.getPrice());
      }
    }



    // Create and start threads for each Flight instance
    Thread[] threads = new Thread[flights.length];
    for (int i = 0; i < threads.length; i++) {
      threads[i] = new Thread(flights[i]);
      threads[i].start();
    }

    try {
      // Wait for all threads to finish
      for (Thread thread : threads) {
        thread.join();
      }
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    // Perform further actions after both threads have completed
    System.out.println("All threads have completed.");
  }
}
