package AirportProblem;

import java.util.List;
import java.util.Objects;

public class Gate extends Terminal {
  private int number;
  private Airline airline;
  private Flight flight;
  private String gateGroup;
  private boolean isOpen;


  /**Its the constructor for Gate and its parent arguments are inherited to its constructor
   * it has its getters and setters for its arguments below
   * @param number number of gates
   * @param airline the airlines associated with the gates
   * @param flight the flight at the gate
   * @param gateGroup the gate group either ABCD
   * @param isOpen is the gate open
   */
  public Gate(String name, String location, int numRunways, String airportCode,
      String airlines, int numTerminals, boolean isInternational, String terminalName,
      int numOfGates,
      boolean isTerminalInternational, int maxCapacity, String amenities, double sizeInSquareFeet,
      String flights, int number, Airline airline, Flight flight, String gateGroup,
      boolean isOpen) {
    super(name, location, numRunways, airportCode, airlines, numTerminals, isInternational,
        terminalName, numOfGates, isTerminalInternational, maxCapacity, amenities, sizeInSquareFeet,
        flights);
    this.number = number;
    this.airline = airline;
    this.flight = flight;
    this.gateGroup = gateGroup;
    this.isOpen = isOpen;
  }

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public Airline getAirline() {
    return airline;
  }

  public void setAirline(Airline airline) {
    this.airline = airline;
  }

  public Flight getFlight() {
    return flight;
  }

  public void setFlight(Flight flight) {
    this.flight = flight;
  }

  public String getGateGroup() {
    return gateGroup;
  }

  public void setGateGroup(String gateGroup) {
    this.gateGroup = gateGroup;
  }

  public boolean isOpen() {
    return isOpen;
  }

  public void setOpen(boolean open) {
    isOpen = open;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Gate)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    Gate gate = (Gate) o;
    return getNumber() == gate.getNumber() && isOpen() == gate.isOpen() && getAirline()
        .equals(gate.getAirline()) && getFlight().equals(gate.getFlight()) && getGateGroup()
        .equals(gate.getGateGroup());
  }

  @Override
  public int hashCode() {
    return Objects
        .hash(super.hashCode(), getNumber(), getAirline(), getFlight(), getGateGroup(), isOpen());
  }

  @Override
  public String toString() {
    return "Gate{" +
        "number=" + number +
        ", airline=" + airline +
        ", flight=" + flight +
        ", gateGroup='" + gateGroup + '\'' +
        ", isOpen=" + isOpen +
        ", terminalName='" + terminalName + '\'' +
        ", numOfGates=" + numOfGates +
        '}';
  }
}
