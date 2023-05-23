package com.laba.solvd.A8.Problem2;

public class MyMainStatic {
  //static makes it possible so you can call these methods and functions directly on the class without creating an instance
  public static void main(String[] args) {
    int sum = MyStaticClass.add(5, 7);
    double quotient = MyStaticClass.divide(10.0, 2.0);
    boolean isFiveEven = MyStaticClass.isEven(5);
    System.out.println(sum);
    System.out.println(quotient);
    System.out.println(isFiveEven);

  }

}
