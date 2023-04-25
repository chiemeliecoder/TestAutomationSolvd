package com.laba.solvd.A2.Problem1;

import java.util.Objects;

public class Gate implements IGate{
  private Integer numOfGate;
  private String gateName;
  private Flight flight;
  private String gateGroup;
  private Boolean isOpen;

  public Gate(Integer numOfGate, String gateName, Flight flight, String gateGroup,
      Boolean isOpen) {
    this.numOfGate = numOfGate;
    this.gateName = gateName;
    this.flight = flight;
    this.gateGroup = gateGroup;
    this.isOpen = isOpen;
  }

  public Integer getNumOfGate() {
    return numOfGate;
  }

  public void setNumOfGate(Integer numOfGate) {
    this.numOfGate = numOfGate;
  }

  public String getGateName() {
    return gateName;
  }

  public void setGateName(String gateName) {
    this.gateName = gateName;
  }

  public Flight getFlight() {
    return flight;
  }

  public void setFlight(Flight flight) {
    this.flight = flight;
  }

  public String getGateGroup() {
    return gateGroup;
  }

  public void setGateGroup(String gateGroup) {
    this.gateGroup = gateGroup;
  }

  public Boolean getOpen() {
    return isOpen;
  }

  public void setOpen(Boolean open) {
    isOpen = open;
  }

  @Override
  public Integer numOfGate() {
    return null;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Gate)) {
      return false;
    }
    Gate gate = (Gate) o;
    return getNumOfGate().equals(gate.getNumOfGate()) && getGateName().equals(gate.getGateName())
        && getFlight().equals(gate.getFlight()) && getGateGroup().equals(gate.getGateGroup())
        && isOpen.equals(gate.isOpen);
  }

  @Override
  public int hashCode() {
    return Objects.hash(getNumOfGate(), getGateName(), getFlight(), getGateGroup(), isOpen);
  }

  @Override
  public String toString() {
    return "Gate{" +
        "numOfGate=" + numOfGate +
        ", gateName='" + gateName + '\'' +
        ", flight=" + flight +
        ", gateGroup='" + gateGroup + '\'' +
        ", isOpen=" + isOpen +
        '}';
  }
}
