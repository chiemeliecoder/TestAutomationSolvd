package com.laba.solvd.a2.airline;

import com.laba.solvd.a2.enums.TierStatus;
import com.laba.solvd.a2.flight.Flight;
import java.util.List;
import java.util.Objects;

public class SouthwestAirlines extends DomesticAirline {

  private TierStatus tierStatus;

  public SouthwestAirlines(String name, String airlineCode, String headquarters, boolean isGlobal,
      List<Flight> priceOfFlight, Integer numOfRoutes,
      TierStatus tierStatus) {
    super(name, airlineCode, headquarters, isGlobal, priceOfFlight, numOfRoutes);
    this.tierStatus = tierStatus;
  }

  // Method to set the member's tier status
  public void setTierStatus(TierStatus tierStatus) {
    this.tierStatus = tierStatus;
  }

  // Method to get the member's tier status
  public TierStatus getTierStatus() {
    return tierStatus;
  }


  @Override
  public Boolean isGlobal() {
    return false;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof SouthwestAirlines)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    SouthwestAirlines that = (SouthwestAirlines) o;
    return getTierStatus() == that.getTierStatus();
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), getTierStatus());
  }

  @Override
  public String toString() {
    return "SouthwestAirlines{" +
        "name='" + name + '\'' +
        ", tierStatus=" + tierStatus +
        '}';
  }
}
