package com.laba.solvd.A8.MyEnums;

public enum Country {

  USA("Washington D.C.", "English"),
  FRANCE("Paris", "French"),
  CHINA("Beijing", "Chinese"),
  GERMANY("Berlin", "German"),
  JAPAN("Tokyo", "Japanese");

  private final String capital;
  private final String language;

  Country(String capital, String language) {
    this.capital = capital;
    this.language = language;
  }

  public String getCapital() {
    return capital;
  }

  public String getLanguage() {
    return language;
  }

}
