package AirportProblem;

import AirportProblem.Airline;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Flight extends Airline {
  protected String flightNumber;
  private int maxPassengers;
  private String departureAirport;
  private String arrivalAirport;
  private Date departureTime;
  private Date arrivalTime;


  /**This is the Flight class and its parent arguments are inherited to its constructor
   * it has its getters and setters for its arguments below
   * @param numFleet number of fleet for the flight
   * @param flightNumber what the flight number is
   * @param maxPassengers max of passenger for the flight
   * @param departureAirport the airport the flight departed from
   * @param arrivalAirport the airport the flight arrived to
   * @param departureTime the departure time
   * @param arrivalTime the arrival time
   */
  public Flight(String name, String location, int numRunways, String airportCode,
      String airlines, int numTerminals, boolean isInternational, String airlineName,
      String code, String countryOfOrigin, int foundingYear, int fleetSize, int numFleet,
      String flightNumber, int maxPassengers, String departureAirport,
      String arrivalAirport, Date departureTime, Date arrivalTime) {
    super(name, location, numRunways, airportCode, airlines, numTerminals, isInternational,
        airlineName, code, countryOfOrigin, foundingYear, fleetSize, numFleet);
    this.flightNumber = flightNumber;
    this.maxPassengers = maxPassengers;
    this.departureAirport = departureAirport;
    this.arrivalAirport = arrivalAirport;
    this.departureTime = departureTime;
    this.arrivalTime = arrivalTime;
  }

  public String getFlightNumber() {
    return flightNumber;
  }

  public void setFlightNumber(String flightNumber) {
    this.flightNumber = flightNumber;
  }

  public int getMaxPassengers() {
    return maxPassengers;
  }

  public void setMaxPassengers(int maxPassengers) {
    this.maxPassengers = maxPassengers;
  }

  public String getDepartureAirport() {
    return departureAirport;
  }

  public void setDepartureAirport(String departureAirport) {
    this.departureAirport = departureAirport;
  }

  public String getArrivalAirport() {
    return arrivalAirport;
  }

  public void setArrivalAirport(String arrivalAirport) {
    this.arrivalAirport = arrivalAirport;
  }

  public Date getDepartureTime() {
    return departureTime;
  }

  public void setDepartureTime(Date departureTime) {
    this.departureTime = departureTime;
  }

  public Date getArrivalTime() {
    return arrivalTime;
  }

  public void setArrivalTime(Date arrivalTime) {
    this.arrivalTime = arrivalTime;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Flight)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    Flight flight = (Flight) o;
    return getMaxPassengers() == flight.getMaxPassengers() && getFlightNumber()
        .equals(flight.getFlightNumber()) && getDepartureAirport()
        .equals(flight.getDepartureAirport()) && getArrivalAirport()
        .equals(flight.getArrivalAirport()) && getDepartureTime().equals(flight.getDepartureTime())
        && getArrivalTime().equals(flight.getArrivalTime());
  }

  @Override
  public int hashCode() {
    return Objects
        .hash(super.hashCode(), getFlightNumber(), getMaxPassengers(), getDepartureAirport(),
            getArrivalAirport(), getDepartureTime(), getArrivalTime());
  }
}
