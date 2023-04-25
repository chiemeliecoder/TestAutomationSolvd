package com.laba.solvd.A2.Problem1;

import java.util.List;
import java.util.Objects;

public class RegionalAbstractAirport extends AbstractAirport {
  private Integer numRegionalAirport;
  private Double RunwayLength;
  private Integer hangarCapacity;
  private List<String> listOfAirlines;
  private List<String> listOfAircraft;

  public RegionalAbstractAirport(String nameAirport,String location, String airportCode, Integer numAircraft,
      Integer sizeAirport, Terminal terminal, Flight flight, Integer numRegionalAirport,
      Double runwayLength, Integer hangarCapacity, List<String> listOfAirlines,
      List<String> listOfAircraft) {
    super(nameAirport,location, airportCode, numAircraft, sizeAirport, terminal, flight);
    this.numRegionalAirport = numRegionalAirport;
    RunwayLength = runwayLength;
    this.hangarCapacity = hangarCapacity;
    this.listOfAirlines = listOfAirlines;
    this.listOfAircraft = listOfAircraft;
  }

  public Integer getNumRegionalAirport() {
    return numRegionalAirport;
  }

  public void setNumRegionalAirport(Integer numRegionalAirport) {
    this.numRegionalAirport = numRegionalAirport;
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

  public List<String> getListOfAirlines() {
    return listOfAirlines;
  }

  public void setListOfAirlines(List<String> listOfAirlines) {
    this.listOfAirlines = listOfAirlines;
  }

  public List<String> getListOfAircraft() {
    return listOfAircraft;
  }

  public void setListOfAircraft(List<String> listOfAircraft) {
    this.listOfAircraft = listOfAircraft;
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
    if (!(o instanceof RegionalAbstractAirport)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    RegionalAbstractAirport that = (RegionalAbstractAirport) o;
    return getNumRegionalAirport().equals(that.getNumRegionalAirport()) && getRunwayLength()
        .equals(that.getRunwayLength()) && getHangarCapacity().equals(that.getHangarCapacity())
        && getListOfAirlines().equals(that.getListOfAirlines()) && getListOfAircraft()
        .equals(that.getListOfAircraft());
  }

  @Override
  public int hashCode() {
    return Objects
        .hash(super.hashCode(), getNumRegionalAirport(), getRunwayLength(), getHangarCapacity(),
            getListOfAirlines(), getListOfAircraft());
  }

  @Override
  public String toString() {
    return "RegionalAbstractAirport{" +
        "nameAirport='" + nameAirport + '\'' +
        ", location='" + location + '\'' +
        ", numRegionalAirport=" + numRegionalAirport +
        ", RunwayLength=" + RunwayLength +
        ", hangarCapacity=" + hangarCapacity +
        ", listOfAirlines=" + listOfAirlines +
        ", listOfAircraft=" + listOfAircraft +
        '}';
  }
}
