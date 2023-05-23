package com.laba.solvd.a2.airline;

public class TierStatus {

  public static com.laba.solvd.a2.enums.TierStatus fromLevel(int level) {
    for (com.laba.solvd.a2.enums.TierStatus status : com.laba.solvd.a2.enums.TierStatus.values()) {
      if (status.getLevel() == level) {
        return status;
      }
    }
    throw new IllegalArgumentException("Invalid tier level: " + level);
  }

  public static com.laba.solvd.a2.enums.TierStatus fromMinimumPoints(int points) {
    for (com.laba.solvd.a2.enums.TierStatus status : com.laba.solvd.a2.enums.TierStatus.values()) {
      if (points >= status.getMinimumPoints()) {
        return status;
      }
    }
    throw new IllegalArgumentException("No tier status found for points: " + points);
  }

}
