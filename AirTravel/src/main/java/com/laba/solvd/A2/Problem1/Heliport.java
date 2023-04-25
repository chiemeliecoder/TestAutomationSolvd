package com.laba.solvd.A2.Problem1;

import java.util.List;
import java.util.Objects;

public class Heliport extends AbstractAirport {
  private List<String> listOfLandingPads;
  private List<String> listOfHelicopterTypes;
  private Integer maximumTakeoffWeight;
  private Integer fuelStorageCapacity;
  private List<String> groundCrew;

  public Heliport(String nameAirport,String location, String airportCode, Integer numAircraft,
      Integer sizeAirport, Terminal terminal, Flight flight,
      List<String> listOfLandingPads, List<String> listOfHelicopterTypes,
      Integer maximumTakeoffWeight, Integer fuelStorageCapacity,
      List<String> groundCrew) {
    super(nameAirport,location, airportCode, numAircraft, sizeAirport, terminal, flight);
    this.listOfLandingPads = listOfLandingPads;
    this.listOfHelicopterTypes = listOfHelicopterTypes;
    this.maximumTakeoffWeight = maximumTakeoffWeight;
    this.fuelStorageCapacity = fuelStorageCapacity;
    this.groundCrew = groundCrew;
  }

  public List<String> getListOfLandingPads() {
    return listOfLandingPads;
  }

  public void setListOfLandingPads(List<String> listOfLandingPads) {
    this.listOfLandingPads = listOfLandingPads;
  }

  public List<String> getListOfHelicopterTypes() {
    return listOfHelicopterTypes;
  }

  public void setListOfHelicopterTypes(List<String> listOfHelicopterTypes) {
    this.listOfHelicopterTypes = listOfHelicopterTypes;
  }

  public Integer getMaximumTakeoffWeight() {
    return maximumTakeoffWeight;
  }

  public void setMaximumTakeoffWeight(Integer maximumTakeoffWeight) {
    this.maximumTakeoffWeight = maximumTakeoffWeight;
  }

  public Integer getFuelStorageCapacity() {
    return fuelStorageCapacity;
  }

  public void setFuelStorageCapacity(Integer fuelStorageCapacity) {
    this.fuelStorageCapacity = fuelStorageCapacity;
  }

  public List<String> getGroundCrew() {
    return groundCrew;
  }

  public void setGroundCrew(List<String> groundCrew) {
    this.groundCrew = groundCrew;
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
    if (!(o instanceof Heliport)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    Heliport heliport = (Heliport) o;
    return getListOfLandingPads().equals(heliport.getListOfLandingPads())
        && getListOfHelicopterTypes().equals(heliport.getListOfHelicopterTypes())
        && getMaximumTakeoffWeight().equals(heliport.getMaximumTakeoffWeight())
        && getFuelStorageCapacity().equals(heliport.getFuelStorageCapacity()) && getGroundCrew()
        .equals(heliport.getGroundCrew());
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), getListOfLandingPads(), getListOfHelicopterTypes(),
        getMaximumTakeoffWeight(), getFuelStorageCapacity(), getGroundCrew());
  }

  @Override
  public String toString() {
    return "Heliport{" +
        "nameAirport='" + nameAirport + '\'' +
        ", location='" + location + '\'' +
        ", listOfLandingPads=" + listOfLandingPads +
        ", listOfHelicopterTypes=" + listOfHelicopterTypes +
        ", maximumTakeoffWeight=" + maximumTakeoffWeight +
        ", fuelStorageCapacity=" + fuelStorageCapacity +
        ", groundCrew=" + groundCrew +
        '}';
  }
}
