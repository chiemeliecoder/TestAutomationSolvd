package com.laba.solvd.A8.CollectionStreams;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class AircraftCollectionRelection {
  public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException,
      NoSuchMethodException, InvocationTargetException, InstantiationException {

    Calendar cal1 = Calendar.getInstance();
    cal1.set(Calendar.DATE, 8);
    Date meYear = cal1.getTime();

    Class<?> aircraftClass = Class.forName("com.laba.solvd.a2.aircraft.CommercialJet");
    Constructor<?> constructor = aircraftClass.getConstructor(Date.class, String.class, Integer.class,
        Integer.class, String.class);
//    Aircraft aircraftInstance = (Aircraft) constructor.newInstance(meYear, "Boeing airBus", 200,
//        1995, "Soaring skies");
//    System.out.println(aircraftInstance);
//
//    // Use reflection to call the setPassengerCapacity method
//    Method setPassengerCapacityMethod = aircraftClass.getDeclaredMethod("setPassengerCapacity",
//        Integer.class);
//    setPassengerCapacityMethod.invoke(aircraftInstance, 300);
//    System.out.println(aircraftInstance.getPassengerCapacity());

    // Extract information about fields
    Field[] fields = aircraftClass.getDeclaredFields();
    for (Field field : fields) {
      System.out.println("Field name: " + field.getName());
      System.out.println("Field type: " + field.getType().getSimpleName());
      System.out.println("Field modifiers: " + Modifier.toString(field.getModifiers()));
      System.out.println();
    }

    Calendar cal = Calendar.getInstance();
    cal.set(Calendar.DATE, 12);
    Date manYear = cal.getTime();

//    List<Aircraft> aircraftList = new LinkedList<>();
//    aircraftList.add(new CommercialJet(manYear, "Boeing 747", 200, 1968, "Queen of the Skies",100300));
//    aircraftList.add(new CommercialJet(manYear, "Boeing 744", 300, 1950, "King of the Skies",200000));
//    aircraftList.add(new CommercialJet(manYear, "Boeing airbus", 400, 1990, "Skies",300000));
//
//    aircraftList.stream()
//        .filter(aircraft -> aircraft.getPassengerCapacity() > 250)
//        .map(Aircraft::getNameOfAircraft)
//        .forEach(System.out::println);

    // Extract information about constructors
    Constructor<?>[] constructors = aircraftClass.getDeclaredConstructors();
    for (Constructor<?> ctor : constructors) {
      System.out.println("Constructor name: " + ctor.getName());
      System.out.println("Constructor parameters: ");
      Parameter[] parameters = ctor.getParameters();
      for (Parameter parameter : parameters) {
        System.out.println(parameter.getType().getSimpleName() + " " + parameter.getName());
      }
      System.out.println();
    }

    // Extract information about methods
    Method[] methods = aircraftClass.getDeclaredMethods();
    for (Method method : methods) {
      System.out.println("Method name: " + method.getName());
      System.out.println("Method return type: " + method.getReturnType().getSimpleName());
      System.out.println("Method parameters: ");
      Parameter[] parameters = method.getParameters();
      for (Parameter parameter : parameters) {
        System.out.println(parameter.getType().getSimpleName() + " " + parameter.getName());
      }
      System.out.println();
    }

  }

}
