 package by.htp.part02.block8.Ex4;


import java.time.LocalTime;
import java.util.Collections;
import java.util.Date;

/*
 * 4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления. Создайте
 * данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по номерам
 * поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем. Добавьте
 * возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами назначения должны
 * быть упорядочены по времени отправления
 */
public class Train {
	 private String city;
	 private int trainNumber;
	 private LocalTime time;
	 
	 public Train(String city, int trainNumber, int...time) {
		 this.city = city;
		 this.trainNumber = trainNumber;
		 this.time = LocalTime.of(time[0], time[1]);
	 }
	 
	public void setTrainNumbere(int i) {
			this.trainNumber = i;
	}
	 
	public int getTrainNumber() {
		return trainNumber;
	}
	
	public LocalTime getTime() {
		return time;
	}
	
	public void setTime(LocalTime time) {
		this.time = time;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		String str = ("Пункт назначения - " + this.city +  "; " +"Номер поезда - "+ this.trainNumber + "; " +  "ремя отправления- " + this.time);
	    return str;
	}
}
