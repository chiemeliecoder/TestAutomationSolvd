package com.laba.solvd.A2.Airline;

import com.laba.solvd.A2.CustomExceptions.AirlineException;
import com.laba.solvd.A2.CustomInterfaces.IAirline;
import java.util.Objects;

public abstract class Airline implements IAirline {
  //name code
  protected String name;
  private String airlineCode;
  private String headquarters;
  private boolean isGlobal;

  public Airline(String name, String airlineCode, String headquarters){
    this.name = name;
    this.airlineCode = airlineCode;
    this.headquarters = headquarters;
  }

  public Airline(String name, String airlineCode, String headquarters, boolean isGlobal) {
    this.name = name;
    this.airlineCode = airlineCode;
    this.headquarters = headquarters;
    this.isGlobal = isGlobal;
  }

  public void setAirline(String name, String airlineCode, String headquarters) throws AirlineException {
    if (name == null || name.isEmpty()) {
      throw new AirlineException("Name cannot be null or empty");
    }
    if (airlineCode == null || airlineCode.isEmpty()) {
      throw new AirlineException("Airline code cannot be null or empty");
    }
    if (headquarters == null || headquarters.isEmpty()) {
      throw new AirlineException("Headquarters cannot be null or empty");
    }

  };

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAirlineCode() {
    return airlineCode;
  }

  public void setAirlineCode(String airlineCode) {
    this.airlineCode = airlineCode;
  }

  public String getHeadquarters() {
    return headquarters;
  }

  public void setHeadquarters(String headquarters) {
    this.headquarters = headquarters;
  }

  @Override
  public Boolean isGlobal() {
    return isGlobal;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Airline)) {
      return false;
    }
    Airline airline = (Airline) o;
    return name.equals(airline.name) && airlineCode.equals(airline.airlineCode) && headquarters
        .equals(airline.headquarters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, airlineCode, headquarters);
  }

  @Override
  public String toString() {
    return "Airline{" +
        "name='" + name + '\'' +
        ", airlineCode='" + airlineCode + '\'' +
        ", headquarters='" + headquarters + '\'' +
        '}';
  }
}
