package AirportProblem;

import java.util.Calendar;
import java.util.Date;

public class MainClass {
  public static void main(String[] args) {

    Calendar cal = Calendar.getInstance();
    cal.set(Calendar.HOUR_OF_DAY, 12);
    cal.set(Calendar.MINUTE, 45);
    Date arrive = cal.getTime();

    Calendar cal2 = Calendar.getInstance();
    cal2.set(Calendar.HOUR_OF_DAY, 9);
    cal2.set(Calendar.MINUTE, 35);
    Date depature = cal2.getTime();

    Calendar cal3 = Calendar.getInstance();
    cal3.set(Calendar.HOUR_OF_DAY, 11);
    cal3.set(Calendar.MINUTE, 50);
    Date getArrive= cal3.getTime();

    Calendar cal4 = Calendar.getInstance();
    cal4.set(Calendar.HOUR_OF_DAY, 9);
    cal4.set(Calendar.MINUTE, 30);
    Date getDepature=cal4.getTime();

    Airline air= new Flight("Berry Field Nashville","Nashville", 3,"BNA","Southwest Airlines",1,false,
        "Southwest Airlines","SA","Dallas",1967,33,32,"SA917",126,
        "BNA","BOS",depature,arrive);

    Flight fair =new Flight("Berry Field Nashville","Nashville", 3,"BNA","Japan Airlines",1,true,
        "Japan Airline","JAL","Japan",1951,148,190,"JAL678",189,"LAX","HND",getDepature,getArrive);

    AbstractAirport airport = new Gate("Berry Field Nashville","Nashville", 3,"BNA","Japan Airlines",1,true,
        "North Terminal",4,true,18000000,"Chick Fil-A",1000000.00,"International flights",4,air,fair,"A&B",true);

    Gate gate1 = new Gate("Berry Field Nashville","Nashville", 3,"BNA","Japan Airlines",1,true,
        "North Terminal",4,true,18000000,"Chick Fil-A",1000000.00,"International flights",4,air,fair,"A&B",true);

    Passenger passenger1 = new Passenger("Berry Field Nashville","Nashville", 3,"BNA","Japan Airlines",1,true,
        "Japan Airline","JAL","Japan",1951,148,190,"JAL678",189,
        "LAX","HND",getDepature,getArrive,"Tanaka Aoi","124569801",28,"1-Chome 19-3 Oshiage","3-5630-1193",true);

    Baggage baggage1 = new Baggage("Berry Field Nashville","Nashville", 3,"BNA","Japan Airlines",1,true,
        "Japan Airline","JAL","Japan",1951,148,190,"JAL678",189,
        "LAX","HND",getDepature,getArrive,"Tanaka Aoi","124569801",28,"1-Chome 19-3 Oshiage","3-5630-1193",true,23,"JAL787219",passenger1,fair,gate1);

    Staff staff1 = new MaintenanceStaff("Berry Field Nashville","Nashville", 3,"BNA","Japan Airlines",1,true,
        "Mary Sato",30,"Airline Customer Service Agent","Customer service",71340,"JAL339850","(214)-789-4371","Sato.s@japanairlines.com",5,"Customer Support",6,true,37.01,"Airport Worker United");

    System.out.println(airport);
    System.out.println(gate1);
    System.out.println(passenger1);
    System.out.println(baggage1);
    System.out.println(staff1);



  }

}
