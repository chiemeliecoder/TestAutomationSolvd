package com.laba.solvd.a2.interfaces;

public interface IAircraft {

  /**
   * Aircraft Landing Fee: The aircraft landing fee refers specifically to the fee charged to the aircraft operator or owner for the privilege of
   * landing an aircraft at a particular airport. It is a charge imposed on the aircraft itself and is typically based on factors such as the aircraft's weight, size,
   * and the duration of its stay at the airport.
   * The purpose of the aircraft landing fee is to recover the costs associated with the use of airport facilities and services by the aircraft.
   * */
  Double  getLandingFee();
  Double getMaintenanceCost(int year);

}
