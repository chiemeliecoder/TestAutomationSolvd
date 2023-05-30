package com.laba.solvd.a2.aircraft;

import com.laba.solvd.a2.exceptions.AircraftException;
import com.laba.solvd.a2.interfaces.IAircraft;
import java.util.Date;
import java.util.Objects;

public abstract class Aircraft implements IAircraft {
  //yearToCalculateAgeOfAircraft name model manufacture year
  private Date manufactureYear;
  protected String model;
  private Integer passengerCapacity;
  protected Integer yearToCalculateAgeOfAircraft;
  private String nameOfAircraft;

  public Aircraft(Date manufactureYear, String model, Integer passengerCapacity,
      Integer yearToCalculateAgeOfAircraft, String nameOfAircraft) {
    this.manufactureYear = manufactureYear;
    this.model = model;
    this.passengerCapacity = passengerCapacity;
    this.yearToCalculateAgeOfAircraft = yearToCalculateAgeOfAircraft;
    this.nameOfAircraft = nameOfAircraft;
  }

  public Date getManufactureYear() {
    return manufactureYear;
  }

  public void setManufactureYear(Date manufactureYear) {
    this.manufactureYear = manufactureYear;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }


  public Integer getPassengerCapacity() {
    return passengerCapacity;
  }

  public void setPassengerCapacity(Integer passengerCapacity) throws AircraftException {
    if (passengerCapacity < 0) {
      throw new AircraftException("Passenger capacity cannot be negative.");
    }
    this.passengerCapacity = passengerCapacity;
  }

  public Integer getMaintanceCostOfYearNeeded() {
    return yearToCalculateAgeOfAircraft;
  }

  public void setMaintanceCostOfYearNeeded(Integer yearToCalculateAgeOfAircraft) {
    this.yearToCalculateAgeOfAircraft = yearToCalculateAgeOfAircraft;
  }

  public String getNameOfAircraft() {
    return nameOfAircraft;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Aircraft)) {
      return false;
    }
    Aircraft aircraft = (Aircraft) o;
    return getManufactureYear().equals(aircraft.getManufactureYear()) && getModel()
        .equals(aircraft.getModel()) && getPassengerCapacity()
        .equals(aircraft.getPassengerCapacity())
        && yearToCalculateAgeOfAircraft.equals(aircraft.yearToCalculateAgeOfAircraft)
        && getNameOfAircraft().equals(aircraft.getNameOfAircraft());
  }

  @Override
  public int hashCode() {
    return Objects
        .hash(getManufactureYear(), getModel(), getPassengerCapacity(),
            yearToCalculateAgeOfAircraft,
            getNameOfAircraft());
  }


  @Override
  public String toString() {
    return "Aircraft{" +
        "manufactureYear=" + manufactureYear +
        ", model='" + model + '\'' +
        ", passengerCapacity=" + passengerCapacity +
        ", yearToCalculateAgeOfAircraft=" + yearToCalculateAgeOfAircraft +
        ", nameOfAircraft='" + nameOfAircraft + '\'' +
        '}';
  }
}
