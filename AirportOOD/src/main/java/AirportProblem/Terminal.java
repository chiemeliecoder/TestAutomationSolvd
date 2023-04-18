package AirportProblem;

import AirportProblem.AbstractAirport;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Terminal extends AbstractAirport {
  protected String terminalName;
  protected int numOfGates;
  private boolean isTerminalInternational;
  private int maxCapacity;
  private String amenities;
  private double sizeInSquareFeet;
  private String flights;


  /**This is the Terminal abstract class and its parent arguments are inherited to its constructor
   * it has its getters and setters for its arguments below
   * @param terminalName the terminal name
   * @param numOfGates number of gates there are in the airport
   * @param isTerminalInternational is the current terminal for international travel
   * @param maxCapacity max capacity of that terminal
   * @param amenities amenities or restaurants at the terminal
   * @param sizeInSquareFeet the size of terminal in square footage
   * @param flights the flight that is at that terminal
   */
  public Terminal(String name, String location, int numRunways, String airportCode,
      String airlines, int numTerminals, boolean isInternational, String terminalName,
      int numOfGates,
      boolean isTerminalInternational, int maxCapacity, String amenities, double sizeInSquareFeet,
      String flights) {
    super(name, location, numRunways, airportCode, airlines, numTerminals, isInternational);
    this.terminalName = terminalName;
    this.numOfGates = numOfGates;
    this.isTerminalInternational = isTerminalInternational;
    this.maxCapacity = maxCapacity;
    this.amenities = amenities;
    this.sizeInSquareFeet = sizeInSquareFeet;
    this.flights = flights;
  }

  public String getTerminalName() {
    return terminalName;
  }

  public void setTerminalName(String terminalName) {
    this.terminalName = terminalName;
  }

  public int getNumOfGates() {
    return numOfGates;
  }

  public void setNumOfGates(int numOfGates) {
    this.numOfGates = numOfGates;
  }

  public boolean isTerminalInternational() {
    return isTerminalInternational;
  }

  public void setTerminalInternational(boolean terminalInternational) {
    isTerminalInternational = terminalInternational;
  }

  public int getMaxCapacity() {
    return maxCapacity;
  }

  public void setMaxCapacity(int maxCapacity) {
    this.maxCapacity = maxCapacity;
  }

  public String getAmenities() {
    return amenities;
  }

  public void setAmenities(String amenities) {
    this.amenities = amenities;
  }

  public double getSizeInSquareFeet() {
    return sizeInSquareFeet;
  }

  public void setSizeInSquareFeet(double sizeInSquareFeet) {
    this.sizeInSquareFeet = sizeInSquareFeet;
  }

  public String getFlights() {
    return flights;
  }

  public void setFlights(String flights) {
    this.flights = flights;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Terminal)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    Terminal terminal = (Terminal) o;
    return getNumOfGates() == terminal.getNumOfGates() && isTerminalInternational() == terminal
        .isTerminalInternational() && getMaxCapacity() == terminal.getMaxCapacity()
        && Double.compare(terminal.getSizeInSquareFeet(), getSizeInSquareFeet()) == 0
        && getTerminalName().equals(terminal.getTerminalName()) && getAmenities()
        .equals(terminal.getAmenities()) && getFlights().equals(terminal.getFlights());
  }

  @Override
  public int hashCode() {
    return Objects
        .hash(super.hashCode(), getTerminalName(), getNumOfGates(), isTerminalInternational(),
            getMaxCapacity(), getAmenities(), getSizeInSquareFeet(), getFlights());
  }
}
