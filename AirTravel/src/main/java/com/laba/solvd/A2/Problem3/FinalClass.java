package com.laba.solvd.A2.Problem3;

public final class FinalClass {

  private FinalClass(){

  }
  // A final variable
  public static final double PI = 3.14159265359;

  // A final method that calculates the area of a circle
  public static final double calculateCircleArea(double radius) {
    return PI * radius * radius;
  }

}
