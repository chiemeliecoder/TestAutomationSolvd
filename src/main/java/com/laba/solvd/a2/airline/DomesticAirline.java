package com.laba.solvd.a2.airline;

import com.laba.solvd.a2.flight.Flight;
import java.util.List;
import java.util.Objects;

public abstract class DomesticAirline extends Airline{

  private Integer numOfRoutes;

  public DomesticAirline(String name, String airlineCode, String headquarters, boolean isGlobal,
      List<Flight> priceOfFlight, Integer numOfRoutes) {
    super(name, airlineCode, headquarters, isGlobal, priceOfFlight);
    this.numOfRoutes = numOfRoutes;
  }

  public Integer getNumOfRoutes() {
    return numOfRoutes;
  }

  public void setNumOfRoutes(Integer numOfRoutes) {
    this.numOfRoutes = numOfRoutes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof DomesticAirline)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    DomesticAirline that = (DomesticAirline) o;
    return getNumOfRoutes().equals(that.getNumOfRoutes());
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), getNumOfRoutes());
  }

  @Override
  public String toString() {
    return "DomesticAirline{" +
        "name='" + name + '\'' +
        ", numOfRoutes=" + numOfRoutes +
        '}';
  }
}
