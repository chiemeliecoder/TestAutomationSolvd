package AirportProblem;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StaffTest {
  private Staff staff1;
  private Staff staff2;

  @BeforeEach
  void setUp() {
    staff1 = new MaintenanceStaff("Berry Field Nashville","Nashville", 3,"BNA","Southwest Airlines",1,false,
        "John Swoon",34,"Airline Baggage Handler","Baggage and Cargo",36000,"BNA037456","(214)-567-9862","John@gmail.com",5,"Southwest Baggage Handler",8,true,18.00,"Airport Worker United");

    staff2 = new MaintenanceStaff("Berry Field Nashville","Nashville", 3,"BNA","Japan Airlines",1,true,
        "Mary Sato",30,"Airline Customer Service Agent","Customer service",71340,"JAL339850","(214)-789-4371","Sato.s@japanairlines.com",5,"Customer Support",6,true,37.01,"Airport Worker United");


  }

  @Test
  void getStaffName() {
    assertEquals("John Swoon",staff1.getStaffName());
    assertEquals("Mary Sato",staff2.getStaffName());
  }

  @Test
  void getAge() {
    assertEquals(34,staff1.getAge());
    assertEquals(30,staff2.getAge());
  }

  @Test
  void getPosition() {
    assertEquals("Airline Baggage Handler",staff1.getPosition());
    assertEquals("Airline Customer Service Agent",staff2.getPosition());
  }

  @Test
  void getDepartment() {
    assertEquals("Baggage and Cargo",staff1.getDepartment());
    assertEquals("Customer service",staff2.getDepartment());
  }

  @Test
  void getSalary() {
    assertEquals(36000,staff1.getSalary());
    assertEquals(71340,staff2.getSalary());
  }

  @Test
  void getEmployeeId() {
    assertEquals("BNA037456",staff1.getEmployeeId());
    assertEquals("JAL339850",staff2.getEmployeeId());
  }

  @Test
  void getPhoneNumber() {
    assertEquals("(214)-567-9862",staff1.getPhoneNumber());
    assertEquals("(214)-789-4371",staff2.getPhoneNumber());
  }

  @Test
  void getEmail() {
    assertEquals("John@gmail.com",staff1.getEmail());
    assertEquals("Sato.s@japanairlines.com",staff2.getEmail());
  }

  @Test
  void getYearsOfExperience() {
    assertEquals(5,staff1.getYearsOfExperience());
    assertEquals(5,staff2.getYearsOfExperience());
  }



  @Test
  public void testEqualsReflective(){
    assertTrue(staff1.equals(staff2));

  }

  @Test
  public void testEqualsNullTest() {
    assertFalse(staff1.equals(null));
    assertFalse(staff2.equals(null));
  }

  @Test
  public void testEqualsConsistency() {
    assertFalse(staff1.equals(staff2));

  }

  @Test
  public void testEqualsTransitivity() {
    assertFalse(staff1.equals(staff2) && staff2.equals(staff1));
  }

  @Test
  public void testEqualsSymmetery() {
    assertTrue(staff1.equals(staff2) == staff2.equals(staff1));
  }

  @Test
  void testHashCode() {
    assertFalse(staff2.hashCode() == staff2.hashCode());
  }
}