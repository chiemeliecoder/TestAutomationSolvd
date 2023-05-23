package com.laba.solvd.A8.ThreadsAndPools;

import com.sun.jdi.connect.spi.Connection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainPool {
  public static void main(String[] args) {
    ConnectionPool connectionPool = ConnectionPool.getInstance();
    ExecutorService executorService = Executors.newFixedThreadPool(7);

    for (int i = 0; i < 5; i++) {
      executorService.execute(() -> {
        try {
          Connection connection = connectionPool.getConnection();
          // Use the connection
          // ...
          connectionPool.releaseConnection(connection);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      });
    }

    executorService.shutdown();
  }

}
