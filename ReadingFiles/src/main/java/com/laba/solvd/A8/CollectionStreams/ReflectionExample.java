package com.laba.solvd.A8.CollectionStreams;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionExample {

  public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
    // Get information about the ArrayList class
    Class<?> arrayListClass = Class.forName("java.util.ArrayList");

    // Extract information about fields
    Field[] fields = arrayListClass.getDeclaredFields();
    System.out.println("Fields:");
    for (Field field : fields) {
      System.out.println("- " + field.getName() + ": " + field.getType());
    }

    // Extract information about constructors
    Constructor<?>[] constructors = arrayListClass.getConstructors();
    System.out.println("\nConstructors:");
    for (Constructor<?> constructor : constructors) {
      System.out.println("- " + constructor.getName() + ": " + constructor.getParameterCount() + " parameters");
    }

    // Extract information about methods
    Method[] methods = arrayListClass.getDeclaredMethods();
    System.out.println("\nMethods:");
    for (Method method : methods) {
      System.out.println("- " + method.getName() + ": " + method.getReturnType() + " - " + method.getParameterCount() + " parameters");
    }


    Constructor<?> constructor = arrayListClass.getConstructor();
    Object arrayList = constructor.newInstance();

    // Call the "add" method on the ArrayList object using reflection
    Method addMethod = arrayListClass.getDeclaredMethod("add", Object.class);
    addMethod.invoke(arrayList, "Hello, Reflection!");

    // Print the ArrayList object
    System.out.println(arrayList);
  }
}
