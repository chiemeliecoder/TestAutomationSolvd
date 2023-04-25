package com.laba.solvd.A2.Problem1;

import java.util.Date;
import java.util.Objects;

public abstract class Airline implements IAirline {
  //name code
  protected String name;
  private String airlineCode;
  private String headquarters;
  private Integer numFleets;
  private Date foundingYear;
  private String ceo;


  public Airline(String name, String airlineCode, String headquarters, Integer numFleets,
      Date foundingYear, String ceo) {
    this.name = name;
    this.airlineCode = airlineCode;
    this.headquarters = headquarters;
    this.numFleets = numFleets;
    this.foundingYear = foundingYear;
    this.ceo = ceo;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAirlineCode() {
    return airlineCode;
  }

  public void setAirlineCode(String airlineCode) {
    this.airlineCode = airlineCode;
  }

  public String getHeadquarters() {
    return headquarters;
  }

  public void setHeadquarters(String headquarters) {
    this.headquarters = headquarters;
  }

  public Integer getNumFleets() {
    return numFleets;
  }

  public void setNumFleets(Integer numFleets) {
    this.numFleets = numFleets;
  }

  public Date getFoundingYear() {
    return foundingYear;
  }

  public void setFoundingYear(Date foundingYear) {
    this.foundingYear = foundingYear;
  }

  public String getCeo() {
    return ceo;
  }

  public void setCeo(String ceo) {
    this.ceo = ceo;
  }

  @Override
  public Boolean global() {
    return null;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Airline)) {
      return false;
    }
    Airline airline = (Airline) o;
    return getName().equals(airline.getName()) && getAirlineCode().equals(airline.getAirlineCode())
        && getHeadquarters().equals(airline.getHeadquarters()) && getNumFleets()
        .equals(airline.getNumFleets()) && getFoundingYear().equals(airline.getFoundingYear())
        && getCeo().equals(airline.getCeo());
  }

  @Override
  public int hashCode() {
    return Objects
        .hash(getName(), getAirlineCode(), getHeadquarters(), getNumFleets(), getFoundingYear(),
            getCeo());
  }

  @Override
  public String toString() {
    return "Airline{" +
        "name='" + name + '\'' +
        ", airlineCode='" + airlineCode + '\'' +
        ", headquarters='" + headquarters + '\'' +
        ", numFleets=" + numFleets +
        ", foundingYear=" + foundingYear +
        ", ceo='" + ceo + '\'' +
        '}';
  }
}
