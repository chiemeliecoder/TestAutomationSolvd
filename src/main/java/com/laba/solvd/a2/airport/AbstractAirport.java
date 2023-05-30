package com.laba.solvd.a2.airport;

import com.laba.solvd.a2.aircraft.Aircraft;
import com.laba.solvd.a2.airline.Airline;
import com.laba.solvd.a2.interfaces.IAirport;
import com.laba.solvd.a2.gate.Gate;
import com.laba.solvd.a2.terminal.Terminal;
import java.util.List;
import java.util.Objects;

public abstract class AbstractAirport implements IAirport {
  protected String nameAirport;
  protected String location;
  private List<Aircraft> listOfAircraft;
  private List<Terminal> listOfTerminal;
  private List<Airline> listOfAirline;
  private List<Gate> gateList;

  public AbstractAirport(String nameAirport, String location,
      List<Aircraft> listOfAircraft,
      List<Terminal> listOfTerminal, List<Airline> listOfAirline,
      List<Gate> gateList) {
    this.nameAirport = nameAirport;
    this.location = location;
    this.listOfAircraft = listOfAircraft;
    this.listOfTerminal = listOfTerminal;
    this.listOfAirline = listOfAirline;
    this.gateList = gateList;
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

  public List<Aircraft> getListOfAircraft() {
    return listOfAircraft;
  }

  public void setListOfAircraft(List<Aircraft> listOfAircraft) {
    this.listOfAircraft = listOfAircraft;
  }

  public List<Terminal> getListOfTerminal() {
    return listOfTerminal;
  }

  public void setListOfTerminal(List<Terminal> listOfTerminal) {
    this.listOfTerminal = listOfTerminal;
  }

  public List<Airline> getListOfAirline() {
    return listOfAirline;
  }

  public void setListOfAirline(List<Airline> listOfAirline) {
    this.listOfAirline = listOfAirline;
  }

  public List<Gate> getGateList() {
    return gateList;
  }

  public void setGateList(List<Gate> gateList) {
    this.gateList = gateList;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof AbstractAirport)) {
      return false;
    }
    AbstractAirport airport = (AbstractAirport) o;
    return getNameAirport().equals(airport.getNameAirport()) && getLocation()
        .equals(airport.getLocation()) && getListOfAircraft().equals(airport.getListOfAircraft())
        && getListOfTerminal().equals(airport.getListOfTerminal()) && getListOfAirline()
        .equals(airport.getListOfAirline()) && getGateList().equals(airport.getGateList());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getNameAirport(), getLocation(), getListOfAircraft(), getListOfTerminal(),
        getListOfAirline(), getGateList());
  }

  @Override
  public String toString() {
    return "AbstractAirport{" +
        "nameAirport='" + nameAirport + '\'' +
        ", location='" + location + '\'' +
        ", listOfAircraft=" + listOfAircraft +
        ", listOfTerminal=" + listOfTerminal +
        ", listOfAirline=" + listOfAirline +
        ", gateList=" + gateList +
        '}';
  }
}
