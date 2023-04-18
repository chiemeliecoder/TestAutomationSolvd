package AirportProblem;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SecurityCheckpointTest {
  private SecurityCheckpoint securityCheckpoint1;
  private SecurityCheckpoint securityCheckpoint2;

  @BeforeEach
  void setUp() {
    securityCheckpoint1 = new SecurityCheckpoint("Berry Field Nashville","Nashville", 3,"BNA","Southwest Airlines",1,false,
        "south Terminal",4,false,18000000,"Dunkin Donuts",1000000.00,"Domestic flights","2",8,238,true,true);
    securityCheckpoint2 =new SecurityCheckpoint("Berry Field Nashville","Nashville", 3,"BNA","Japan Airlines",1,true,
        "North Terminal",4,true,18000000,"Chick Fil-A",1000000.00,"International flights","4",12,536,true,true);
  }

  @Test
  void getCheckpointNumber() {
    assertEquals("2",securityCheckpoint1.getCheckpointNumber());
    assertEquals("4",securityCheckpoint2.getCheckpointNumber());
  }

  @Test
  void getMaxOfficers() {
    assertEquals(8,securityCheckpoint1.getMaxOfficers());
    assertEquals(12,securityCheckpoint2.getMaxOfficers());
  }

  @Test
  void getMaxCapacity() {
    assertEquals(238,securityCheckpoint1.getMaxCapacity());
    assertEquals(536,securityCheckpoint2.getMaxCapacity());
  }

  @Test
  void isScannerAvailable() {
    assertEquals(true,securityCheckpoint1.isScannerAvailable());
    assertEquals(true,securityCheckpoint2.isScannerAvailable());
  }

  @Test
  void isMetalDetectorAvailable() {
    assertEquals(true,securityCheckpoint1.isMetalDetectorAvailable());
    assertEquals(true,securityCheckpoint2.isMetalDetectorAvailable());
  }



  @Test
  public void testEqualsReflective(){
    assertTrue(securityCheckpoint1.equals(securityCheckpoint2));

  }

  @Test
  public void testEqualsNullTest() {
    assertFalse(securityCheckpoint1.equals(null));
    assertFalse(securityCheckpoint2.equals(null));
  }

  @Test
  public void testEqualsConsistency() {
    assertFalse(securityCheckpoint1.equals(securityCheckpoint2));

  }

  @Test
  public void testEqualsTransitivity() {
    assertFalse(securityCheckpoint1.equals(securityCheckpoint2) && securityCheckpoint2.equals(securityCheckpoint1));
  }

  @Test
  public void testEqualsSymmetery() {
    assertTrue(securityCheckpoint1.equals(securityCheckpoint2) == securityCheckpoint2.equals(securityCheckpoint1));
  }

  @Test
  void testHashCode() {
    assertFalse(securityCheckpoint1.hashCode() == securityCheckpoint2.hashCode());
  }
}