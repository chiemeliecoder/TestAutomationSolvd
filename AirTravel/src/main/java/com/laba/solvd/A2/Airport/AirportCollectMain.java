package com.laba.solvd.A2.Airport;

import com.laba.solvd.A2.Aircraft.Aircraft;
import com.laba.solvd.A2.Aircraft.Helicopters;
import com.laba.solvd.A2.Airline.Airline;
import com.laba.solvd.A2.Airline.JapanAirlines;
import com.laba.solvd.A2.CustomExceptions.AircraftException;
import com.laba.solvd.A2.CustomExceptions.AirlineException;
import com.laba.solvd.A2.CustomExceptions.AirportStaffException;
import com.laba.solvd.A2.CustomExceptions.FlightException;
import com.laba.solvd.A2.CustomExceptions.GateException;
import com.laba.solvd.A2.Flight.Flight;
import com.laba.solvd.A2.Gate.Gate;
import com.laba.solvd.A2.Staff.MaintenanceStaff;
import com.laba.solvd.A2.Staff.Staff;
import com.laba.solvd.A2.Terminal.Terminal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.apache.log4j.Logger;

public class AirportCollectMain {
  private static final Logger logger = Logger.getLogger(AirportCollectMain.class);

  public static void main(String [] args) throws GateException {
    logger.info("\n Welcome to Airport\n");
    System.out.println("=====Airport Information=====");
    // create an instance of AirportCollections

    Calendar cal = Calendar.getInstance();
    cal.set(Calendar.DATE, 12);
    Date manYear = cal.getTime();

    AirportCollections airport = new AirportCollections();
    Staff staff1 = new MaintenanceStaff( "John",26,36000,10);
    List<Staff> stf = new ArrayList<>();
    stf.add(staff1);
    Terminal terminal1 = new Terminal("South Terminal",2,stf);
    Airline airline1 = new JapanAirlines("Japan Airlines","JA","Tokyo",true);
    Aircraft air  = new Helicopters(manYear," Boeing 747",186,1968,"Queen of the Skies");
    Flight fly = new Flight("JA978","Boston","Tokyo",2500);
    Gate gate_a1 = new Gate("Gate A1");

    try {
      airline1.setAirline("Japan Airlines","JA","Tokyo");
      air.setPassengerCapacity(186);
      fly.setFlight("JA978","Boston","Tokyo",2500);
      gate_a1.setGate("Gate A1");
      staff1.setStaff("John",26,36000);
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
    Terminal terminal = new Terminal("South Terminal",2,stf);
    airport.add(terminal);

    // add Flight to the list of flights
    Flight flight1 = new Flight("SA917","Nashville","Boston",400);
    airport.addFlight(flight1);

    List<Flight> listOfFlightsForGate = airport.getListOfFlights();
    // add Gate to the list of gates
    Gate gate1 = new Gate("GateA1",listOfFlightsForGate,true);
    airport.addGate(gate1);



    // get the list of flights and gates
    List<Flight> listOfFlights = airport.getListOfFlights();
    List<Gate> listOfGates = airport.getListOfGates();
    MyLinkedList<Terminal> listOfTerminals = airport.getLinkedList();


    // print the list of flights and gates
    System.out.println("List of flights: " + listOfFlights);
    System.out.println("List of gates: " + listOfGates);
    System.out.println("List of Terminals:" + terminal);

  }

}
