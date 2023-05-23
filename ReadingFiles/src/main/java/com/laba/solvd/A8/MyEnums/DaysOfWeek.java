package com.laba.solvd.A8.MyEnums;

public enum DaysOfWeek {

  MONDAY("Monday", "Mon"),
  TUESDAY("Tuesday", "Tue"),
  WEDNESDAY("Wednesday", "Wed"),
  THURSDAY("Thursday", "Thu"),
  FRIDAY("Friday", "Fri"),
  SATURDAY("Saturday", "Sat"),
  SUNDAY("Sunday", "Sun");

  private final String dayName;
  private final String abbreviation;

  DaysOfWeek(String dayName, String abbreviation) {
    this.dayName = dayName;
    this.abbreviation = abbreviation;
  }


  public String getDayName() {
    return dayName;
  }

  public String getAbbreviation() {
    return abbreviation;
  }

  public String getFullName() {
    return dayName + " (" + abbreviation + ")";
  }
}
