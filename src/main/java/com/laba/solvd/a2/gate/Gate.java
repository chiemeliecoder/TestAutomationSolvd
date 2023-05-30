package com.laba.solvd.a2.gate;

import com.laba.solvd.a2.exceptions.GateException;
import com.laba.solvd.a2.interfaces.IGate;
import com.laba.solvd.a2.flight.Flight;
import java.util.List;
import java.util.Objects;

public class Gate implements IGate {
  private String gateName;
  private List<Flight> listOfFlight;
  private Boolean isOpen;
  private Double maintenanceCost;
  private Double staffCost;
  private Double utilityCost;


  public Gate(String gateName){
    this.gateName = gateName;
  }

  public Gate(String gateName, List<Flight> listOfFlight, Boolean isOpen) {
    this.gateName = gateName;
    this.listOfFlight = listOfFlight;
    this.isOpen = isOpen;
  }

  public Gate(String gateName, List<Flight> listOfFlight, Boolean isOpen,
      Double maintenanceCost, Double staffCost, Double utilityCost) {
    this.gateName = gateName;
    this.listOfFlight = listOfFlight;
    this.isOpen = isOpen;
    this.maintenanceCost = maintenanceCost;
    this.staffCost = staffCost;
    this.utilityCost = utilityCost;
  }

  public void setGate(String gateName) throws GateException {
    if (gateName == null || gateName.isEmpty()) {
      throw new GateException("Gate name cannot be null or empty");
    }
  }

  public String getGateName() {
    return gateName;
  }

  public void setGateName(String gateName) {
    this.gateName = gateName;
  }

  public List<Flight> getListOfFlight() {
    return listOfFlight;
  }

  public void setListOfFlight(List<Flight> listOfFlight) {
    this.listOfFlight = listOfFlight;
  }

  public Boolean getOpen() {
    return isOpen;
  }

  public void setOpen(Boolean open) {
    isOpen = open;
  }

  @Override
  public Double calculateTotalExpenses() {
    Double totalExpenses = maintenanceCost + staffCost + utilityCost;
    return totalExpenses;
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
    return getGateName().equals(gate.getGateName()) && getListOfFlight()
        .equals(gate.getListOfFlight()) && isOpen.equals(gate.isOpen);
  }

  @Override
  public int hashCode() {
    return Objects.hash(getGateName(), getListOfFlight(), isOpen);
  }

  @Override
  public String toString() {
    return "Gate{" +
        "gateName='" + gateName + '\'' +
        ", listOfFlight=" + listOfFlight +
        ", isOpen=" + isOpen +
        '}';
  }
}
