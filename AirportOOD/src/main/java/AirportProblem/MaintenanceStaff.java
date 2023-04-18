package AirportProblem;

import java.util.List;
import java.util.Objects;

public class MaintenanceStaff extends Staff {
  private String specialty;
  private int experienceYears;
  private boolean isCertified;
  private double hourlyWage;
  private String unionMembership;


  /**This is the MaintenanceStaff class and its parent arguments are inherited to its constructor
   * it has its getters and setters for its arguments below
   * @param specialty what the maintenance staff specialty is
   * @param experienceYears the years of experience they have
   * @param isCertified is the staff verified
   * @param hourlyWage what their hourly wage is
   * @param unionMembership name of their union
   */
  public MaintenanceStaff(String name, String location, int numRunways, String airportCode,
      String airlines, int numTerminals, boolean isInternational, String staffName, int age,
      String position, String department, int salary, String employeeId, String phoneNumber,
      String email, int yearsOfExperience, String specialty, int experienceYears,
      boolean isCertified,
      double hourlyWage, String unionMembership) {
    super(name, location, numRunways, airportCode, airlines, numTerminals, isInternational,
        staffName,
        age, position, department, salary, employeeId, phoneNumber, email, yearsOfExperience);
    this.specialty = specialty;
    this.experienceYears = experienceYears;
    this.isCertified = isCertified;
    this.hourlyWage = hourlyWage;
    this.unionMembership = unionMembership;
  }

  public String getSpecialty() {
    return specialty;
  }

  public void setSpecialty(String specialty) {
    this.specialty = specialty;
  }

  public int getExperienceYears() {
    return experienceYears;
  }

  public void setExperienceYears(int experienceYears) {
    this.experienceYears = experienceYears;
  }

  public boolean isCertified() {
    return isCertified;
  }

  public void setCertified(boolean certified) {
    isCertified = certified;
  }

  public double getHourlyWage() {
    return hourlyWage;
  }

  public void setHourlyWage(double hourlyWage) {
    this.hourlyWage = hourlyWage;
  }

  public String getUnionMembership() {
    return unionMembership;
  }

  public void setUnionMembership(String unionMembership) {
    this.unionMembership = unionMembership;
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
    return getExperienceYears() == that.getExperienceYears() && isCertified() == that.isCertified()
        && Double.compare(that.getHourlyWage(), getHourlyWage()) == 0 && getSpecialty()
        .equals(that.getSpecialty()) && getUnionMembership().equals(that.getUnionMembership());
  }

  @Override
  public int hashCode() {
    return Objects
        .hash(super.hashCode(), getSpecialty(), getExperienceYears(), isCertified(),
            getHourlyWage(),
            getUnionMembership());
  }
}
