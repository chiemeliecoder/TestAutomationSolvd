package com.laba.solvd.a2.staff;

import com.laba.solvd.a2.exceptions.AirportStaffException;
import com.laba.solvd.a2.interfaces.IStaff;
import java.util.Objects;

public abstract class Staff implements IStaff {
  protected String staffName;
  private Integer age;
  protected Integer salary;

  public Staff(String staffName, Integer age, Integer salary) {

    this.staffName = staffName;
    this.age = age;
    this.salary = salary;
  }

  public void setStaff(String staffName, Integer age, Integer salary) throws AirportStaffException {
    if (staffName == null || staffName.isEmpty()) {
      throw new AirportStaffException("Name cannot be null or empty");
    }

    if (age < 18 || age > 70) {
      throw new AirportStaffException("Age must be between 18 and 70");
    }

    if (salary == null || salary == 0) {
      throw new AirportStaffException("salary cannot be null or 0");
    }
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

  public Integer getSalary() {
    return salary;
  }

  public void setSalary(Integer salary) {
    this.salary = salary;
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
    return staffName.equals(staff.staffName) && age.equals(staff.age) && salary
        .equals(staff.salary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(staffName, age, salary);
  }

  @Override
  public String toString() {
    return "Staff{" +
        "staffName='" + staffName + '\'' +
        ", age=" + age +
        ", salary=" + salary +
        '}';
  }
}
