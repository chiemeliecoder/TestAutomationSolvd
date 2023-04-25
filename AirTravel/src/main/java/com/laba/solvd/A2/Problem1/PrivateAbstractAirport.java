package com.laba.solvd.A2.Problem1;

import java.util.List;
import java.util.Objects;

public class PrivateAbstractAirport extends AbstractAirport {
  private Integer numPrivateAirport;
  private String owner;
  private Double RunwayLength;
  private Integer hangarCapacity;
  private List<String> listOfTenants;

  public PrivateAbstractAirport(String nameAirport,String location, String airportCode, Integer numAircraft,
      Integer sizeAirport, Terminal terminal, Flight flight, Integer numPrivateAirport,
      String owner, Double runwayLength, Integer hangarCapacity,
      List<String> listOfTenants) {
    super(nameAirport,location, airportCode, numAircraft, sizeAirport, terminal, flight);
    this.numPrivateAirport = numPrivateAirport;
    this.owner = owner;
    RunwayLength = runwayLength;
    this.hangarCapacity = hangarCapacity;
    this.listOfTenants = listOfTenants;
  }

  public Integer getNumPrivateAirport() {
    return numPrivateAirport;
  }

  public void setNumPrivateAirport(Integer numPrivateAirport) {
    this.numPrivateAirport = numPrivateAirport;
  }

  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public Double getRunwayLength() {
    return RunwayLength;
  }

  public void setRunwayLength(Double runwayLength) {
    RunwayLength = runwayLength;
  }

  public Integer getHangarCapacity() {
    return hangarCapacity;
  }

  public void setHangarCapacity(Integer hangarCapacity) {
    this.hangarCapacity = hangarCapacity;
  }

  public List<String> getListOfTenants() {
    return listOfTenants;
  }

  public void setListOfTenants(List<String> listOfTenants) {
    this.listOfTenants = listOfTenants;
  }

  @Override
  public Integer numOfAirport() {
    return null;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof PrivateAbstractAirport)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    PrivateAbstractAirport that = (PrivateAbstractAirport) o;
    return getNumPrivateAirport().equals(that.getNumPrivateAirport()) && getOwner()
        .equals(that.getOwner()) && getRunwayLength().equals(that.getRunwayLength())
        && getHangarCapacity().equals(that.getHangarCapacity()) && getListOfTenants()
        .equals(that.getListOfTenants());
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), getNumPrivateAirport(), getOwner(), getRunwayLength(),
        getHangarCapacity(), getListOfTenants());
  }

  @Override
  public String toString() {
    return "PrivateAbstractAirport{" +
        "nameAirport='" + nameAirport + '\'' +
        ", location='" + location + '\'' +
        ", numPrivateAirport=" + numPrivateAirport +
        ", owner='" + owner + '\'' +
        ", RunwayLength=" + RunwayLength +
        ", hangarCapacity=" + hangarCapacity +
        ", listOfTenants=" + listOfTenants +
        '}';
  }
}
