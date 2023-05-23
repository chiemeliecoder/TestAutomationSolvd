package com.laba.solvd.a2.enums;

public enum Country {
  USA("United States of America", "USA"),
  CANADA("Canada", "CAN"),
  UK("United Kingdom", "UK"),
  GERMANY("Germany", "GER"),
  JAPAN("Japan","JPN");



  private final String fullName;
  private final String countryCode;

  Country(String fullName, String countryCode) {
    this.fullName = fullName;
    this.countryCode = countryCode;
  }

  public String getFullName() {
    return fullName;
  }

  public String getCountryCode() {
    return countryCode;
  }
}
