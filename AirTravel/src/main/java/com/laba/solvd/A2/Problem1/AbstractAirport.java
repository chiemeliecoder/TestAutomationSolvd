package com.laba.solvd.A2.Problem1;

import java.util.Objects;

public abstract class AbstractAirport implements IAirport{
  protected String nameAirport;
  protected String location;
  private String airportCode;
  private Integer numAircraft;
  private Integer sizeAirport;
  private Terminal terminal;
  private Flight flight;

//  public AbstractAirport() {
//  }


  public AbstractAirport(String nameAirport, String location, String airportCode,
      Integer numAircraft, Integer sizeAirport, Terminal terminal,
      Flight flight) {
    this.nameAirport = nameAirport;
    this.location = location;
    this.airportCode = airportCode;
    this.numAircraft = numAircraft;
    this.sizeAirport = sizeAirport;
    this.terminal = terminal;
    this.flight = flight;
  }

  public String getNameAirport() {
    return nameAirport;
  }

  public void setNameAirport(String nameAirport) {
    this.nameAirport = nameAirport;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public String getAirportCode() {
    return airportCode;
  }

  public void setAirportCode(String airportCode) {
    this.airportCode = airportCode;
  }

  public Integer getNumAircraft() {
    return numAircraft;
  }

  public void setNumAircraft(Integer numAircraft) {
    this.numAircraft = numAircraft;
  }

  public Integer getSizeAirport() {
    return sizeAirport;
  }

  public void setSizeAirport(Integer sizeAirport) {
    this.sizeAirport = sizeAirport;
  }

  public Terminal getTerminal() {
    return terminal;
  }

  public void setTerminal(Terminal terminal) {
    this.terminal = terminal;
  }

  public Flight getFlight() {
    return flight;
  }

  public void setFlight(Flight flight) {
    this.flight = flight;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof AbstractAirport)) {
      return false;
    }
    AbstractAirport that = (AbstractAirport) o;
    return getLocation().equals(that.getLocation()) && getAirportCode()
        .equals(that.getAirportCode())
        && getNumAircraft().equals(that.getNumAircraft()) && getSizeAirport()
        .equals(that.getSizeAirport()) && getTerminal().equals(that.getTerminal()) && getFlight()
        .equals(that.getFlight());
  }

  @Override
  public int hashCode() {
    return Objects
        .hash(getLocation(), getAirportCode(), getNumAircraft(), getSizeAirport(), getTerminal(),
            getFlight());
  }

  @Override
  public String toString() {
    return "AbstractAirport{" +
        "nameAirport='" + nameAirport + '\'' +
        ", location='" + location + '\'' +
        ", airportCode='" + airportCode + '\'' +
        ", numAircraft=" + numAircraft +
        ", sizeAirport=" + sizeAirport +
        ", terminal=" + terminal +
        ", flight=" + flight +
        '}';
  }
}
