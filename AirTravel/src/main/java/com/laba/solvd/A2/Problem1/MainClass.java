package com.laba.solvd.A2.Problem1;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
  public static void main(String[] args) {
    Terminal terminal = new Terminal("South Terminal",2,false,500,"Donkin Donuts",1000000.00);
    Terminal terminal2 = new Terminal("Terminal 1",4,true,800,"Chick Fil-A",2000000.00);
    Flight fly = new Flight("917","SA917","Nashville","Boston",400,178);
    Flight fly2 = new Flight("678","JAL678","Tokyo","New York" ,2500,200);
    List<String> airline = new ArrayList<>();
    airline.add("Southwest Airline");
    List<String> airlineInternational = new ArrayList<>();
    airline.add("Japan Airline");
    AbstractAirport airport = new DomesticAbstractAirport("Berry Field Nashville","Nashville","BNA",80,4555,terminal,fly,1,airline,200,3,10);
    AbstractAirport airport2 = new InternationalAbstractAirport("Haneda Airport","Tokyo","HND",200,66000,terminal2,fly2,1,airlineInternational,5,12,20);

    System.out.println(airport);
    System.out.println(airport2);



  }

}
