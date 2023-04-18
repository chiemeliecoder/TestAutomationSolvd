package AirportProblem;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Calendar;
import java.util.Date;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TerminalTest {
  private Terminal terminal1;
  private Terminal terminal2;
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

    terminal1 = new Gate("Berry Field Nashville","Nashville", 3,"BNA","Southwest Airlines",1,false,
        "south Terminal",4,false,18000000,"Dunkin Donuts",1000000.00,"Domestic flights",4,flight1,flight1,"C&D",true);

    terminal2 = new Gate("Berry Field Nashville","Nashville", 3,"BNA","Japan Airlines",1,true,
        "North Terminal",4,true,18000000,"Chick Fil-A",1000000.00,"International flights",4,flight2,flight2,"A&B",true);



  }

  @Test
  void getTerminalName() {
    assertEquals("south Terminal",terminal1.getTerminalName());
    assertEquals("North Terminal",terminal2.getTerminalName());
  }

  @Test
  void getNumOfGates() {
    assertEquals(4,terminal1.getNumOfGates());
    assertEquals(4,terminal2.getNumOfGates());
  }

  @Test
  void isTerminalInternational() {
    assertEquals(false,terminal1.isTerminalInternational());
    assertEquals(true,terminal2.isTerminalInternational());
  }

  @Test
  void getMaxCapacity() {
    assertEquals(18000000,terminal1.getMaxCapacity());
    assertEquals(18000000,terminal2.getMaxCapacity());
  }

  @Test
  void getAmenities() {
    assertEquals("Dunkin Donuts",terminal1.getAmenities());
    assertEquals("Chick Fil-A",terminal2.getAmenities());
  }

  @Test
  void getSizeInSquareFeet() {
    assertEquals(1000000.00,terminal1.getSizeInSquareFeet());
    assertEquals(1000000.00,terminal2.getSizeInSquareFeet());
  }

  @Test
  void getFlights() {
    assertEquals("Domestic flights",terminal1.getFlights());
    assertEquals("International flights",terminal2.getFlights());
  }



  @Test
  public void testEqualsReflective(){
    assertTrue(terminal1.equals(terminal2));

  }

  @Test
  public void testEqualsNullTest() {
    assertFalse(terminal1.equals(null));
    assertFalse(terminal2.equals(null));
  }

  @Test
  public void testEqualsConsistency() {
    assertFalse(terminal1.equals(terminal2));

  }

  @Test
  public void testEqualsTransitivity() {
    assertFalse(terminal1.equals(terminal2) && terminal2.equals(terminal1));
  }

  @Test
  public void testEqualsSymmetery() {
    assertTrue(terminal1.equals(terminal2) == terminal2.equals(terminal1));
  }

  @Test
  void testHashCode() {
    assertFalse(terminal1.hashCode() == terminal2.hashCode());
  }
}