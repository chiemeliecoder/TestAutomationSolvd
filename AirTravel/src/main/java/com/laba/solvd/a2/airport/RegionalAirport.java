package com.laba.solvd.a2.airport;

import com.laba.solvd.a2.aircraft.Aircraft;
import com.laba.solvd.a2.airline.Airline;
import com.laba.solvd.a2.gate.Gate;
import com.laba.solvd.a2.terminal.Terminal;
import java.util.List;
import java.util.Objects;

public class RegionalAirport extends AbstractAirport {
  private String regionalAirportCode;
  private double landingFee = 500.0;

  public RegionalAirport(String nameAirport, String location,
      List<Aircraft> listOfAircraft,
      List<Terminal> listOfTerminal, List<Airline> listOfAirline,
      List<Gate> gateList, String regionalAirportCode) {
    super(nameAirport, location, listOfAircraft, listOfTerminal, listOfAirline, gateList);
    this.regionalAirportCode = regionalAirportCode;
  }

  public String getRegionalAirportCode() {
    return regionalAirportCode;
  }

  public void setRegionalAirportCode(String regionalAirportCode) {
    this.regionalAirportCode = regionalAirportCode;
  }

  @Override
  public Double getLandingFee() {

    return landingFee;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof RegionalAirport)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    RegionalAirport that = (RegionalAirport) o;
    return Double.compare(that.getLandingFee(), getLandingFee()) == 0
        && getRegionalAirportCode().equals(that.getRegionalAirportCode());
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), getRegionalAirportCode(), getLandingFee());
  }

  @Override
  public String toString() {
    return "RegionalAirport{" +
        "nameAirport='" + nameAirport + '\'' +
        ", location='" + location + '\'' +
        ", regionalAirportCode='" + regionalAirportCode + '\'' +
        ", landingFee=" + landingFee +
        '}';
  }
}
