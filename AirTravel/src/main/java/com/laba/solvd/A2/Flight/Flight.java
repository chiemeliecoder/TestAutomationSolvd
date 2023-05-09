package com.laba.solvd.A2.Flight;

import com.laba.solvd.A2.CustomExceptions.FlightException;
import java.util.Objects;

public class Flight {
  protected String flghtname;
  private String source;
  private String destination;
  private Integer price;

  public Flight(String flghtname, String source, String destination, Integer price) {

    this.flghtname = flghtname;
    this.source = source;
    this.destination = destination;
    this.price = price;
  }

  public void setFlight(String flghtname, String source, String destination, Integer price) throws FlightException {
    if (flghtname == null || flghtname.isEmpty()) {
      throw new FlightException("Flight name cannot be null or empty");
    }
    if (source == null || source.isEmpty()) {
      throw new FlightException("Source cannot be null or empty");
    }
    if (destination == null || destination.isEmpty()) {
      throw new FlightException("Destination cannot be null or empty");
    }
    if (price == null || price < 0) {
      throw new FlightException("Price must be a positive integer");
    }
  }

  public String getFlghtname() {
    return flghtname;
  }

  public void setFlghtname(String flghtname) {
    this.flghtname = flghtname;
  }

  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public String getDestination() {
    return destination;
  }

  public void setDestination(String destination) {
    this.destination = destination;
  }

  public Integer getPrice() {
    return price;
  }

  public void setPrice(Integer price) {
    this.price = price;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Flight)) {
      return false;
    }
    Flight flight = (Flight) o;
    return getFlghtname().equals(flight.getFlghtname()) && getSource().equals(flight.getSource())
        && getDestination().equals(flight.getDestination()) && getPrice().equals(flight.getPrice());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getFlghtname(), getSource(), getDestination(), getPrice());
  }

  @Override
  public String toString() {
    return "Flight{" +
        "flghtname='" + flghtname + '\'' +
        ", source='" + source + '\'' +
        ", destination='" + destination + '\'' +
        ", price=" + price +
        '}';
  }
}
