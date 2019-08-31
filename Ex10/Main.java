package by.htp.part02.block8.Ex10;

import java.time.DayOfWeek;
import java.util.List;

public class Main {


	public static void main(String[] args) {
		AirlineBase dBase = new AirlineBase();
		dBase.addAirline(new Airline("Minsk-Moscow", "Boing-900", 368, new DayOfWeek[] {DayOfWeek.MONDAY, DayOfWeek.SUNDAY}, "09:54", "21:00"));
		dBase.addAirline(new Airline("Minsk-Sri-Lanka", "Boing-367", 390, new DayOfWeek[] {DayOfWeek.MONDAY, DayOfWeek.FRIDAY}, "09:54", "22:40"));
		dBase.addAirline(new Airline("Minsk-Moscow", "Boing-500", 370, new DayOfWeek[] {DayOfWeek.THURSDAY, DayOfWeek.SUNDAY}, "09:54", "07:10"));
		
		List<Airline> line = dBase.getLineBase();       
        
        SearchLogic sl = new SearchLogic();
       
        String destination = "Minsk-Moscow";
        System.out.println("Все рейсы " + destination + " :");        
        AirlineBase sortedBase1 = sl.findFlyByDestination(dBase, destination);       
        sortedBase1.getLineBase().forEach(a -> System.out.println(a));
        
        
        DayOfWeek[] d = {DayOfWeek.THURSDAY, DayOfWeek.FRIDAY};
        System.out.println("Заданный день/дни:");
        for (DayOfWeek z : d) {
    	   System.out.print(z +" ");
        }
        System.out.println();
        System.out.println("Все рейсы в заданный день :");        
        AirlineBase sortedBase2 = sl.findFlyByDay(dBase, d);       
        sortedBase2.getLineBase().forEach(a -> System.out.println(a));
        
        DayOfWeek[] d2 = {DayOfWeek.THURSDAY, DayOfWeek.FRIDAY};
        String time = "10:00";
        System.out.println("Заданный день/дни:");
        for (DayOfWeek z : d2) {
    	   System.out.print(z +" ");
        }
        System.out.println();
        System.out.println("Все рейсы в заданный(ые) дни после " + time);        
        AirlineBase sortedBase3 = sl.findFlyByDayTime(dBase, time, d2);       
        sortedBase3.getLineBase().forEach(a -> System.out.println(a));
	}

}
