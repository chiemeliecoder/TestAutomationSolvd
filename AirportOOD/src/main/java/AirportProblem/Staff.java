package AirportProblem;

import AirportProblem.AbstractAirport;
import java.util.List;
import java.util.Objects;

public abstract class Staff extends AbstractAirport {
  protected String staffName;
  private int age;
  protected String position;
  protected String department;
  private int salary;
  private String employeeId;
  private String phoneNumber;
  private String email;
  private int yearsOfExperience;


  /**This is the Staff abstract class and its parent arguments are inherited to its constructor
   * it has its getters and setters for its arguments below
   * @param staffName name of staff
   * @param age staff age
   * @param position position of the staff
   * @param department the department of the staff
   * @param salary the total salary per for the staff
   * @param employeeId the employeeID of the staff
   * @param phoneNumber the phonenumber of the staff
   * @param email the email of the staff
   * @param yearsOfExperience the years of experience of the staff
   */
  public Staff(String name, String location, int numRunways, String airportCode,
      String airlines, int numTerminals, boolean isInternational, String staffName, int age,
      String position, String department, int salary, String employeeId, String phoneNumber,
      String email, int yearsOfExperience) {
    super(name, location, numRunways, airportCode, airlines, numTerminals, isInternational);
    this.staffName = staffName;
    this.age = age;
    this.position = position;
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

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public int getSalary() {
    return salary;
  }

  public void setSalary(int salary) {
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

  public int getYearsOfExperience() {
    return yearsOfExperience;
  }

  public void setYearsOfExperience(int yearsOfExperience) {
    this.yearsOfExperience = yearsOfExperience;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Staff)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    Staff staff = (Staff) o;
    return getAge() == staff.getAge() && getSalary() == staff.getSalary()
        && getYearsOfExperience() == staff.getYearsOfExperience() && getStaffName()
        .equals(staff.getStaffName()) && getPosition().equals(staff.getPosition())
        && getDepartment()
        .equals(staff.getDepartment()) && getEmployeeId().equals(staff.getEmployeeId())
        && getPhoneNumber().equals(staff.getPhoneNumber()) && getEmail().equals(staff.getEmail());
  }

  @Override
  public int hashCode() {
    return Objects
        .hash(super.hashCode(), getStaffName(), getAge(), getPosition(), getDepartment(),
            getSalary(),
            getEmployeeId(), getPhoneNumber(), getEmail(), getYearsOfExperience());
  }

  @Override
  public String toString() {
    return "Staff{" +
        "staffName='" + staffName + '\'' +
        ", age=" + age +
        ", position='" + position + '\'' +
        ", department='" + department + '\'' +
        ", salary=" + salary +
        ", employeeId='" + employeeId + '\'' +
        ", phoneNumber='" + phoneNumber + '\'' +
        ", email='" + email + '\'' +
        ", yearsOfExperience=" + yearsOfExperience +
        '}';
  }
}
