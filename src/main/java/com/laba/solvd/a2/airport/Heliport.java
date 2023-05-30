package com.laba.solvd.a2.airport;

import com.laba.solvd.a2.aircraft.Aircraft;
import com.laba.solvd.a2.airline.Airline;
import com.laba.solvd.a2.gate.Gate;
import com.laba.solvd.a2.staff.Staff;
import com.laba.solvd.a2.terminal.Terminal;
import java.util.List;
import java.util.Objects;

public class Heliport extends AbstractAirport {
  private List<Staff> groundCrew;
  private double landingFee = 100.0;

  public Heliport(String nameAirport, String location,
      List<Aircraft> listOfAircraft,
      List<Terminal> listOfTerminal, List<Airline> listOfAirline,
      List<Gate> gateList, List<Staff> groundCrew) {
    super(nameAirport, location, listOfAircraft, listOfTerminal, listOfAirline, gateList);
    this.groundCrew = groundCrew;
  }

  public List<Staff> getGroundCrew() {
    return groundCrew;
  }

  public void setGroundCrew(List<Staff> groundCrew) {
    this.groundCrew = groundCrew;
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
    if (!(o instanceof Heliport)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    Heliport heliport = (Heliport) o;
    return Double.compare(heliport.getLandingFee(), getLandingFee()) == 0 && getGroundCrew()
        .equals(heliport.getGroundCrew());
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), getGroundCrew(), getLandingFee());
  }

  @Override
  public String toString() {
    return "Heliport{" +
        "nameAirport='" + nameAirport + '\'' +
        ", location='" + location + '\'' +
        ", groundCrew=" + groundCrew +
        ", landingFee=" + landingFee +
        '}';
  }
}
