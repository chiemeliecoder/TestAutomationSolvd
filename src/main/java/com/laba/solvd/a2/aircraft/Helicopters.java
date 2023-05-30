package com.laba.solvd.a2.aircraft;

import java.util.Date;
import java.util.Objects;

public class Helicopters extends Aircraft {


  private static final double LANDING_FEE = 100.0;
  private static final double MAINTENANCE_COST_PER_YEAR = 20000.0;
  private Integer maxAltitude;

  public Helicopters(Date manufactureYear, String model, Integer passengerCapacity,
      Integer yearToCalculateAgeOfAircraft, String nameOfAircraft, Integer maxAltitude) {
    super(manufactureYear, model, passengerCapacity, yearToCalculateAgeOfAircraft, nameOfAircraft);
    this.maxAltitude = maxAltitude;
  }

  public Integer getMaxAltitude() {
    return maxAltitude;
  }

  public void setMaxAltitude(Integer maxAltitude) {
    this.maxAltitude = maxAltitude;
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
    if (!(o instanceof Helicopters)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    Helicopters that = (Helicopters) o;
    return getMaxAltitude().equals(that.getMaxAltitude());
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), getMaxAltitude());
  }

  @Override
  public String toString() {
    return "Helicopters{" +
        "model='" + model + '\'' +
        ", yearToCalculateAgeOfAircraft=" + yearToCalculateAgeOfAircraft +
        ", maxAltitude=" + maxAltitude +
        '}';
  }
}
