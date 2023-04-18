package AirportProblem;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Calendar;
import java.util.Date;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AirlineTest {
  private Airline airline1;
  private Airline airline2;
  private Date arrive;
  private Date depature;
  private Date getArrive;
  private Date getDepature;

  @BeforeEach
  void setUp() {
    Calendar cal = Calendar.getInstance();
    cal.set(Calendar.HOUR_OF_DAY, 12);
    cal.set(Calendar.MINUTE, 45);
    arrive = cal.getTime();

    Calendar cal2 = Calendar.getInstance();
    cal2.set(Calendar.HOUR_OF_DAY, 9);
    cal2.set(Calendar.MINUTE, 35);
    depature = cal2.getTime();

    Calendar cal3 = Calendar.getInstance();
    cal3.set(Calendar.HOUR_OF_DAY, 11);
    cal3.set(Calendar.MINUTE, 50);
    getArrive= cal3.getTime();

    Calendar cal4 = Calendar.getInstance();
    cal4.set(Calendar.HOUR_OF_DAY, 9);
    cal4.set(Calendar.MINUTE, 30);
    getDepature=cal4.getTime();

    airline1 = new Flight("Berry Field Nashville","Nashville", 3,"BNA","Southwest Airlines",1,false,
        "Southwest Airlines","SA","Dallas",1967,33,32,"SA917",126,
        "BNA","BOS",depature,arrive);
    airline2 = new Flight("Berry Field Nashville","Nashville", 3,"BNA","Japan Airlines",1,true,
        "Japan Airline","JAL","Japan",1951,148,190,"JAL678",189,"LAX","HND",getDepature,getArrive);
  }

  @Test
  void getAirlineName() {
    assertEquals("Southwest Airlines",airline1.getAirlineName());
    assertEquals("Japan Airline",airline2.getAirlineName());
  }

  @Test
  void getCode() {
    assertEquals("SA",airline1.getCode());
    assertEquals("JAL",airline2.getCode());
  }

  @Test
  void getCountryOfOrigin() {
    assertEquals("Dallas",airline1.getCountryOfOrigin());
    assertEquals("Japan",airline2.getCountryOfOrigin());
  }

  @Test
  void getFoundingYear() {
    assertEquals(1967,airline1.getFoundingYear());
    assertEquals(1951,airline2.getFoundingYear());
  }

  @Test
  void getFleetSize() {
    assertEquals(33,airline1.getFleetSize());
    assertEquals(148,airline2.getFleetSize());
  }

  @Test
  void getNumFleet() {
    assertEquals(32,airline1.getNumFleet());
    assertEquals(190,airline2.getNumFleet());
  }



  @Test
  public void testEqualsReflective(){
    assertTrue(airline1.equals(airline2));

  }

  @Test
  public void testEqualsNullTest() {
    assertFalse(airline1.equals(null));
    assertFalse(airline2.equals(null));
  }

  @Test
  public void testEqualsConsistency() {
    assertFalse(airline1.equals(airline2));

  }

  @Test
  public void testEqualsTransitivity() {
    assertFalse(airline1.equals(airline2) && airline2.equals(airline1));
  }

  @Test
  public void testEqualsSymmetery() {
    assertTrue(airline1.equals(airline2) == airline2.equals(airline1));
  }

  @Test
  void testHashCode() {
    assertFalse(airline1.hashCode() == airline2.hashCode());
  }
}