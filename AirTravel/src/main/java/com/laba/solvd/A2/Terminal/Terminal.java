package com.laba.solvd.A2.Terminal;

import com.laba.solvd.A2.Staff.Staff;
import java.util.List;
import java.util.Objects;

public class Terminal {
  protected String terminalName;
  private Integer numOfGates;
  private List<Staff> listOfStaffs;

  public Terminal(String terminalName, Integer numOfGates,
      List<Staff> listOfStaffs) {
    this.terminalName = terminalName;
    this.numOfGates = numOfGates;
    this.listOfStaffs = listOfStaffs;
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

  public List<Staff> getListOfStaffs() {
    return listOfStaffs;
  }

  public void setListOfStaffs(List<Staff> listOfStaffs) {
    this.listOfStaffs = listOfStaffs;
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
        .equals(terminal.getNumOfGates()) && getListOfStaffs().equals(terminal.getListOfStaffs());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getTerminalName(), getNumOfGates(), getListOfStaffs());
  }

  @Override
  public String toString() {
    return "Terminal{" +
        "terminalName='" + terminalName + '\'' +
        ", numOfGates=" + numOfGates +
        ", listOfStaffs=" + listOfStaffs +
        '}';
  }
}
