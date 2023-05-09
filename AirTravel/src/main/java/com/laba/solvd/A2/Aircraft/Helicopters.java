package com.laba.solvd.A2.Aircraft;

import java.util.Date;
import java.util.Objects;

public class Helicopters extends Aircraft {
  private String nameOfAircraft;
  private static final double LANDING_FEE = 100.0;
  private static final double MAINTENANCE_COST_PER_YEAR = 20000.0;

  public Helicopters(Date manufactureYear, String model, Integer passengerCapacity,
      Integer yearToCalculateAgeOfAircraft, String nameOfAircraft) {
    super(manufactureYear, model, passengerCapacity, yearToCalculateAgeOfAircraft);
    this.nameOfAircraft = nameOfAircraft;
  }

  public String getNameOfAircraft() {
    return nameOfAircraft;
  }

  public void setNameOfAircraft(String nameOfAircraft) {
    this.nameOfAircraft = nameOfAircraft;
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
    if (!(o instanceof Helicopters)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    Helicopters that = (Helicopters) o;
    return getNameOfAircraft().equals(that.getNameOfAircraft());
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), getNameOfAircraft());
  }

  @Override
  public String toString() {
    return "Helicopters{" +
        "model='" + model + '\'' +
        ", yearToCalculateAgeOfAircraft=" + yearToCalculateAgeOfAircraft +
        ", nameOfAircraft='" + nameOfAircraft + '\'' +
        '}';
  }
}
