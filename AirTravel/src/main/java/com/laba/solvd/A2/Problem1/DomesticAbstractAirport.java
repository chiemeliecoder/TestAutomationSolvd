package com.laba.solvd.A2.Problem1;

import java.util.List;
import java.util.Objects;

public class DomesticAbstractAirport extends AbstractAirport {
  private Integer numDomesticAirport;
  private List<String> listOfAirlines;
  private Integer baggageHandlers;
  private Integer numRunways;
  private Integer numCheckInCounters;


  public DomesticAbstractAirport(String nameAirport,String location, String airportCode, Integer numAircraft,
      Integer sizeAirport, Terminal terminal, Flight flight, Integer numDomesticAirport,
      List<String> listOfAirlines, Integer baggageHandlers, Integer numRunways,
      Integer numCheckInCounters) {
    super(nameAirport,location, airportCode, numAircraft, sizeAirport, terminal, flight);
    this.numDomesticAirport = numDomesticAirport;
    this.listOfAirlines = listOfAirlines;
    this.baggageHandlers = baggageHandlers;
    this.numRunways = numRunways;
    this.numCheckInCounters = numCheckInCounters;
  }

  public Integer getNumDomesticAirport() {
    return numDomesticAirport;
  }

  public void setNumDomesticAirport(Integer numDomesticAirport) {
    this.numDomesticAirport = numDomesticAirport;
  }

  public List<String> getListOfAirlines() {
    return listOfAirlines;
  }

  public void setListOfAirlines(List<String> listOfAirlines) {
    this.listOfAirlines = listOfAirlines;
  }

  public Integer getBaggageHandlers() {
    return baggageHandlers;
  }

  public void setBaggageHandlers(Integer baggageHandlers) {
    this.baggageHandlers = baggageHandlers;
  }

  public Integer getNumRunways() {
    return numRunways;
  }

  public void setNumRunways(Integer numRunways) {
    this.numRunways = numRunways;
  }

  public Integer getNumCheckInCounters() {
    return numCheckInCounters;
  }

  public void setNumCheckInCounters(Integer numCheckInCounters) {
    this.numCheckInCounters = numCheckInCounters;
  }

  @Override
  public Integer numOfAirport() {
    return null;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof DomesticAbstractAirport)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    DomesticAbstractAirport that = (DomesticAbstractAirport) o;
    return getNumDomesticAirport().equals(that.getNumDomesticAirport()) && getListOfAirlines()
        .equals(that.getListOfAirlines()) && getBaggageHandlers().equals(that.getBaggageHandlers())
        && getNumRunways().equals(that.getNumRunways()) && getNumCheckInCounters()
        .equals(that.getNumCheckInCounters());
  }

  @Override
  public int hashCode() {
    return Objects
        .hash(super.hashCode(), getNumDomesticAirport(), getListOfAirlines(), getBaggageHandlers(),
            getNumRunways(), getNumCheckInCounters());
  }

  @Override
  public String toString() {
    return "DomesticAbstractAirport{" +
        "nameAirport='" + nameAirport + '\'' +
        ", location='" + location + '\'' +
        ", numDomesticAirport=" + numDomesticAirport +
        ", listOfAirlines=" + listOfAirlines +
        ", baggageHandlers=" + baggageHandlers +
        ", numRunways=" + numRunways +
        ", numCheckInCounters=" + numCheckInCounters +
        '}';
  }
}
