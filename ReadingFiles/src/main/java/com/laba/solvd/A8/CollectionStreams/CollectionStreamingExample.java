package com.laba.solvd.A8.CollectionStreams;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionStreamingExample {

  public static void main(String[] args)
      throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException, InvocationTargetException {
    // Create an ArrayList of integers
    Class<?> arrayListClass = Class.forName("java.util.ArrayList");
    Constructor<?> constructor = arrayListClass.getConstructor();
    List<Integer> numbers = (List<Integer>) constructor.newInstance();

    // Add elements to the ArrayList
    numbers.add(1);
    numbers.add(2);
    numbers.add(3);
    numbers.add(4);
    numbers.add(5);

    // Perform streaming operations
    List<Integer> squaredEvenNumbers = numbers.stream()
        .filter(n -> n % 2 == 0) // Filter even numbers
        .map(n -> n * n) // Square each number
        .collect(Collectors.toList()); // Collect the results into a new list

    // Print the squared even numbers
    System.out.println(squaredEvenNumbers);

    // Use reflection to extract information about fields, constructors, and methods
    System.out.println("\nReflection Information:");
    System.out.println("Fields:");
    Field[] fields = arrayListClass.getDeclaredFields();
    for (Field field : fields) {
      System.out.println("- " + field.getName() + ": " + field.getType());
    }

    System.out.println("\nConstructors:");
    Constructor<?>[] constructors = arrayListClass.getConstructors();
    for (Constructor<?> constructoring : constructors) {
      System.out.println("- " + constructor.getName() + ": " + constructor.getParameterCount() + " parameters");
    }

    System.out.println("\nMethods:");
    Method[] methods = arrayListClass.getDeclaredMethods();
    for (Method method : methods) {
      System.out.println("- " + method.getName() + ": " + method.getReturnType() + " - " + method.getParameterCount() + " parameters");
    }
  }

}
