package com.laba.solvd.A2.Problem1;

import java.util.Date;
import java.util.Objects;

public abstract class Aircraft implements IAircraft{
  //takeoff fly, land altitude speed name model manufacture year
  private Date manufactureYear;
  private String model;
  private String name;
  private Integer altitude;
  private Integer passengerCapacity;

  public Aircraft(Date manufactureYear, String model, String name, Integer altitude,
      Integer passengerCapacity) {
    this.manufactureYear = manufactureYear;
    this.model = model;
    this.name = name;
    this.altitude = altitude;
    this.passengerCapacity = passengerCapacity;
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

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getAltitude() {
    return altitude;
  }

  public void setAltitude(Integer altitude) {
    this.altitude = altitude;
  }

  public Integer getPassengerCapacity() {
    return passengerCapacity;
  }

  public void setPassengerCapacity(Integer passengerCapacity) {
    this.passengerCapacity = passengerCapacity;
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
        .equals(aircraft.getModel()) && getName().equals(aircraft.getName()) && getAltitude()
        .equals(aircraft.getAltitude()) && getPassengerCapacity()
        .equals(aircraft.getPassengerCapacity());
  }

  @Override
  public int hashCode() {
    return Objects
        .hash(getManufactureYear(), getModel(), getName(), getAltitude(), getPassengerCapacity());
  }

  @Override
  public String toString() {
    return "Aircraft{" +
        "manufactureYear=" + manufactureYear +
        ", model='" + model + '\'' +
        ", name='" + name + '\'' +
        ", altitude=" + altitude +
        ", passengerCapacity=" + passengerCapacity +
        '}';
  }
}
