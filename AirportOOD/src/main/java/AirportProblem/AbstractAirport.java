package AirportProblem;

import java.util.List;
import java.util.Objects;

/**Using protected access modifier for instance variables is a way to make them accessible to subclasses,
 * while still keeping them hidden from other classes in the package or outside the package.
 * This is useful when you want to provide certain data or functionality to the subclasses, but not to the outside world.
 */

public abstract class AbstractAirport implements IAirport{
  protected String name;
  protected String location;
  private int numRunways;
  private String airportCode;
  private String airlines;
  private int numTerminals;
  private boolean isInternational;

  /**This an airport class with an interface that interacts with the client to get the airport name
   * while behind there are a lot of information concerning that airport
   * */


  /**
   * Airport Constructor
   * @param name name of airport
   * @param location location of airport
   * @param numRunways number of runways of the airport
   * @param airportCode airport code
   * @param airlines airline
   * @param numTerminals number of terminals in the airport
   * @param isInternational is it a domestic or international flight
   */
  public AbstractAirport(String name, String location, int numRunways, String airportCode,
      String airlines, int numTerminals, boolean isInternational) {
    this.name = name;
    this.location = location;
    this.numRunways = numRunways;
    this.airportCode = airportCode;
    this.airlines = airlines;
    this.numTerminals = numTerminals;
    this.isInternational = isInternational;
  }

  //gets the name of the airport
  public String getName() {
    return name;
  }

  //sets the name of the airport
  public void setName(String name) {
    this.name = name;
  }

  //gets the location of the airport
  public String getLocation() {
    return location;
  }

  //sets the location of the airport
  public void setLocation(String location) {
    this.location = location;
  }

  //gets number of runways in the airport
  public int getNumRunways() {
    return numRunways;
  }

  public void setNumRunways(int numRunways) {
    this.numRunways = numRunways;
  }

  //gets number of runways in the airport
  public String getAirportCode() {
    return airportCode;
  }

  //sets the airport code like BNA
  public void setAirportCode(String airportCode) {
    this.airportCode = airportCode;
  }

  //gets the airlines in the airport
  public String getAirlines() {
    return airlines;
  }

  //sets the airlines
  public void setAirlines(String airlines) {
    this.airlines = airlines;
  }

  //gets the number of terminals of the airport
  public int getNumTerminals() {
    return numTerminals;
  }

  //sets the number of terminals of the airport
  public void setNumTerminals(int numTerminals) {
    this.numTerminals = numTerminals;
  }

  //checks if there are international flights
  public boolean isInternational() {
    return isInternational;
  }

  public void setInternational(boolean international) {
    isInternational = international;
  }

  /**
   * method to get the Airport name
   *
   * @param name
   * @return get the airport name
   */
  @Override
  public String getAirport(String name) {
    return this.name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof AbstractAirport)) {
      return false;
    }
    AbstractAirport that = (AbstractAirport) o;
    return getNumRunways() == that.getNumRunways() && getNumTerminals() == that.getNumTerminals()
        && isInternational() == that.isInternational() && getName().equals(that.getName())
        && getLocation().equals(that.getLocation()) && getAirportCode()
        .equals(that.getAirportCode())
        && getAirlines().equals(that.getAirlines());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getName(), getLocation(), getNumRunways(), getAirportCode(), getAirlines(),
        getNumTerminals(), isInternational());
  }

  @Override
  public String toString() {
    return "AbstractAirport{" +
        "name='" + name + '\'' +
        ", location='" + location + '\'' +
        ", numRunways=" + numRunways +
        ", airportCode='" + airportCode + '\'' +
        ", airlines='" + airlines + '\'' +
        ", numTerminals=" + numTerminals +
        ", isInternational=" + isInternational +
        '}';
  }
}
