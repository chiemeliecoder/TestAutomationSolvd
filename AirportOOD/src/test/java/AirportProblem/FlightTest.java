package AirportProblem;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Calendar;
import java.util.Date;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FlightTest {
  private Flight flight1;
  private Flight flight2;
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
    flight1 = new Flight("Berry Field Nashville","Nashville", 3,"BNA","Southwest Airlines",1,false,
        "Southwest Airlines","SA","Dallas",1967,33,32,"SA917",126,
        "BNA","BOS",depature,arrive);

    flight2 =new Flight("Berry Field Nashville","Nashville", 3,"BNA","Japan Airlines",1,true,
        "Japan Airline","JAL","Japan",1951,148,190,"JAL678",189,"LAX","HND",getDepature,getArrive);
  }

  @Test
  void getFlightNumber() {
    assertEquals("SA917",flight1.getFlightNumber());
    assertEquals("JAL678",flight2.getFlightNumber());
  }

  @Test
  void getMaxPassengers() {
    assertEquals(126,flight1.getMaxPassengers());
    assertEquals(189,flight2.getMaxPassengers());
  }

  @Test
  void getDepartureAirport() {
    assertEquals("BNA",flight1.getDepartureAirport());
    assertEquals("LAX",flight2.getDepartureAirport());
  }

  @Test
  void getArrivalAirport() {
    assertEquals("BOS",flight1.getArrivalAirport());
    assertEquals("HND",flight2.getArrivalAirport());
  }

  @Test
  void getDepartureTime() {
    assertEquals(depature,flight1.getDepartureAirport());
    assertEquals(getDepature,flight2.getDepartureAirport());
  }

  @Test
  void getArrivalTime() {
    assertEquals(arrive,flight1.getArrivalAirport());
    assertEquals(getArrive,flight2.getArrivalAirport());
  }



  @Test
  public void testEqualsReflective(){
    assertTrue(flight1.equals(flight2));

  }

  @Test
  public void testEqualsNullTest() {
    assertFalse(flight1.equals(null));
    assertFalse(flight2.equals(null));
  }

  @Test
  public void testEqualsConsistency() {
    assertFalse(flight1.equals(flight2));

  }

  @Test
  public void testEqualsTransitivity() {
    assertFalse(flight1.equals(flight2) && flight2.equals(flight1));
  }

  @Test
  public void testEqualsSymmetery() {
    assertTrue(flight1.equals(flight2) == flight2.equals(flight1));
  }

  @Test
  void testHashCode() {
    assertFalse(flight1.hashCode() == flight2.hashCode());
  }
}