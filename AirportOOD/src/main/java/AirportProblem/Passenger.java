package AirportProblem;

import AirportProblem.Flight;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Passenger extends Flight {
  protected String PassengerName;
  private String passportNumber;
  private int age;
  private String address;
  private String phoneNumber;
  private boolean isFrequentFlyer;

  /**This is the passenger class and its parent arguments are inherited to its constructor
   * it has its getters and setters for its arguments below
   * @param passengerName name of passenger of the flight
   * @param passportNumber the passengers passport number
   * @param age age of the passenger
   * @param address address of passenger
   * @param phoneNumber passenger's phone number
   * @param isFrequentFlyer is the passenger a frequent flyer true or false
   */
  public Passenger(String name, String location, int numRunways, String airportCode,
      String airlines, int numTerminals, boolean isInternational, String airlineName,
      String code, String countryOfOrigin, int foundingYear, int fleetSize, int numFleet,
      String flightNumber, int maxPassengers, String departureAirport,
      String arrivalAirport, Date departureTime, Date arrivalTime, String passengerName,
      String passportNumber, int age, String address, String phoneNumber, boolean isFrequentFlyer) {
    super(name, location, numRunways, airportCode, airlines, numTerminals, isInternational,
        airlineName, code, countryOfOrigin, foundingYear, fleetSize, numFleet, flightNumber,
        maxPassengers, departureAirport, arrivalAirport, departureTime, arrivalTime);
    PassengerName = passengerName;
    this.passportNumber = passportNumber;
    this.age = age;
    this.address = address;
    this.phoneNumber = phoneNumber;
    this.isFrequentFlyer = isFrequentFlyer;
  }

  public String getPassengerName() {
    return PassengerName;
  }

  public void setPassengerName(String passengerName) {
    PassengerName = passengerName;
  }

  public String getPassportNumber() {
    return passportNumber;
  }

  public void setPassportNumber(String passportNumber) {
    this.passportNumber = passportNumber;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public boolean isFrequentFlyer() {
    return isFrequentFlyer;
  }

  public void setFrequentFlyer(boolean frequentFlyer) {
    isFrequentFlyer = frequentFlyer;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Passenger)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    Passenger passenger = (Passenger) o;
    return getAge() == passenger.getAge() && isFrequentFlyer() == passenger.isFrequentFlyer()
        && getPassengerName().equals(passenger.getPassengerName()) && getPassportNumber()
        .equals(passenger.getPassportNumber()) && getAddress().equals(passenger.getAddress())
        && getPhoneNumber().equals(passenger.getPhoneNumber());
  }

  @Override
  public int hashCode() {
    return Objects
        .hash(super.hashCode(), getPassengerName(), getPassportNumber(), getAge(), getAddress(),
            getPhoneNumber(), isFrequentFlyer());
  }

  @Override
  public String toString() {
    return "Passenger{" +
        "PassengerName='" + PassengerName + '\'' +
        ", passportNumber='" + passportNumber + '\'' +
        ", age=" + age +
        ", address='" + address + '\'' +
        ", phoneNumber='" + phoneNumber + '\'' +
        ", isFrequentFlyer=" + isFrequentFlyer +
        '}';
  }
}
