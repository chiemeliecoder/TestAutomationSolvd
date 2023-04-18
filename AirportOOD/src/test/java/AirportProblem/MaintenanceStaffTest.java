package AirportProblem;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MaintenanceStaffTest {
  private MaintenanceStaff maintenanceStaff1;
  private MaintenanceStaff maintenanceStaff2;

  @BeforeEach
  void setUp() {
    maintenanceStaff1 = new MaintenanceStaff("Berry Field Nashville","Nashville", 3,"BNA","Southwest Airlines",1,false,
        "John Smith",34,"Airline Baggage Handler","Baggage and Cargo",36000,"BNA037456","(214)-567-9862","John@gmail.com",5,"Southwest Baggage Handler",8,true,18.00,"Airport Worker United");

    maintenanceStaff2 = new MaintenanceStaff("Berry Field Nashville","Nashville", 3,"BNA","Japan Airlines",1,true,
        "Mary Sato",30,"Airline Customer Service Agent","Customer service",71340,"JAL339850","(214)-789-4371","Sato.s@japanairlines.com",5,"Customer Support",6,true,37.01,"Airport Worker United");
  }

  @Test
  void getSpecialty() {
    assertEquals("Southwest Baggage Handler",maintenanceStaff1.getSpecialty());
    assertEquals("Customer Support",maintenanceStaff2.getSpecialty());
  }

  @Test
  void getExperienceYears() {
    assertEquals(8,maintenanceStaff1.getExperienceYears());
    assertEquals(6,maintenanceStaff2.getExperienceYears());
  }

  @Test
  void isCertified() {
    assertEquals(true,maintenanceStaff1.isCertified());
    assertEquals(true,maintenanceStaff2.isCertified());
  }

  @Test
  void getHourlyWage() {
    assertEquals(18.00,maintenanceStaff1.getHourlyWage());
    assertEquals(37.01,maintenanceStaff2.getHourlyWage());
  }

  @Test
  void getUnionMembership() {
    assertEquals("Airport Worker United",maintenanceStaff1.getUnionMembership());
    assertEquals("Airport Worker United",maintenanceStaff2.getUnionMembership());
  }



  @Test
  public void testEqualsReflective(){
    assertTrue(maintenanceStaff1.equals(maintenanceStaff2));

  }

  @Test
  public void testEqualsNullTest() {
    assertFalse(maintenanceStaff1.equals(null));
    assertFalse(maintenanceStaff2.equals(null));
  }

  @Test
  public void testEqualsConsistency() {
    assertFalse(maintenanceStaff1.equals(maintenanceStaff2));

  }

  @Test
  public void testEqualsTransitivity() {
    assertFalse(maintenanceStaff1.equals(maintenanceStaff2) && maintenanceStaff2.equals(maintenanceStaff1));
  }

  @Test
  public void testEqualsSymmetery() {
    assertTrue(maintenanceStaff1.equals(maintenanceStaff2) == maintenanceStaff2.equals(maintenanceStaff1));
  }

  @Test
  void testHashCode() {
    assertFalse(maintenanceStaff1.hashCode() == maintenanceStaff2.hashCode());
  }
}