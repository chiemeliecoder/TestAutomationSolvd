package com.laba.solvd.A8.MyEnums;

public enum Seasons {

  SPRING("March to May"),
  SUMMER("June to August"),
  FALL("September to November"),
  WINTER("December to February");

  private final String months;

  Seasons(String months) {
    this.months = months;
  }

  public String getMonths() {
    return months;
  }
}
