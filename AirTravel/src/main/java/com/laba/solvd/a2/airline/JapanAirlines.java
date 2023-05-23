package com.laba.solvd.a2.airline;

import com.laba.solvd.a2.enums.Cuisine;
import com.laba.solvd.a2.flight.Flight;
import java.util.List;
import java.util.Objects;

public class JapanAirlines extends InternationalAirline {

  private Cuisine cuisineService;

  public JapanAirlines(String name, String airlineCode, String headquarters) {
    super(name, airlineCode, headquarters);
  }

  public JapanAirlines(String name, String airlineCode, String headquarters, boolean isGlobal,
      List<Flight> priceOfFlight, List<String> listOfCountries,
      Cuisine cuisineService) {
    super(name, airlineCode, headquarters, isGlobal, priceOfFlight, listOfCountries);
    this.cuisineService = cuisineService;
  }

  public void setCuisineService(Cuisine cuisineService) {
    this.cuisineService = cuisineService;
  }

  public Cuisine getCuisineService() {
    return cuisineService;
  }

  @Override
  public Boolean isGlobal() {
    return true;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof JapanAirlines)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    JapanAirlines that = (JapanAirlines) o;
    return getCuisineService() == that.getCuisineService();
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), getCuisineService());
  }

  @Override
  public String toString() {
    return "JapanAirlines{" +
        "name='" + name + '\'' +
        ", cuisineService=" + cuisineService +
        '}';
  }
}
