package com.laba.solvd.A8.Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.lang.Number;

public class GenericLambda<T extends Number, U extends Number, R extends Number> {

  BiFunction<T, U, R> add = (num1, num2) -> {
    double sum = num1.doubleValue() + num2.doubleValue();
    return (R) Double.valueOf(sum);
  };

  Function<List<T>, Integer> listSize = (List<T> list) -> list.size();

  BiFunction<List<T>, List<U>, List<Object>> concat = (List<T> list1, List<U> list2) -> {
    List<Object> result = new ArrayList<>();
    result.addAll(list1);
    result.addAll(list2);
    return result;
  };

  public static void main(String[] args) {
    GenericLambda<Integer, Double, Double> lambda = new GenericLambda<>();
    System.out.println(lambda.add.apply(1,2.0));

    List<Integer> t = new ArrayList<>();
    t.add(1);
    t.add(2);

    List<Double> d = new ArrayList<>();
    d.add(1.0);
    d.add(2.0);

    System.out.println(lambda.listSize.apply(t));

    System.out.println(lambda.concat.apply(t,d));

  }

}
