package com.laba.solvd.A2.Airline;

import com.laba.solvd.A2.Airline.Airline;

public class SouthwestAirlines extends Airline {

  public SouthwestAirlines(String name, String airlineCode, String headquarters, boolean isGlobal) {
    super(name, airlineCode, headquarters, isGlobal);
  }

  @Override
  public Boolean isGlobal() {
    return super.isGlobal();
  }

  @Override
  public String toString() {
    return "SouthwestAirlines{" +
        "name='" + name + '\'' +
        '}';
  }
}
