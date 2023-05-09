package com.laba.solvd.A2.Airport;

import com.laba.solvd.A2.Aircraft.Aircraft;
import com.laba.solvd.A2.Airline.Airline;
import com.laba.solvd.A2.Gate.Gate;
import com.laba.solvd.A2.Terminal.Terminal;
import java.util.List;
import java.util.Objects;

public class PrivateAirport extends AbstractAirport {
  private String owner;
  private double landingFee = 2000.0;

  public PrivateAirport(String nameAirport, String location,
      List<Aircraft> listOfAircraft,
      List<Terminal> listOfTerminal, List<Airline> listOfAirline,
      List<Gate> gateList, String owner) {
    super(nameAirport, location, listOfAircraft, listOfTerminal, listOfAirline, gateList);
    this.owner = owner;
  }

  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
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
    if (!(o instanceof PrivateAirport)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    PrivateAirport that = (PrivateAirport) o;
    return Double.compare(that.getLandingFee(), getLandingFee()) == 0 && getOwner()
        .equals(that.getOwner());
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), getOwner(), getLandingFee());
  }

  @Override
  public String toString() {
    return "PrivateAirport{" +
        "nameAirport='" + nameAirport + '\'' +
        ", location='" + location + '\'' +
        ", owner='" + owner + '\'' +
        ", landingFee=" + landingFee +
        '}';
  }
}
