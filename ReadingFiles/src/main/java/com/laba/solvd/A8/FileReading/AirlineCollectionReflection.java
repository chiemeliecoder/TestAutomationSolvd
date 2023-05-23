package com.laba.solvd.A8.FileReading;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AirlineCollectionReflection {
  public static void main(String []args)  throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
    // Create an instance of the Airline class using reflection
//    Class<?> airlineClass = Class.forName("com.laba.solvd.a2.airline.JapanAirlines");
//    Constructor<?> constructor = airlineClass.getConstructor(String.class, String.class, String.class);
//    Airline airlineInstance = (Airline) constructor.newInstance("JapanAirline", "JAL123", "Tokyo");
//
//    // Call a method using reflection
//    Method setNameMethod = airlineClass.getMethod("setName", String.class);
//    setNameMethod.invoke(airlineInstance, "NewAirlineName");
//
//    // Access fields using reflection
//    Field[] fields = airlineClass.getDeclaredFields();
//    for (Field field : fields) {
//      field.setAccessible(true);
//      System.out.println("Field Name: " + field.getName());
//      System.out.println("Field Type: " + field.getType());
//      System.out.println("Field Value: " + field.get(airlineInstance));
//      System.out.println();
//    }
//
//    // Perform 7 collection streaming operations
//    List<Flight> flights = new ArrayList<>();
//    flights.add(new Flight("SA917","Nashville","Boston",400));
//    flights.add(new Flight("JAL678","Tokyo","Boston",2500));
//    flights.add(new Flight("AA012","NewYork","Texas",500));
//    flights.add(new Flight("DA0958","Oregon","Georgia",400));
//    flights.add(new Flight("BA768","London","Boston",2500));
//
//    // 1. Filtering flights that contain the letter 't' in their name
//    List<Flight> filteredFlights = flights.stream()
//        .filter(flight -> flight.getFlghtname().contains("A"))
//        .collect(Collectors.toList());
//    System.out.println("Filtered Flights: " + filteredFlights);
//
//    // 2. Mapping flight names to uppercase
//    List<String> flightNames = flights.stream()
//        .map(Flight::getFlghtname)
//        .map(String::toUpperCase)
//        .collect(Collectors.toList());
//    System.out.println("Flight Names: " + flightNames);
//
//    // 3. Checking if any flight name starts with 'J'
//    boolean anyFlightStartsWithF = flights.stream()
//        .anyMatch(flight -> flight.getFlghtname().startsWith("J"));
//    System.out.println("Any flight starts with 'J': " + anyFlightStartsWithF);
//
//    // 4. Checking if all flight names contain the letter '7'
//    boolean allFlightsContainI = flights.stream()
//        .allMatch(flight -> flight.getFlghtname().contains("7"));
//    System.out.println("All flight names contain '7': " + allFlightsContainI);
//
//    // 5. Finding the first flight with a name length greater than 7
//    Flight firstLongFlight = flights.stream()
//        .filter(flight -> flight.getFlghtname().length() > 7)
//        .findFirst()
//        .orElse(null);
//    System.out.println("First long flight: " + firstLongFlight);
//
//    // 6. Counting the number of flights
//    long flightCount = flights.stream()
//        .count();
//    System.out.println("Number of flights: " + flightCount);
//
//    // 7. Concatenating all flight names into a single string
//    String flightNamesConcatenated = flights.stream()
//        .map(Flight::getFlghtname)
//        .reduce("", (name1, name2) -> name1 + " " + name2);
//    System.out.println("Flight names concatenated: " + flightNamesConcatenated);
  }

}
