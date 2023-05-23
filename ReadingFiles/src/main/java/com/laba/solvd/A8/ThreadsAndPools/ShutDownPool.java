package com.laba.solvd.A8.ThreadsAndPools;

import com.sun.jdi.connect.spi.Connection;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ShutDownPool {
  public static void main(String[] args) throws InterruptedException, ExecutionException {
    ConnectionPool connectionPool = ConnectionPool.getInstance();
    ExecutorService executorService = Executors.newFixedThreadPool(7);
    CompletionService<Void> completionService = new ExecutorCompletionService<>(executorService);

    for (int i = 0; i < 5; i++) {
      completionService.submit(() -> {
        try {
          Connection connection = connectionPool.getConnection();
          // Use the connection
          // ...
          connectionPool.releaseConnection(connection);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }, null);
    }

    // Wait for all tasks to complete
    for (int i = 0; i < 5; i++) {
      completionService.take().get();
    }

    executorService.shutdown();
  }

}
