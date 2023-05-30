package com.laba.solvd.a2.terminal;

import com.laba.solvd.a2.enums.Country;
import com.laba.solvd.a2.staff.Staff;
import java.util.List;
import java.util.Objects;

public final class Terminal {
  protected final String terminalName;
  private final Integer numOfGates;
  private final List<Staff> listOfStaffs;
  private final Country country;

  public Terminal(String terminalName, Integer numOfGates,
      List<Staff> listOfStaffs,Country country) {
    this.terminalName = terminalName;
    this.numOfGates = numOfGates;
    this.listOfStaffs = listOfStaffs;
    this.country = country;
  }

  public String getTerminalName() {
    return terminalName;
  }


  public Integer getNumOfGates() {
    return numOfGates;
  }


  public List<Staff> getListOfStaffs() {
    return listOfStaffs;
  }

  public Country getCountry() {
    return country;
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
        .equals(terminal.getNumOfGates()) && getListOfStaffs().equals(terminal.getListOfStaffs())
        && getCountry() == terminal.getCountry();
  }

  @Override
  public int hashCode() {
    return Objects.hash(getTerminalName(), getNumOfGates(), getListOfStaffs(), getCountry());
  }

  @Override
  public String toString() {
    return "Terminal{" +
        "terminalName='" + terminalName + '\'' +
        ", numOfGates=" + numOfGates +
        ", listOfStaffs=" + listOfStaffs +
        ", country=" + country +
        '}';
  }
}
