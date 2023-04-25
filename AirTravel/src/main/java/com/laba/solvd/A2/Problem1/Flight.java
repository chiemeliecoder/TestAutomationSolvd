package com.laba.solvd.A2.Problem1;

import java.util.Objects;

public class Flight {
  protected String flightid;
  private String flghtname;
  private String source;
  private String destination;
  private Integer price;
  private Integer capacity;

  public Flight(String flightid, String flghtname, String source, String destination,
      Integer price, Integer capacity) {
    this.flightid = flightid;
    this.flghtname = flghtname;
    this.source = source;
    this.destination = destination;
    this.price = price;
    this.capacity = capacity;
  }

  public String getFlightid() {
    return flightid;
  }

  public void setFlightid(String flightid) {
    this.flightid = flightid;
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

  public Integer getCapacity() {
    return capacity;
  }

  public void setCapacity(Integer capacity) {
    this.capacity = capacity;
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
    return getFlightid().equals(flight.getFlightid()) && getFlghtname()
        .equals(flight.getFlghtname())
        && getSource().equals(flight.getSource()) && getDestination()
        .equals(flight.getDestination())
        && getPrice().equals(flight.getPrice()) && getCapacity().equals(flight.getCapacity());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getFlightid(), getFlghtname(), getSource(), getDestination(), getPrice(),
        getCapacity());
  }


  @Override
  public String toString() {
    return "Flight{" +
        "flightid='" + flightid + '\'' +
        ", flghtname='" + flghtname + '\'' +
        ", source='" + source + '\'' +
        ", destination='" + destination + '\'' +
        ", price=" + price +
        ", capacity=" + capacity +
        '}';
  }
}
