package com.laba.solvd.A2.Staff;

import com.laba.solvd.A2.Staff.Staff;

public class MaintenanceStaff extends Staff {
  private int numEmployees;

  public MaintenanceStaff(String staffName, Integer age, Integer salary, int numEmployees) {
    super(staffName, age, salary);
    this.numEmployees = numEmployees;
  }

  public int getNumEmployees() {
    return numEmployees;
  }

  public void setNumEmployees(int numEmployees) {
    this.numEmployees = numEmployees;
  }

  public double getTotalCost() {
    return salary * numEmployees;
  }

  @Override
  public String toString() {
    return "MaintenanceStaff{" +
        "numEmployees=" + numEmployees +
        ", staffName='" + staffName + '\'' +
        ", salary=" + salary +
        '}';
  }
}
