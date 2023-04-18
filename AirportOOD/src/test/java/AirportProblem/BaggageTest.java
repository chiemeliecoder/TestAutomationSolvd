package AirportProblem;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Calendar;
import java.util.Date;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BaggageTest {
  private Baggage baggage1;
  private Baggage baggage2;
  private Passenger passenger1;
  private Passenger passenger2;
  private Flight flight1;
  private Flight flight2;
  private Gate gate1;
  private Gate gate2;
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

    gate1 =  new Gate("Berry Field Nashville","Nashville", 3,"BNA","Southwest Airlines",1,false,
        "south Terminal",4,false,18000000,"Dunkin Donuts",1000000.00,"Domestic flights",4,flight1,flight1,"C&D",true);

    gate2 = new Gate("Berry Field Nashville","Nashville", 3,"BNA","Japan Airlines",1,true,
        "North Terminal",4,true,18000000,"Chick Fil-A",1000000.00,"International flights",4,flight2,flight2,"A&B",true);

    passenger1 = new Passenger("Berry Field Nashville","Nashville", 3,"BNA","Southwest Airlines",1,false,
        "Southwest Airlines","SA","Dallas",1967,33,32,"SA917",126,
        "BNA","BOS",depature,arrive,"Sharon Banks","086754392", 25,"123 Boston Avenue","(112)-345-6789",true);

    passenger2 = new Passenger("Berry Field Nashville","Nashville", 3,"BNA","Japan Airlines",1,true,
        "Japan Airline","JAL","Japan",1951,148,190,"JAL678",189,
        "LAX","HND",getDepature,getArrive,"Tanaka Aoi","124569801",28,"1-Chome 19-3 Oshiage","3-5630-1193",true);


    baggage1 = new Baggage("Berry Field Nashville","Nashville", 3,"BNA","Southwest Airlines",1,false,
        "Southwest Airlines","SA","Dallas",1967,33,32,"SA917",126,
        "BNA","BOS",arrive,depature,"Sharon Banks","086754392", 25,"123 Boston Avenue","(112)-345-6789",true,50,"SA972294",passenger1,flight1,gate1);

    baggage2 = new Baggage("Berry Field Nashville","Nashville", 3,"BNA","Japan Airlines",1,true,
        "Japan Airline","JAL","Japan",1951,148,190,"JAL678",189,
        "LAX","HND",getDepature,getArrive,"Tanaka Aoi","124569801",28,"1-Chome 19-3 Oshiage","3-5630-1193",true,23,"JAL787219",passenger2,flight2,gate2);
  }

  @Test
  void getWeight() {
    assertEquals(50,baggage1.getWeight());
    assertEquals(23,baggage1.getWeight());
  }

  @Test
  void getTagNumber() {
    assertEquals("SA972294",baggage1.getTagNumber());
    assertEquals("JAL787219",baggage2.getTagNumber());

  }

  @Test
  void getOwner() {
    assertEquals(passenger1,baggage1.getOwner());
    assertEquals(passenger2,baggage2.getOwner());
  }

  @Test
  void getFlight() {
    assertEquals(flight1,baggage1.getFlight());
    assertEquals(flight2,baggage2.getFlight());
  }

  @Test
  void getGate() {
    assertEquals(gate1,baggage1.getGate());
    assertEquals(gate2,baggage2.getGate());
  }

  @Test
  public void testEqualsReflective(){
    assertTrue(baggage1.equals(baggage2));

  }

  @Test
  public void testEqualsNullTest() {
    assertFalse(baggage1.equals(null));
    assertFalse(baggage2.equals(null));
  }

  @Test
  public void testEqualsConsistency() {
    assertFalse(baggage1.equals(baggage2));

  }

  @Test
  public void testEqualsTransitivity() {
    assertFalse(baggage1.equals(baggage2) && baggage2.equals(baggage1));
  }

  @Test
  public void testEqualsSymmetery() {
    assertTrue(baggage1.equals(baggage2) == baggage2.equals(baggage1));
  }

  @Test
  void testHashCode() {
    assertFalse(baggage1.hashCode() == baggage2.hashCode());
  }
}