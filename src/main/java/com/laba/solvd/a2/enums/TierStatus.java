package com.laba.solvd.a2.enums;

public enum TierStatus {
  SILVER("Silver", 1, 1000),
  GOLD("Gold", 2, 3000),
  PLATINUM("Platinum", 3, 5000);

  private String displayName;
  private int level;
  private int minimumPoints;

  TierStatus(String displayName, int level, int minimumPoints) {
    this.displayName = displayName;
    this.level = level;
    this.minimumPoints = minimumPoints;
  }

  public String getDisplayName() {
    return displayName;
  }

  public int getLevel() {
    return level;
  }

  public int getMinimumPoints() {
    return minimumPoints;
  }

  @Override
  public String toString() {
    return displayName;
  }
}
