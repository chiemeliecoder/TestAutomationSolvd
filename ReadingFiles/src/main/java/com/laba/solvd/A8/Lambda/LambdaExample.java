package com.laba.solvd.A8.Lambda;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaExample {
  public static void main(String[] args) {
    Predicate<Integer> isPositive = x -> x > 0;
    System.out.println(isPositive.test(5)); // Output: true
    System.out.println(isPositive.test(-5)); // Output: false

    Function<String, Integer> stringLength = s -> s.length();
    System.out.println(stringLength.apply("Hello, world!"));

    Consumer<String> printUpperCase = s -> System.out.println(s.toUpperCase());
    printUpperCase.accept("hello, world!"); // Output: HELLO, WORLD!

    Supplier<Integer> generateRandomNumber = () -> (int) (Math.random() * 100);
    System.out.println(generateRandomNumber.get()); // Output: a random number between 0 and 100

    BinaryOperator<Integer> add = (a, b) -> a + b;
    System.out.println(add.apply(5, 10)); // Output: 15
  }

}
