package com.laba.solvd.A2.Problem1;

import java.util.List;
import java.util.Objects;

public class InternationalAbstractAirport extends AbstractAirport {
  private Integer numInternationalAirport;
  private List<String> listOfAirlines;
  private Integer numRunways;
  private Integer Taxiways;
  private Integer numCheckInCounters;

  public InternationalAbstractAirport(String nameAirport,String location, String airportCode,
      Integer numAircraft, Integer sizeAirport, Terminal terminal,
      Flight flight, Integer numInternationalAirport, List<String> listOfAirlines,
      Integer numRunways, Integer taxiways, Integer numCheckInCounters) {
    super(nameAirport,location, airportCode, numAircraft, sizeAirport, terminal, flight);
    this.numInternationalAirport = numInternationalAirport;
    this.listOfAirlines = listOfAirlines;
    this.numRunways = numRunways;
    Taxiways = taxiways;
    this.numCheckInCounters = numCheckInCounters;
  }

  public Integer getNumInternationalAirport() {
    return numInternationalAirport;
  }

  public void setNumInternationalAirport(Integer numInternationalAirport) {
    this.numInternationalAirport = numInternationalAirport;
  }

  public List<String> getListOfAirlines() {
    return listOfAirlines;
  }

  public void setListOfAirlines(List<String> listOfAirlines) {
    this.listOfAirlines = listOfAirlines;
  }

  public Integer getNumRunways() {
    return numRunways;
  }

  public void setNumRunways(Integer numRunways) {
    this.numRunways = numRunways;
  }

  public Integer getTaxiways() {
    return Taxiways;
  }

  public void setTaxiways(Integer taxiways) {
    Taxiways = taxiways;
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
    if (!(o instanceof InternationalAbstractAirport)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    InternationalAbstractAirport that = (InternationalAbstractAirport) o;
    return getNumInternationalAirport().equals(that.getNumInternationalAirport())
        && getListOfAirlines().equals(that.getListOfAirlines()) && getNumRunways()
        .equals(that.getNumRunways()) && getTaxiways().equals(that.getTaxiways())
        && getNumCheckInCounters().equals(that.getNumCheckInCounters());
  }

  @Override
  public int hashCode() {
    return Objects
        .hash(super.hashCode(), getNumInternationalAirport(), getListOfAirlines(), getNumRunways(),
            getTaxiways(), getNumCheckInCounters());
  }

  @Override
  public String toString() {
    return "InternationalAbstractAirport{" +
        "nameAirport='" + nameAirport + '\'' +
        ", location='" + location + '\'' +
        ", numInternationalAirport=" + numInternationalAirport +
        ", listOfAirlines=" + listOfAirlines +
        ", numRunways=" + numRunways +
        ", Taxiways=" + Taxiways +
        ", numCheckInCounters=" + numCheckInCounters +
        '}';
  }
}
