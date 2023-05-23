package com.laba.solvd.A8.Problem2;

public class MyStaticClass {
  // takes two integers as input parameters and returns their sum
  public static int add(int a, int b) {
    return a + b;
  }

  //takes two doubles as input parameters and returns their quotient
  //and if the second parameter is zero, an IllegalArgumentException is thrown division by zero is not possible
  public static double divide(double a, double b) {
    if (b == 0) {
      throw new IllegalArgumentException("Cannot divide by zero");
    }
    return a / b;
  }

  // takes an integer as an input parameter and returns true if it's even and false if it's odd.
  public static boolean isEven(int num) {
    return num % 2 == 0;
  }

}
