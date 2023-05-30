package com.laba.solvd.a2.enums;

public enum Cuisine {
  TRADITIONAL_JAPANESE("Traditional Japanese", true),
  INTERNATIONAL("International", false),
  VEGETARIAN("Vegetarian", true),
  VEGAN("Vegan", true);

  private String displayName;
  private boolean isHealthyOption;

  Cuisine(String displayName, boolean isHealthyOption) {
    this.displayName = displayName;
    this.isHealthyOption = isHealthyOption;
  }

  public String getDisplayName() {
    return displayName;
  }

  public boolean isHealthyOption() {
    return isHealthyOption;
  }

  @Override
  public String toString() {
    return displayName;
  }
}
