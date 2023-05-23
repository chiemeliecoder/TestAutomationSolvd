package com.laba.solvd.a2.airport;

import com.laba.solvd.a2.aircraft.Aircraft;
import com.laba.solvd.a2.aircraft.CommercialJet;
import com.laba.solvd.a2.enums.CommercialJetType;
import com.laba.solvd.a2.aircraft.Helicopters;
import com.laba.solvd.a2.airline.Airline;
import com.laba.solvd.a2.enums.Cuisine;
import com.laba.solvd.a2.airline.JapanAirlines;
import com.laba.solvd.a2.airline.SouthwestAirlines;
import com.laba.solvd.a2.enums.TierStatus;
import com.laba.solvd.a2.exceptions.AircraftException;
import com.laba.solvd.a2.exceptions.AirlineException;
import com.laba.solvd.a2.exceptions.AirportStaffException;
import com.laba.solvd.a2.exceptions.FlightException;
import com.laba.solvd.a2.exceptions.GateException;
import com.laba.solvd.a2.flight.Flight;
import com.laba.solvd.a2.gate.Gate;
import com.laba.solvd.a2.staff.MaintenanceStaff;
import com.laba.solvd.a2.staff.Staff;
import com.laba.solvd.a2.enums.StaffRole;
import com.laba.solvd.a2.enums.Country;
import com.laba.solvd.a2.terminal.Terminal;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;

public class MainClass {
  private static final Logger logger = Logger.getLogger(MainClass.class);

