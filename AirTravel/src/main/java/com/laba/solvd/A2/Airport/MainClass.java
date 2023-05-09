package com.laba.solvd.A2.Airport;

import com.laba.solvd.A2.Aircraft.Aircraft;
import com.laba.solvd.A2.Aircraft.Helicopters;
import com.laba.solvd.A2.Airline.Airline;
import com.laba.solvd.A2.Airline.JapanAirlines;
import com.laba.solvd.A2.Airline.SouthwestAirlines;
import com.laba.solvd.A2.CustomExceptions.FlightException;
import com.laba.solvd.A2.Flight.Flight;
import com.laba.solvd.A2.Gate.Gate;
import com.laba.solvd.A2.Staff.MaintenanceStaff;
import com.laba.solvd.A2.Staff.Staff;
import com.laba.solvd.A2.Terminal.Terminal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class MainClass {
  public static void main(String[] args) throws FlightException {
    Calendar cal = Calendar.getInstance();
    cal.set(Calendar.DATE, 12);
    Date manYear = cal.getTime();

    Staff staff1 = new MaintenanceStaff("John",26,36000,10);
    List<Staff> stf = new ArrayList<>();
    stf.add(staff1);

    Terminal terminal = new Terminal("South Terminal",2,stf);
    List<Terminal> term1 = new ArrayList<>();
    term1.add(terminal);
    Terminal terminal2 = new Terminal("Terminal 1",4,stf);
    List<Terminal> term2 = new ArrayList<>();
    term2.add(terminal2);

    Aircraft air  = new Helicopters(manYear," Boeing 747",186,1968,"Queen of the Skies");
    List<Aircraft> air2 = new ArrayList<>();
    air2.add(air);
    Flight fly = new Flight("917","SA917","Nashville",400);
    Flight fly2 = new Flight("678","JAL678","Tokyo",2500);
    Airline airair = new JapanAirlines("Japan Airlines","JA","Tokyo",true);
    Airline airair2 = new SouthwestAirlines("Southwest Airline","SA","Texas",false);
    List<Airline> airline = new ArrayList<>();
    airline.add(airair);
    List<Airline> airlineInternational = new ArrayList<>();
    airlineInternational.add(airair2);
    Flight flight1 = new Flight("SA917","Nashville","Boston",400);
    List<Flight> listOfFlightsForGate = new ArrayList<>();
    listOfFlightsForGate.add(flight1);
    Gate gate = new Gate("GateA1",listOfFlightsForGate,true);
    List<Gate> gate1 = new ArrayList<>();
    gate1.add(gate);

    AbstractAirport airport = new DomesticAirport("Berry Field Nashville","Nashville",air2,term1,airline,gate1,"BNA");
    AbstractAirport airport2 = new InternationalAirport("Haneda Airport","Tokyo",air2,term2,airlineInternational,gate1,"HND");

    System.out.println(airport);
    System.out.println(airport2);



  }

}
