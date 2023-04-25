package com.laba.solvd.A2.Problem1;

import java.util.Objects;

public abstract class Staff implements IStaff {
  protected String staffName;
  private Integer age;
  private String department;
  private Integer salary;
  private String employeeId;
  private String phoneNumber;
  private String email;
  private Integer yearsOfExperience;

  public Staff(String staffName, Integer age, String department, Integer salary,
      String employeeId, String phoneNumber, String email, Integer yearsOfExperience) {
    this.staffName = staffName;
    this.age = age;
    this.department = department;
    this.salary = salary;
    this.employeeId = employeeId;
    this.phoneNumber = phoneNumber;
    this.email = email;
    this.yearsOfExperience = yearsOfExperience;
  }

  public String getStaffName() {
    return staffName;
  }

  public void setStaffName(String staffName) {
    this.staffName = staffName;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public Integer getSalary() {
    return salary;
  }

  public void setSalary(Integer salary) {
    this.salary = salary;
  }

  public String getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(String employeeId) {
    this.employeeId = employeeId;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Integer getYearsOfExperience() {
    return yearsOfExperience;
  }

  public void setYearsOfExperience(Integer yearsOfExperience) {
    this.yearsOfExperience = yearsOfExperience;
  }

  @Override
  public Integer numOfStaff() {
    return null;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Staff)) {
      return false;
    }
    Staff staff = (Staff) o;
    return getStaffName().equals(staff.getStaffName()) && getAge().equals(staff.getAge())
        && getDepartment().equals(staff.getDepartment()) && getSalary().equals(staff.getSalary())
        && getEmployeeId().equals(staff.getEmployeeId()) && getPhoneNumber()
        .equals(staff.getPhoneNumber()) && getEmail().equals(staff.getEmail())
        && getYearsOfExperience().equals(staff.getYearsOfExperience());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getStaffName(), getAge(), getDepartment(), getSalary(), getEmployeeId(),
        getPhoneNumber(), getEmail(), getYearsOfExperience());
  }

  @Override
  public String toString() {
    return "Staff{" +
        "staffName='" + staffName + '\'' +
        ", age=" + age +
        ", department='" + department + '\'' +
        ", salary=" + salary +
        ", employeeId='" + employeeId + '\'' +
        ", phoneNumber='" + phoneNumber + '\'' +
        ", email='" + email + '\'' +
        ", yearsOfExperience=" + yearsOfExperience +
        '}';
  }
}