  public static void main(String[] args)  {

    logger.info("\n Welcome to Airport\n");
    System.out.println("=====Airport Information=====");
    // create an instance of AirportCollections

    Calendar cal4 = Calendar.getInstance();
    cal4.set(Calendar.DATE, 12);
    Date manYear2 = cal4.getTime();

    //AirportCollections airport5 = new AirportCollections();

    CustomLinkedList<Staff> listOfS = null;

    Staff staff11 = new MaintenanceStaff( "John",26,36000,10, StaffRole.ROLE1);
    Staff staff22 = new MaintenanceStaff("sharon",26,36000,5,StaffRole.ROLE2);
    List<Staff> stfs = new ArrayList<>();
    stfs.add(staff11);
    stfs.add(staff22);



    Flight fly22 = new Flight("JA978","Boston","Tokyo",2500);
    List<Flight> flights11 = new ArrayList<>();
    flights11.add(fly22);

    List<String> countries1 = new ArrayList<>();
    countries1.add("Japan");
    countries1.add("United States");
    countries1.add("South Korea");
    countries1.add("China");
    countries1.add("United Kingdom");

    Terminal terminal11 = new Terminal("South Terminal",2,stfs,Country.JAPAN);
    Airline airline1 = new JapanAirlines("Japan Airlines","JA","Tokyo",true,flights11,countries1,Cuisine.TRADITIONAL_JAPANESE);
    Aircraft air11  = new Helicopters(manYear2," Boeing 747",186,1968,"Queen of the Skies",15000 );

    Gate gate_a1 = new Gate("Gate A1");

    List<Airline> listOfAirlines = new ArrayList<>();
    listOfAirlines.add(airline1);

    try {
      airline1.setAirline("Japan Airlines","JA","Tokyo");
      air11.setPassengerCapacity(186);
      fly22.setFlight("JA978","Boston","Tokyo",2500);
      gate_a1.setGate("Gate A1");
      staff11.setStaff("sharon",26,36000);
    } catch (AircraftException e) {
      logger.error("Passenger capacity cannot be negative.", e);
    } catch (AirlineException e) {
      logger.error("Name cannot be null or empty", e);
    } catch (FlightException e) {
      logger.error("Destination cannot be null or empty", e);
    } catch (AirportStaffException e) {
      logger.error("Invalid input provided", e);
    } catch (GateException e) {
      logger.error("There was a network error", e);
    }

    // add Terminal to the linked list
    Terminal terminal22 = new Terminal("South Terminal",2,stfs,Country.USA);

    // add Flight to the list of flights
    Flight flight11 = new Flight("SA917","Nashville","Boston",400);



    System.out.println("List of Terminals:" + terminal11);
    System.out.println("List of Airlines:" + listOfAirlines);
    System.out.println("List of Staffs:" + stfs);



    logger.info("\n Welcome to the Airport Calculations\n");
    Calendar cal = Calendar.getInstance();
    cal.set(Calendar.DATE, 12);
    Date manYear = cal.getTime();

    Staff staff1 = new MaintenanceStaff("John",26,200,1,StaffRole.ROLE1);
    Staff staff2 = new MaintenanceStaff("Sharon",30,300,1,StaffRole.ROLE2);
    List<Staff> stf = new ArrayList<>();
    stf.add(staff1);

    List<Staff> stf2 = new ArrayList<>();
    stf2.add(staff2);

    Terminal terminal = new Terminal("South Terminal",2,stf, Country.USA); //local has staff for local airport
    List<Terminal> term1 = new ArrayList<>();
    term1.add(terminal);

    Terminal terminal2 = new Terminal("Terminal 1",4,stf2,Country.JAPAN); //international has the staff for international airport
    List<Terminal> term2 = new ArrayList<>();
    term2.add(terminal2);



    Aircraft air  = new CommercialJet(manYear,"Boeing 747",186,1968,"Queen of the Skies",307600,
        CommercialJetType.TYPE1 );
    List<Aircraft> air2 = new ArrayList<>();
    air2.add(air);
    Flight fly = new Flight("SA917","Nashville","Boston",400);
    Flight fly2 = new Flight("JAL678","Tokyo","Boston",2500);
    List<Flight> flights = new ArrayList<>();
    flights.add(fly2);
    List<Flight> localFlight = new ArrayList<>();
    localFlight.add(fly);
    List<String> countries = new ArrayList<>();
    countries.add("Japan");
    countries.add("United States");
    countries.add("South Korea");
    countries.add("China");
    countries.add("United Kingdom");
    Airline airair = new JapanAirlines("Japan Airlines","JA","Tokyo",true,flights,countries,Cuisine.TRADITIONAL_JAPANESE);
    Airline airair2 = new SouthwestAirlines("Southwest Airline","SA","Texas",false,localFlight, 50 ,TierStatus.GOLD);
    List<Airline> airline = new ArrayList<>();
    airline.add(airair2);
    List<Airline> airlineInternational = new ArrayList<>();
    airlineInternational.add(airair);
    Flight flight1 = new Flight("SA917","Nashville","Boston",400);
    List<Flight> listOfFlightsForGate = new ArrayList<>();
    listOfFlightsForGate.add(flight1);
    Gate gate = new Gate("GateA1",listOfFlightsForGate,true,200.0,200.0,300.0); //local
    List<Gate> gate1 = new ArrayList<>();
    gate1.add(gate);
    Gate gate2 = new Gate("GateB",flights,true,800.0,500.0,800.0);//international
    List<Gate> gate3 = new ArrayList<>();
    gate3.add(gate2);

    logger.info("\n Welcome to the  Heliport, Regional, Private Airport\n");
    List<Aircraft> heli = new ArrayList<>();
    Aircraft airHeli  = new Helicopters(manYear," Boeing 747",186,1968,"Queen of the Skies",15000 );
    heli.add(airHeli);
    List<Aircraft> commJet = new ArrayList<>();
    Aircraft airCj = new CommercialJet(manYear," Boeing 747",186,1968,"Queen of the Skies",307600,CommercialJetType.TYPE1);
    commJet.add(airCj);
    AbstractAirport aHeliport = new Heliport("London Heliport", "United Kingdom",heli,term1,airline,gate1,stf);
    AbstractAirport aRegional = new RegionalAirport("Manchester-Boston Regional Airport","United States",commJet,term1,airline,gate1,"MHT");
    AbstractAirport aPrivate = new PrivateAirport("Teterboro Airport","New Jersey United States",commJet,term1,airline,gate1," Port Authority of New York and New Jersey");
    System.out.println("Heliport: " + aHeliport + "\nRegional Airport:" + aRegional + "\nPrivate Airport: " + aPrivate);

    Predicate<CommercialJet> isOlderThan = jet -> {
      int currentYear = Calendar.getInstance().get(Calendar.YEAR);
      int age = currentYear - jet.getMaintanceCostOfYearNeeded();
      return age > 10;
    };
    CommercialJet cj = new CommercialJet(manYear," Boeing 747",186,1968,"Queen of the Skies",307600,CommercialJetType.TYPE1);
    System.out.println(isOlderThan.test(cj));
    Consumer<CommercialJet> printName = jet -> System.out.println(jet.getNameOfAircraft());
    printName.accept(cj);
    Function<CommercialJet, String> ageToString = jet -> {
      int currentYear = Calendar.getInstance().get(Calendar.YEAR);
      int age = currentYear - jet.getMaintanceCostOfYearNeeded();
      return "The age of the " + jet.getNameOfAircraft() + " is " + age + " years old.";
    };
    System.out.println(ageToString.apply(cj));
    Supplier<CommercialJet> createJet = () -> {
      Calendar calen = Calendar.getInstance();
      calen.set(Calendar.DATE, 20);
      Date manYears = calen.getTime();
      return new CommercialJet(manYears,"Boeing 747",186,1969,"King of the Skies",307600,CommercialJetType.TYPE1);
    };
    System.out.println(createJet.get());
    BinaryOperator<CommercialJet> addPassengerCapacity = (jet1, jet2) -> {
      int totalCapacity = jet1.getPassengerCapacity() + jet2.getPassengerCapacity();
      return new CommercialJet(jet1.getManufactureYear(), jet1.getModel(), totalCapacity, jet1.getMaintanceCostOfYearNeeded(), jet1.getNameOfAircraft() + " and " + jet2.getNameOfAircraft(),307600,CommercialJetType.TYPE1);
    };
    System.out.println(addPassengerCapacity.apply(cj,createJet.get()));






    AbstractAirport airport = new DomesticAirport("Berry Field Nashville","Nashville",air2,term1,airline,gate1,"BNA");
    AbstractAirport airport2 = new InternationalAirport("Haneda Airport","Tokyo",air2,term2,airlineInternational,gate3,"HND");

    System.out.println("\n======Commercial Airport financial information======");
    logger.info("\n======Commercial Airport financial information======");
    System.out.println(airport);
    System.out.println(airport2);
    System.out.println("\n=====So the airport ends up getting commission on the tickets sold for each airline which about 15%====");
    double commission1 = (0.15 * fly.getPrice());//local
    double commission2 = (fly2.getPrice() * 0.15);//international
    System.out.println("Commission for one ticket on Southwest airline in the domestic airport: $" + commission1);
    System.out.println("Commission for one ticket on Japan airlines in the international airport : $" + commission2);
    double extraRev = commission1 * air.getPassengerCapacity(); //SA
    double extraRev2 = commission2 * air.getPassengerCapacity();//JA

    System.out.println("Commercial jet landing fee: $" + air.getLandingFee());
    //the aircraft landing fee refers to the specific fee charged for the aircraft's landing
    //the airport landing fee is a more comprehensive term that includes all the charges related to the use of the airport by the aircraft.
    double sum = airport2.getLandingFee() + air.getLandingFee(); //international
    double sum2 = airport.getLandingFee() + air.getLandingFee(); //local
    System.out.println("Total landing fee for domestic airport:  $" + sum2);
    System.out.println("Total landing fee for international airport:  $" + sum);
    double sumTotal = gate.calculateTotalExpenses() + staff1
        .getSalary();
    double sumTotal2 = gate2.calculateTotalExpenses() + staff2.getSalary();
    System.out.println("Total expense for domestic airport:  $" + sumTotal);
    System.out.println("Total expense fee for international airport:  $" + sumTotal2);
    double totalRev = sum + extraRev2; //international
    double totalRev2 = sum2 + extraRev; //local
    System.out.println("Total revenue for domestic airport:  $" + totalRev2);
    System.out.println("Total revenue fee for international airport:  $" + totalRev);
    double rev = totalRev2 - sumTotal2;
    double rev2 = totalRev - sumTotal;
    System.out.println("Expense balance for domestic airport:  $" + rev);
    System.out.println("Expense balance for international airport:  $" + rev2);

    System.out.println("\n=======Airline Cost======");
    logger.info("\n=======Airline Cost======");
    double ticketPriceForSA = fly.getPrice() * air.getPassengerCapacity();
    double ticketPriceForJA = fly2.getPrice() * air.getPassengerCapacity();
    double airlineCost = ticketPriceForSA - air.getMaintenanceCost(2023);
    double airlineCost2 = ticketPriceForJA - air.getMaintenanceCost(2023);
    System.out.println("Total deficit for in one flight for SA: $" + airlineCost  + " ->The deficit will be gone once we take into account other flights by Southwest airlines");
    System.out.println("Total deficit for in one flight for JA: $" + airlineCost2  + " ->The deficit will be gone once we take into account other flights by Japan airlines");





    StringWriter sw = new StringWriter();
    PrintWriter pw = new PrintWriter(sw);

    pw.println("\n======Commercial Airport info======");
    pw.println(airport);
    pw.println(airport2);
    pw.println("Commercial jet landing fee: $" + air.getLandingFee());
    double sum3 = airport2.getLandingFee() + air.getLandingFee();
    double sum4 = airport.getLandingFee() + air.getLandingFee();
    pw.println("Total landing fee for domestic airport:  $" + sum4);
    pw.println("Total landing fee for international airport:  $" + sum3);

    File getFile = new File("src/main/resources/airportInfo.txt") ; //file to write into

    try {
      FileUtils.writeStringToFile(getFile, sw.toString(), "UTF-8"); //send it to new file
    } catch (IOException e) {
      e.printStackTrace();
    }



    Thread thread1 = new Thread(new Flight(fly));
    Thread thread2 = new Thread(new Flight(fly2));

    thread1.start();
    thread2.start();

    try {
      thread1.join(); // Wait for thread1 to complete
      thread2.join(); // Wait for thread2 to complete
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    // Perform further actions after both threads have completed
    System.out.println("All threads have completed.");


    // Create an instance of the Airline class using reflection
    Class<?> airlineClass = null;
    try {
      airlineClass = Class.forName("com.laba.solvd.a2.airline.JapanAirlines");
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
    Constructor<?> constructor = null;
    try {
      constructor = airlineClass.getConstructor(String.class, String.class, String.class);
    } catch (NoSuchMethodException e) {
      e.printStackTrace();
    }
    Airline airlineInstance = null;
    try {
      try {
        airlineInstance = (Airline) constructor.newInstance("JapanAirline", "JAL123", "Tokyo");
      } catch (InstantiationException | InvocationTargetException e) {
        e.printStackTrace();
      }
    } catch (IllegalAccessException e) {
      e.printStackTrace();
    }

    // Call a method using reflection
    Method setNameMethod = null;
    try {
      setNameMethod = airlineClass.getMethod("setName", String.class);
    } catch (NoSuchMethodException e) {
      e.printStackTrace();
    }
    try {
      setNameMethod.invoke(airlineInstance, "NewAirlineName");
    } catch (IllegalAccessException | InvocationTargetException e) {
      e.printStackTrace();
    }

    // Access fields using reflection
//    Field[] fields = airlineClass.getDeclaredFields();
//    for (Field field : fields) {
//      field.setAccessible(true);
//      System.out.println("Field Name: " + field.getName());
//      System.out.println("Field Type: " + field.getType());
//      try {
//        System.out.println("Field Value: " + field.get(airlineInstance));
//      } catch (IllegalAccessException e) {
//        e.printStackTrace();
//      }
//      System.out.println();
//    }


    Field[] fields = airlineClass.getDeclaredFields();
    Airline finalAirlineInstance = airlineInstance;
    Arrays.stream(fields)
        .forEach(field -> {
          field.setAccessible(true);
          System.out.println("Field Name: " + field.getName());
          System.out.println("Field Type: " + field.getType());
          try {
            System.out.println("Field Value: " + field.get(finalAirlineInstance));
          } catch (IllegalAccessException e) {
            e.printStackTrace();
          }
          System.out.println();
        });



    // Perform 7 collection streaming operations
    List<Flight> flights3 = new ArrayList<>();
    flights3.add(new Flight("SA917","Nashville","Boston",400));
    flights3.add(new Flight("JAL678","Tokyo","Boston",2500));
    flights3.add(new Flight("AA012","NewYork","Texas",500));
    flights3.add(new Flight("DA0958","Oregon","Georgia",400));
    flights3.add(new Flight("BA768","London","Boston",2500));

    // 1. Filtering flights that contain the letter 't' in their name
    List<Flight> filteredFlights = flights.stream()
        .filter(flight -> flight.getFlghtname().contains("A"))
        .collect(Collectors.toList());
    System.out.println("Filtered Flights: " + filteredFlights);

    // 2. Mapping flight names to uppercase
    List<String> flightNames = flights.stream()
        .map(Flight::getFlghtname)
        .map(String::toUpperCase)
        .collect(Collectors.toList());
    System.out.println("Flight Names: " + flightNames);

    // 3. Checking if any flight name starts with 'J'
    boolean anyFlightStartsWithF = flights.stream()
        .anyMatch(flight -> flight.getFlghtname().startsWith("J"));
    System.out.println("Any flight starts with 'J': " + anyFlightStartsWithF);

    // 4. Checking if all flight names contain the letter '7'
    boolean allFlightsContainI = flights.stream()
        .allMatch(flight -> flight.getFlghtname().contains("7"));
    System.out.println("All flight names contain '7': " + allFlightsContainI);

    // 5. Finding the first flight with a name length greater than 7
    Flight firstLongFlight = flights.stream()
        .filter(flight -> flight.getFlghtname().length() > 7)
        .findFirst()
        .orElse(null);
    System.out.println("First long flight: " + firstLongFlight);

    // 6. Counting the number of flights
    long flightCount = flights.stream()
        .count();
    System.out.println("Number of flights: " + flightCount);

    // 7. Concatenating all flight names into a single string
    String flightNamesConcatenated = flights.stream()
        .map(Flight::getFlghtname)
        .reduce("", (name1, name2) -> name1 + " " + name2);
    System.out.println("Flight names concatenated: " + flightNamesConcatenated);


    logger.info("\nShowing Gate Field, Constructor and Method\n");
    Class<?> gateClass = Gate.class;
    Constructor<?> constructor2 = null;
    try {
      constructor2 = gateClass.getConstructor(String.class, List.class, Boolean.class,
          Double.class, Double.class, Double.class);
    } catch (NoSuchMethodException e) {
      e.printStackTrace();
    }
    List<Flight> flightsGate = new ArrayList<>();
    flightsGate.add(new Flight("SA917","Nashville","Boston",400));
    flightsGate.add(new Flight("JAL678","Tokyo","Boston",2500));
    Gate gateInstance = null;
    try {
      gateInstance = (Gate) constructor2.newInstance("Gate1", flights, true, 100.0, 50.0, 75.0);
    } catch (InstantiationException e) {
      e.printStackTrace();
    } catch (IllegalAccessException e) {
      e.printStackTrace();
    } catch (InvocationTargetException e) {
      e.printStackTrace();
    }
    System.out.println(gateInstance);

    // Use reflection to call the setOpen method
    Method setOpenMethod = null;
    try {
      setOpenMethod = gateClass.getDeclaredMethod("setOpen", Boolean.class);
    } catch (NoSuchMethodException e) {
      e.printStackTrace();
    }
    try {
      setOpenMethod.invoke(gateInstance, false);
    } catch (IllegalAccessException e) {
      e.printStackTrace();
    } catch (InvocationTargetException e) {
      e.printStackTrace();
    }
    System.out.println(gateInstance.getOpen());

    // Extract information about fields
    Field[] fields2 = gateClass.getDeclaredFields();
    Gate finalGateInstance = gateInstance;
    Arrays.stream(fields2)
        .forEach(field -> {
          field.setAccessible(true);
          System.out.println("Field name: " + field.getName());
          System.out.println("Field type: " + field.getType().getSimpleName());
          System.out.println("Field modifiers: " + Modifier.toString(field.getModifiers()));
          try {
            System.out.println("Field Value: " + field.get(finalGateInstance));
          } catch (IllegalAccessException e) {
            e.printStackTrace();
          }
          System.out.println();
        });


    // Extract information about constructors
    Constructor<?>[] constructors = gateClass.getDeclaredConstructors();
    Arrays.stream(constructors)
        .forEach(ctor -> {
          System.out.println("Constructor name: " + ctor.getName());
          System.out.println("Constructor parameters: ");
          Parameter[] parameters = ctor.getParameters();
          Arrays.stream(parameters)
              .forEach(parameter -> {
                System.out.println(parameter.getType().getSimpleName() + " " + parameter.getName());
              });
          System.out.println();
        });


    // Extract information about methods
    Method[] methods = gateClass.getDeclaredMethods();
    Arrays.stream(methods)
        .forEach(method -> {
          System.out.println("Method name: " + method.getName());
          System.out.println("Method return type: " + method.getReturnType().getSimpleName());
          System.out.println("Method parameters: ");
          Parameter[] parameters = method.getParameters();
          Arrays.stream(parameters)
              .forEach(parameter -> {
                System.out.println(parameter.getType().getSimpleName() + " " + parameter.getName());
              });
          System.out.println();
        });



  }

}
