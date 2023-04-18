package AirportProblem;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Calendar;
import java.util.Date;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PassengerTest {
  private Passenger passenger1;
  private Passenger passenger2;
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



    passenger1 = new Passenger("Berry Field Nashville","Nashville", 3,"BNA","Southwest Airlines",1,false,
        "Southwest Airlines","SA","Dallas",1967,33,32,"SA917",126,
        "BNA","BOS",depature,arrive,"Sharon Banks","086754392", 25,"123 Boston Avenue","(112)-345-6789",true);

    passenger2 = new Passenger("Berry Field Nashville","Nashville", 3,"BNA","Japan Airlines",1,true,
        "Japan Airline","JAL","Japan",1951,148,190,"JAL678",189,
        "LAX","HND",getDepature,getArrive,"Tanaka Aoi","124569801",28,"1-Chome 19-3 Oshiage","3-5630-1193",true);
  }

  @Test
  void getPassengerName() {
    assertEquals("Sharon Banks",passenger1.getPassengerName());
    assertEquals("Tanaka Aoi",passenger2.getPassengerName());
  }

  @Test
  void getPassportNumber() {
    assertEquals("086754392",passenger1.getPassportNumber());
    assertEquals("124569801",passenger2.getPassportNumber());
  }

  @Test
  void getAge() {
    assertEquals(25,passenger1.getAge());
    assertEquals(28,passenger2.getAge());
  }

  @Test
  void getAddress() {
    assertEquals("123 Boston Avenue",passenger1.getAddress());
    assertEquals("1-Chome 19-3 Oshiage",passenger2.getAddress());
  }

  @Test
  void getPhoneNumber() {
    assertEquals("(112)-345-6789",passenger1.getFlightNumber());
    assertEquals("3-5630-1193",passenger2.getFlightNumber());
  }

  @Test
  void isFrequentFlyer() {
    assertEquals(true,passenger1.isFrequentFlyer());
    assertEquals(true,passenger2.isFrequentFlyer());
  }



  @Test
  public void testEqualsReflective(){
    assertTrue(passenger1.equals(passenger2));

  }

  @Test
  public void testEqualsNullTest() {
    assertFalse(passenger1.equals(null));
    assertFalse(passenger2.equals(null));
  }

  @Test
  public void testEqualsConsistency() {
    assertFalse(passenger1.equals(passenger2));

  }

  @Test
  public void testEqualsTransitivity() {
    assertFalse(passenger1.equals(passenger2) && passenger2.equals(passenger1));
  }

  @Test
  public void testEqualsSymmetery() {
    assertTrue(passenger1.equals(passenger2) == passenger2.equals(passenger1));
  }

  @Test
  void testHashCode() {
    assertFalse(passenger1.hashCode() == passenger2.hashCode());
  }
}