package AirportProblem;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Calendar;
import java.util.Date;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AbstractAirportTest {
  private AbstractAirport airport;
  private AbstractAirport airport2;
  private Airline air;
  private Flight fair;
  private Date arrive;
  private Date depature;
  private Date getArrive;
  private  Date getDepature;


  @BeforeEach
  void setUp() throws Exception{
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



    air= new Flight("Berry Field Nashville","Nashville", 3,"BNA","Southwest Airlines",1,false,
        "Southwest Airlines","SA","Dallas",1967,33,32,"SA917",126,
        "BNA","BOS",depature,arrive);
    fair =new Flight("Berry Field Nashville","Nashville", 3,"BNA","Japan Airlines",1,true,
        "Japan Airline","JAL","Japan",1951,148,190,"JAL678",189,"LAX","HND",getDepature,getArrive);
    airport = new Gate("Berry Field Nashville","Nashville", 3,"BNA","Southwest Airlines",1,false,
        "south Terminal",4,false,18000000,"Dunkin Donuts",1000000.00,"Domestic flights",4,air,fair,"C&D",true);
    airport2 = new SecurityCheckpoint("Berry Field Nashville","Nashville", 3,"BNA","Japan Airlines",1,true,
        "North Terminal",4,true,18000000,"Chick Fil-A",1000000.00,"International flights","4",12,536,true,true);
  }

  @Test
  void getName() {
    assertEquals("Berry Field Nashville",airport.getName());
    assertEquals("Berry Field Nashville",airport2.getName());
  }

  @Test
  void getLocation() {
    assertEquals("Nashville",airport.getLocation());
    assertEquals("Nashville",airport2.getLocation());
  }

  @Test
  void getNumRunways() {
    assertEquals(3,airport.getNumRunways());
    assertEquals(3,airport2.getNumRunways());
  }

  @Test
  void getAirportCode() {
    assertEquals("BNA",airport.getAirportCode());
    assertEquals("BNA",airport2.getAirportCode());
  }

  @Test
  void getAirlines() {
    assertEquals("Southwest Airlines",airport.getAirlines());
    assertEquals("Japan Airlines",airport2.getAirlines());
  }

  @Test
  void getNumTerminals() {
    assertEquals(1,airport.getNumTerminals());
    assertEquals(1,airport2.getNumTerminals());
  }

  @Test
  void isInternational() {
    assertEquals(false,airport.isInternational());
    assertEquals(true,airport2.isInternational());
  }

  @Test
  void getAirport() {
    assertEquals("Berry Field Nashville",airport.getAirport("Berry Field Nashville"));
    assertEquals("Berry Field Nashville",airport2.getAirport("Berry Field Nashville"));
  }

  @Test
  public void testEqualsReflective(){
    assertTrue(airport.equals(airport2));

  }

  @Test
  public void testEqualsNullTest() {
    assertFalse(airport.equals(null));
    assertFalse(airport2.equals(null));
  }

  @Test
  public void testEqualsConsistency() {
    assertFalse(airport.equals(airport2));

  }

  @Test
  public void testEqualsTransitivity() {
    assertFalse(airport.equals(airport2) && airport2.equals(airport));
  }

  @Test
  public void testEqualsSymmetery() {
    assertTrue(airport.equals(airport2) == airport2.equals(airport));
  }

  @Test
  void testHashCode() {
    assertFalse(airport.hashCode() == airport2.hashCode());
  }
}