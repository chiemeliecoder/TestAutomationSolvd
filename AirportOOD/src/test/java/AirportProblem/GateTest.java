package AirportProblem;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Calendar;
import java.util.Date;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GateTest {
  private Gate gate1;
  private Gate gate2;
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

    gate1 = new Gate("Berry Field Nashville","Nashville", 3,"BNA","Southwest Airlines",1,false,
        "south Terminal",4,false,18000000,"Dunkin Donuts",1000000.00,"Domestic flights",4,flight1,flight1,"C&D",true);

    gate2 = new Gate("Berry Field Nashville","Nashville", 3,"BNA","Japan Airlines",1,true,
        "North Terminal",4,true,18000000,"Chick Fil-A",1000000.00,"International flights",4,flight2,flight2,"A&B",true);
  }

  @Test
  void getNumber() {
    assertEquals(4,gate1.getNumber());
    assertEquals(4,gate2.getNumber());
  }

  @Test
  void getAirline() {
    assertEquals(flight1,gate1.getAirlines());
    assertEquals(flight2,gate2.getAirlines());
  }

  @Test
  void getFlight() {
    assertEquals(flight1,gate1.getFlights());
    assertEquals(flight2,gate2.getFlights());
  }

  @Test
  void getGateGroup() {
    assertEquals("C&D",gate1.getGateGroup());
    assertEquals("A&B",gate2.getGateGroup());
  }

  @Test
  void isOpen() {
    assertEquals(true,gate1.isOpen());
    assertEquals(true,gate2.isOpen());
  }

  @Test
  public void testEqualsReflective(){
    assertTrue(gate1.equals(gate2));

  }

  @Test
  public void testEqualsNullTest() {
    assertFalse(gate1.equals(null));
    assertFalse(gate2.equals(null));
  }

  @Test
  public void testEqualsConsistency() {
    assertFalse(gate1.equals(gate2));

  }

  @Test
  public void testEqualsTransitivity() {
    assertFalse(gate1.equals(gate2) && gate2.equals(gate1));
  }

  @Test
  public void testEqualsSymmetery() {
    assertTrue(gate1.equals(gate2) == gate2.equals(gate1));
  }

  @Test
  void testHashCode() {
    assertFalse(gate1.hashCode() == gate2.hashCode());
  }
}