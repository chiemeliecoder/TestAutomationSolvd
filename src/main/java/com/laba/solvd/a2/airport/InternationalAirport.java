package com.laba.solvd.a2.airport;

import com.laba.solvd.a2.aircraft.Aircraft;
import com.laba.solvd.a2.airline.Airline;
import com.laba.solvd.a2.gate.Gate;
import com.laba.solvd.a2.terminal.Terminal;
import java.util.List;
import java.util.Objects;

public class InternationalAirport extends AbstractAirport {
  private String airportCode;
  private double landingFee = 1000.0;

  public InternationalAirport(String nameAirport, String location,
      List<Aircraft> listOfAircraft,
      List<Terminal> listOfTerminal, List<Airline> listOfAirline,
      List<Gate> gateList, String airportCode) {
    super(nameAirport, location, listOfAircraft, listOfTerminal, listOfAirline, gateList);
    this.airportCode = airportCode;
  }

  public String getAirportCode() {
    return airportCode;
  }

  public void setAirportCode(String airportCode) {
    this.airportCode = airportCode;
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
    if (!(o instanceof InternationalAirport)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    InternationalAirport that = (InternationalAirport) o;
    return Double.compare(that.getLandingFee(), getLandingFee()) == 0 && getAirportCode()
        .equals(that.getAirportCode());
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), getAirportCode(), getLandingFee());
  }

  @Override
  public String toString() {
    return "InternationalAirport{" +
        "nameAirport='" + nameAirport + '\'' +
        ", location='" + location + '\'' +
        ", airportCode='" + airportCode + '\'' +
        ", landingFee=" + landingFee +
        '}';
  }
}
