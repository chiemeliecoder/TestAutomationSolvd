package com.laba.solvd.a2.staff;

import com.laba.solvd.a2.enums.StaffRole;
import java.util.Objects;

public class MaintenanceStaff extends Staff {
  private int numEmployees;
  private StaffRole staffRole;

  public MaintenanceStaff(String staffName, Integer age, Integer salary, int numEmployees, StaffRole staffRole) {
    super(staffName, age, salary);
    this.numEmployees = numEmployees;
    this.staffRole = staffRole;
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

  public StaffRole getStaffRole() {
    return staffRole;
  }

  public void setStaffRole(StaffRole staffRole) {
    this.staffRole = staffRole;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof MaintenanceStaff)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    MaintenanceStaff that = (MaintenanceStaff) o;
    return getNumEmployees() == that.getNumEmployees() && getStaffRole() == that.getStaffRole();
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), getNumEmployees(), getStaffRole());
  }

  @Override
  public String toString() {
    return "MaintenanceStaff{" +
        "numEmployees=" + numEmployees +
        ", staffRole=" + staffRole +
        ", staffName='" + staffName + '\'' +
        ", salary=" + salary +
        '}';
  }
}
