package com.laba.solvd.A8.ThreadsAndPools;

public class NewClass {
  public static void main(String[] args) {
    Thread thread1 = new Thread(new MyRunnable());
    Thread thread2 = new Thread(new MyRunnable());

    thread1.start();
    thread2.start();
  }

}
