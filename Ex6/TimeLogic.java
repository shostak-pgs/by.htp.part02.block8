package by.htp.part02.block8.Ex6;

public class TimeLogic {

	public int checkHour(int hour) {
		if (hour >= 0 && hour <= 24) {
			return hour;
		} else {
			int zero = 0;
			return zero;
		}
	}

	public int checkMin(int min) {
		if (min >= 0 && min <= 60) {
			return min;
		} else {
			int zero = 0;
			return zero;
		}
	}

	public int checkSec(int sec) {
		if (sec >= 0 && sec <= 60) {
			return sec;
		} else {
			int zero = 0;
			return zero;
		}
	}

	public Time changeTime( Time time, Time addTime) {
		int hour = 0;
		int min = 0;
		int sec = 0;

		int secTime = time.getHour() * 3600 + time.getMin() * 60 + time.getSec();
		int secAddTime = addTime.getHour() * 3600 + addTime.getMin() * 60 + addTime.getSec();
		int s = secTime + secAddTime;

		if (s <= 86400) {
			sec = s % 60;
			int allMin = (s - sec) / 60;
			min = allMin % 60;
			hour = (allMin - min) / 60;
		} else if (s > 86400) {
			s = s - 86400;
			sec = s % 60;
			int allMin = (s - sec) / 60;
			min = allMin % 60;
			hour = (allMin - min) / 60;
			
		}
		return new Time(hour, min, sec);
	}
}
