package com.laba.solvd.a2.enums;

public enum CommercialJetType {
  TYPE1(100, 200, 1000),
  TYPE2(200, 300, 2000),
  TYPE3(300, 400, 3000);

  private final int passengerCapacity;
  private final int cargoCapacity;
  private final double landingFee;

  CommercialJetType(int minPassengerCapacity, int maxPassengerCapacity, int cargoCapacity) {
    this.passengerCapacity = calculatePassengerCapacity(minPassengerCapacity, maxPassengerCapacity);
    this.cargoCapacity = cargoCapacity;
    this.landingFee = calculateLandingFee();
  }

  private int calculatePassengerCapacity(int minPassengerCapacity, int maxPassengerCapacity) {
    // Logic to calculate passenger capacity based on the given range
    return (minPassengerCapacity + maxPassengerCapacity) / 2;
  }

  private double calculateLandingFee() {
    // Custom logic to calculate the landing fee based on the passenger capacity
    // You can use switch statements or if-else conditions to define different calculation rules
    switch (passengerCapacity) {
      case 100:
        return 1500.0;
      case 200:
        return 2000.0;
      case 300:
        return 2500.0;
      default:
        return 3000.0;
    }
  }

  public int getPassengerCapacity() {
    return passengerCapacity;
  }

  public int getCargoCapacity() {
    return cargoCapacity;
  }

  public double getLandingFee() {
    return landingFee;
  }
}
