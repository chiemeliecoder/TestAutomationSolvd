package com.laba.solvd.a2.aircraft;

import com.laba.solvd.a2.enums.CommercialJetType;
import com.laba.solvd.a2.exceptions.AircraftException;
import java.util.Date;
import java.util.Objects;

public class CommercialJet extends Aircraft {

  private Integer cargoCapacity;
  private CommercialJetType jetType;

  private static final double LANDING_FEE = 1500.0;
  private static final double MAINTENANCE_COST_PER_YEAR = 50000.0;

  public CommercialJet(Date manufactureYear, String model, Integer passengerCapacity,
      Integer yearToCalculateAgeOfAircraft, String nameOfAircraft) {
    super(manufactureYear, model, passengerCapacity, yearToCalculateAgeOfAircraft, nameOfAircraft);
  }

  public CommercialJet(Date manufactureYear, String model, Integer passengerCapacity,
      Integer yearToCalculateAgeOfAircraft, String nameOfAircraft, Integer cargoCapacity,CommercialJetType jetType) {
    super(manufactureYear, model, passengerCapacity, yearToCalculateAgeOfAircraft, nameOfAircraft);
    this.cargoCapacity = cargoCapacity;
    this.jetType = jetType;
  }


  public CommercialJetType getJetType() {
    return jetType;
  }

  public void setJetType(CommercialJetType jetType) {
    this.jetType = jetType;
    this.cargoCapacity = jetType.getCargoCapacity();
  }

  public Integer getCargoCapacity() {
    return cargoCapacity;
  }

  public void setCargoCapacity(Integer cargoCapacity) {
    this.cargoCapacity = cargoCapacity;
  }


  @Override
  public void setPassengerCapacity(Integer passengerCapacity) throws AircraftException {
    super.setPassengerCapacity(passengerCapacity);
  }

  @Override
  public Double getLandingFee() {
    return LANDING_FEE;
  }

  @Override
  public Double getMaintenanceCost(int year) {
    int ageOfAircraft = year - yearToCalculateAgeOfAircraft;
    return MAINTENANCE_COST_PER_YEAR * ageOfAircraft;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof CommercialJet)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    CommercialJet that = (CommercialJet) o;
    return getCargoCapacity().equals(that.getCargoCapacity()) && getJetType() == that.getJetType();
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), getCargoCapacity(), getJetType());
  }

  @Override
  public String toString() {
    return "CommercialJet{" +
        "model='" + model + '\'' +
        ", yearToCalculateAgeOfAircraft=" + yearToCalculateAgeOfAircraft +
        ", cargoCapacity=" + cargoCapacity +
        ", jetType=" + jetType +
        '}';
  }
}
