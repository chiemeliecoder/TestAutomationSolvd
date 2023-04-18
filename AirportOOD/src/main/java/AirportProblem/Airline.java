package AirportProblem;

import AirportProblem.AbstractAirport;
import java.util.List;
import java.util.Objects;

public abstract class Airline extends AbstractAirport {
  protected String airlineName;
  private String code;
  private String countryOfOrigin;
  private int foundingYear;
  private int fleetSize;
  private int numFleet;

  /** This is the Airline abstract class and its parent arguments are inherited to its constructor
   * it has its getters and setters for its arguments below
   * @param airlineName the name of the airline
   * @param code the code of the airline
   * @param countryOfOrigin the country of origin of the airline
   * @param foundingYear year the airline was founded
   * @param fleetSize the fleet size of the aircraft that belongs to the airline
   * @param numFleet number of fleets the airline has
   */
  public Airline(String name, String location, int numRunways, String airportCode,
      String airlines, int numTerminals, boolean isInternational, String airlineName,
      String code, String countryOfOrigin, int foundingYear, int fleetSize, int numFleet) {
    super(name, location, numRunways, airportCode, airlines, numTerminals, isInternational);
    this.airlineName = airlineName;
    this.code = code;
    this.countryOfOrigin = countryOfOrigin;
    this.foundingYear = foundingYear;
    this.fleetSize = fleetSize;
    this.numFleet = numFleet;
  }

  public String getAirlineName() {
    return airlineName;
  }

  public void setAirlineName(String airlineName) {
    this.airlineName = airlineName;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getCountryOfOrigin() {
    return countryOfOrigin;
  }

  public void setCountryOfOrigin(String countryOfOrigin) {
    this.countryOfOrigin = countryOfOrigin;
  }

  public int getFoundingYear() {
    return foundingYear;
  }

  public void setFoundingYear(int foundingYear) {
    this.foundingYear = foundingYear;
  }

  public int getFleetSize() {
    return fleetSize;
  }

  public void setFleetSize(int fleetSize) {
    this.fleetSize = fleetSize;
  }

  public int getNumFleet() {
    return numFleet;
  }

  public void setNumFleet(int numFleet) {
    this.numFleet = numFleet;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Airline)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    Airline airline = (Airline) o;
    return getFoundingYear() == airline.getFoundingYear() && getFleetSize() == airline
        .getFleetSize()
        && getNumFleet() == airline.getNumFleet() && getAirlineName()
        .equals(airline.getAirlineName())
        && getCode().equals(airline.getCode()) && getCountryOfOrigin()
        .equals(airline.getCountryOfOrigin());
  }

  @Override
  public int hashCode() {
    return Objects
        .hash(super.hashCode(), getAirlineName(), getCode(), getCountryOfOrigin(),
            getFoundingYear(),
            getFleetSize(), getNumFleet());
  }
}
