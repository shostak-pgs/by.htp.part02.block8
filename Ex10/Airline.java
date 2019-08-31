package by.htp.part02.block8.Ex10;

import java.time.LocalTime;
import java.time.DayOfWeek;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/*
 * 10. Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- 
 * методы и метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими 
 * конструкторами и методами. Задать критерии выбора данных и вывести эти данные на консоль. 
 * Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели. Найти и вывести:
 * a) список рейсов для заданного пункта назначения;
 * b) список рейсов для заданного дня недели;
 * c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
 */
public class Airline {
	
    private String destination;
    private int flight;
    private String type;
    private DayOfWeek[] day;
    private List<LocalTime> time;
    
    static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
    
    public Airline(String destination, String type, int flight, DayOfWeek[] day, String...args) {
    	
    	this.destination = destination;
    	this.flight = flight;
    	this.type = type;
    	this.day = day;
    	this.time = new ArrayList<LocalTime>();
    	for (String str : args) {
    	    time.add(LocalTime.parse(str, formatter));
    	}
    }
    
	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getFlight() {
		return flight;
	}

	public void setFlight(int flight) {
		this.flight = flight;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<LocalTime> getTime() {
		return time;
	}
	
	public LocalTime getTimeByInd(int i) {
		return time.get(i);
	}	

	public void setTime(List<LocalTime> time) {
		this.time = time;
	}
	
	public DayOfWeek[] getDay() {
		return this.day;
	}	
	
	public DayOfWeek getDayByInd(int i) {
		return this.day[i];
	}	

	public void setDay(DayOfWeek[] day) {
		this.day = day;
	}
	
	@Override
	public String toString() {
		//пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
		String str =("Рейс № " + this.flight +  " " + this.destination +", тип самолета: " + this.type + ". Рейс(ы) : ");
		
		for(LocalTime current : time ) {
    	   str = str + current.format(formatter) +"  ";
    	}		
		return str;		
	}

}
