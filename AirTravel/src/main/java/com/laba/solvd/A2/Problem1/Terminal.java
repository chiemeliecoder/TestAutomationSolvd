package com.laba.solvd.A2.Problem1;

import java.util.Objects;

public class Terminal {
  protected String terminalName;
  private Integer numOfGates;
  private Boolean isTerminalInternational;
  private Integer maxCapacity;
  private String amenities;
  private Double sizeInSquareFeet;

  public Terminal(String terminalName, Integer numOfGates, Boolean isTerminalInternational,
      Integer maxCapacity, String amenities, Double sizeInSquareFeet) {
    this.terminalName = terminalName;
    this.numOfGates = numOfGates;
    this.isTerminalInternational = isTerminalInternational;
    this.maxCapacity = maxCapacity;
    this.amenities = amenities;
    this.sizeInSquareFeet = sizeInSquareFeet;
  }

  public String getTerminalName() {
    return terminalName;
  }

  public void setTerminalName(String terminalName) {
    this.terminalName = terminalName;
  }

  public Integer getNumOfGates() {
    return numOfGates;
  }

  public void setNumOfGates(Integer numOfGates) {
    this.numOfGates = numOfGates;
  }

  public Boolean getTerminalInternational() {
    return isTerminalInternational;
  }

  public void setTerminalInternational(Boolean terminalInternational) {
    isTerminalInternational = terminalInternational;
  }

  public Integer getMaxCapacity() {
    return maxCapacity;
  }

  public void setMaxCapacity(Integer maxCapacity) {
    this.maxCapacity = maxCapacity;
  }

  public String getAmenities() {
    return amenities;
  }

  public void setAmenities(String amenities) {
    this.amenities = amenities;
  }

  public Double getSizeInSquareFeet() {
    return sizeInSquareFeet;
  }

  public void setSizeInSquareFeet(Double sizeInSquareFeet) {
    this.sizeInSquareFeet = sizeInSquareFeet;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Terminal)) {
      return false;
    }
    Terminal terminal = (Terminal) o;
    return getTerminalName().equals(terminal.getTerminalName()) && getNumOfGates()
        .equals(terminal.getNumOfGates()) && isTerminalInternational
        .equals(terminal.isTerminalInternational) && getMaxCapacity()
        .equals(terminal.getMaxCapacity()) && getAmenities().equals(terminal.getAmenities())
        && getSizeInSquareFeet().equals(terminal.getSizeInSquareFeet());
  }

  @Override
  public int hashCode() {
    return Objects
        .hash(getTerminalName(), getNumOfGates(), isTerminalInternational, getMaxCapacity(),
            getAmenities(), getSizeInSquareFeet());
  }

  @Override
  public String toString() {
    return "Terminal{" +
        "terminalName='" + terminalName + '\'' +
        ", numOfGates=" + numOfGates +
        ", isTerminalInternational=" + isTerminalInternational +
        ", maxCapacity=" + maxCapacity +
        ", amenities='" + amenities + '\'' +
        ", sizeInSquareFeet=" + sizeInSquareFeet +
        '}';
  }
}
