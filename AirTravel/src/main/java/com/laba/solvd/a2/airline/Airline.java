package com.laba.solvd.a2.airline;

import com.laba.solvd.a2.exceptions.AirlineException;
import com.laba.solvd.a2.interfaces.IAirline;
import com.laba.solvd.a2.flight.Flight;
import java.util.List;
import java.util.Objects;

public abstract class Airline implements IAirline {
  //name code
  protected String name;
  private String airlineCode;
  private String headquarters;
  private boolean isGlobal;
  private List<Flight> priceOfFlight;

  public Airline(String name, String airlineCode, String headquarters){
    this.name = name;
    this.airlineCode = airlineCode;
    this.headquarters = headquarters;
  }

  public Airline(String name, String airlineCode, String headquarters, boolean isGlobal,
      List<Flight> priceOfFlight) {
    this.name = name;
    this.airlineCode = airlineCode;
    this.headquarters = headquarters;
    this.isGlobal = isGlobal;
    this.priceOfFlight = priceOfFlight;
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

  public List<Flight> getPriceOfFlight() {
    return priceOfFlight;
  }

  public void setPriceOfFlight(List<Flight> priceOfFlight) {
    this.priceOfFlight = priceOfFlight;
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
    return isGlobal == airline.isGlobal && getName().equals(airline.getName()) && getAirlineCode()
        .equals(airline.getAirlineCode()) && getHeadquarters().equals(airline.getHeadquarters())
        && getPriceOfFlight().equals(airline.getPriceOfFlight());
  }

  @Override
  public int hashCode() {
    return Objects
        .hash(getName(), getAirlineCode(), getHeadquarters(), isGlobal, getPriceOfFlight());
  }

  @Override
  public String toString() {
    return "Airline{" +
        "name='" + name + '\'' +
        ", airlineCode='" + airlineCode + '\'' +
        ", headquarters='" + headquarters + '\'' +
        ", isGlobal=" + isGlobal +
        ", priceOfFlight=" + priceOfFlight +
        '}';
  }
}
