package AirportProblem;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Baggage extends Passenger {
  private int weight;
  private String tagNumber;
  private Passenger owner;
  private Flight flight;
  private Gate gate;


  /**This is the Baggage class and its parent arguments are inherited to its constructor
   * it has its getters and setters for its arguments below
   * @param weight the wight of the baggage
   * @param tagNumber the tagnumber associated with the baggage
   * @param owner the owner of the baggage
   * @param flight the flight the baggage was on
   * @param gate the gate of the flight
   */
  public Baggage(String name, String location, int numRunways, String airportCode,
      String airlines, int numTerminals, boolean isInternational, String airlineName,
      String code, String countryOfOrigin, int foundingYear, int fleetSize, int numFleet,
      String flightNumber, int maxPassengers, String departureAirport,
      String arrivalAirport, Date departureTime, Date arrivalTime, String passengerName,
      String passportNumber, int age, String address, String phoneNumber, boolean isFrequentFlyer,
      int weight, String tagNumber, Passenger owner, Flight flight, Gate gate) {
    super(name, location, numRunways, airportCode, airlines, numTerminals, isInternational,
        airlineName, code, countryOfOrigin, foundingYear, fleetSize, numFleet, flightNumber,
        maxPassengers, departureAirport, arrivalAirport, departureTime, arrivalTime, passengerName,
        passportNumber, age, address, phoneNumber, isFrequentFlyer);
    this.weight = weight;
    this.tagNumber = tagNumber;
    this.owner = owner;
    this.flight = flight;
    this.gate = gate;
  }

  public int getWeight() {
    return weight;
  }

  public void setWeight(int weight) {
    this.weight = weight;
  }

  public String getTagNumber() {
    return tagNumber;
  }

  public void setTagNumber(String tagNumber) {
    this.tagNumber = tagNumber;
  }

  public Passenger getOwner() {
    return owner;
  }

  public void setOwner(Passenger owner) {
    this.owner = owner;
  }

  public Flight getFlight() {
    return flight;
  }

  public void setFlight(Flight flight) {
    this.flight = flight;
  }

  public Gate getGate() {
    return gate;
  }

  public void setGate(Gate gate) {
    this.gate = gate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Baggage)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    Baggage baggage = (Baggage) o;
    return getWeight() == baggage.getWeight() && getTagNumber().equals(baggage.getTagNumber())
        && getOwner().equals(baggage.getOwner()) && getFlight().equals(baggage.getFlight())
        && getGate().equals(baggage.getGate());
  }

  @Override
  public int hashCode() {
    return Objects
        .hash(super.hashCode(), getWeight(), getTagNumber(), getOwner(), getFlight(), getGate());
  }

  @Override
  public String toString() {
    return "Baggage{" +
        "airlineName='" + airlineName + '\'' +
        ", weight=" + weight +
        ", tagNumber='" + tagNumber + '\'' +
        ", owner=" + owner +
        ", flight=" + flight +
        ", gate=" + gate +
        ", flightNumber='" + flightNumber + '\'' +
        '}';
  }
}
