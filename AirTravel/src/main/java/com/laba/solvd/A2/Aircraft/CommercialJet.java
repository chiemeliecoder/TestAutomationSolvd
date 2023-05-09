package com.laba.solvd.A2.Aircraft;

import java.util.Date;
import java.util.Objects;

public class CommercialJet extends Aircraft {

  private String nameOfCommercialAircraft;
  private static final double LANDING_FEE = 1500.0;
  private static final double MAINTENANCE_COST_PER_YEAR = 50000.0;

  public CommercialJet(Date manufactureYear, String model, Integer passengerCapacity,
      Integer yearToCalculateAgeOfAircraft, String nameOfCommercialAircraft) {
    super(manufactureYear, model, passengerCapacity, yearToCalculateAgeOfAircraft);
    this.nameOfCommercialAircraft = nameOfCommercialAircraft;
  }

  public String getNameOfCommercialAircraft() {
    return nameOfCommercialAircraft;
  }

  public void setNameOfCommercialAircraft(String nameOfCommercialAircraft) {
    this.nameOfCommercialAircraft = nameOfCommercialAircraft;
  }

  @Override
  public Double getLandingFee() {
    return LANDING_FEE;
  }

  @Override
  public Double getMaintenanceCost() {
    int ageOfAircraft = 2023 - yearToCalculateAgeOfAircraft;
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
    return getNameOfCommercialAircraft().equals(that.getNameOfCommercialAircraft());
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), getNameOfCommercialAircraft());
  }

  @Override
  public String toString() {
    return "CommercialJet{" +
        "model='" + model + '\'' +
        ", yearToCalculateAgeOfAircraft=" + yearToCalculateAgeOfAircraft +
        ", nameOfCommercialAircraft='" + nameOfCommercialAircraft + '\'' +
        '}';
  }
}
