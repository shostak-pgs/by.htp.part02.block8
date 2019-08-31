package by.htp.part02.block8.Ex6;

/*
 * 6. Составьте описание класса для представления времени. Предусмотрте возможности установки времени и
 * изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае
 * недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения времени на заданное
 * количество часов, минут и секунд.
 */
public class Time {

	private int hour;
	private int min;
	private int sec;

	public Time(int hour, int min, int sec) {
		this.setHour(hour);
		this.setMin(min);
		this.setSec(sec);
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		TimeLogic timelog = new TimeLogic();
		this.hour = timelog.checkHour(hour);
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		TimeLogic timeLog = new TimeLogic();
		this.min = timeLog.checkMin(min);
	}

	public int getSec() {
		return sec;
	}

	public void setSec(int sec) {
		TimeLogic timeLog = new TimeLogic();
		this.sec = timeLog.checkSec(sec);
	}

}
