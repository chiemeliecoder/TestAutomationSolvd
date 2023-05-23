package com.laba.solvd.a2.airline;

import com.laba.solvd.a2.flight.Flight;
import java.util.List;
import java.util.Objects;

public abstract class InternationalAirline extends Airline{

  private List<String> listOfCountries;

  public InternationalAirline(String name, String airlineCode, String headquarters,
      boolean isGlobal,
      List<Flight> priceOfFlight, List<String> listOfCountries) {
    super(name, airlineCode, headquarters, isGlobal, priceOfFlight);
    this.listOfCountries = listOfCountries;
  }

  public InternationalAirline(String name, String airlineCode, String headquarters) {
    super(name, airlineCode, headquarters);
  }

  public List<String> getListOfCountries() {
    return listOfCountries;
  }

  public void setListOfCountries(List<String> listOfCountries) {
    this.listOfCountries = listOfCountries;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof InternationalAirline)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    InternationalAirline that = (InternationalAirline) o;
    return getListOfCountries().equals(that.getListOfCountries());
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), getListOfCountries());
  }

  @Override
  public String toString() {
    return "InternationalAirline{" +
        "name='" + name + '\'' +
        ", listOfCountries=" + listOfCountries +
        '}';
  }
}
