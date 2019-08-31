package by.htp.part02.block8.Ex6;

public class Main {

	public static void main(String[] args) {
		
		Time time = new Time (23,0,2);
		
		System.out.println(time.getHour() + ":" + time.getMin() + ":" + time.getSec());
		
		Time addTime = new Time(26,59,59);
		Time newTime;
		
		TimeLogic timeLog = new TimeLogic();
	    newTime = timeLog.changeTime(time, addTime);
	    
	    System.out.println(newTime.getHour() + ":" + newTime.getMin() + ":" + newTime.getSec());

	}

}
