package com.laba.solvd.a2.airline;

import java.util.Arrays;

public class TierStatus {

  public static com.laba.solvd.a2.enums.TierStatus fromLevel(int level) {
    return Arrays.stream(com.laba.solvd.a2.enums.TierStatus.values())
        .filter(status -> status.getLevel() == level)
        .findFirst()
        .orElseThrow(() -> new IllegalArgumentException("Invalid tier level: " + level));
  }

  public static com.laba.solvd.a2.enums.TierStatus fromMinimumPoints(int points) {
    return Arrays.stream(com.laba.solvd.a2.enums.TierStatus.values())
        .filter(status -> points >= status.getMinimumPoints())
        .findFirst()
        .orElseThrow(() -> new IllegalArgumentException("No tier status points found: " + points));
  }

}
