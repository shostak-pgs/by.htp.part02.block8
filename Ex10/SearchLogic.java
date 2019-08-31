package by.htp.part02.block8.Ex10;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class SearchLogic {	

	static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
	
	public AirlineBase findFlyByDestination(AirlineBase list, String dest) {
		AirlineBase base = new AirlineBase();		
		base.setLineBase(new ArrayList<>(list.getLineBase()));
		
		ListIterator itr = base.getLineBase().listIterator();
		while (itr.hasNext()){
			Airline line = (Airline)itr.next();
			if (!(line.getDestination().equals(dest))) {
				itr.remove();
			}
		}
		
		return base;		
	}

    public AirlineBase findFlyByDay(AirlineBase list, DayOfWeek...days) { 
    	
	    AirlineBase base = new AirlineBase();
	    base.setLineBase(new ArrayList<>(list.getLineBase()));   
	    
	    ListIterator itr = base.getLineBase().listIterator();
	    while (itr.hasNext()){
		    Airline line = (Airline)itr.next();		   
		    boolean remov = true;
		    for (int i = 0; i < line.getDay().length; i++) {
		    	DayOfWeek day = line.getDayByInd(i);		    
		        for (int j = 0; j <days.length; j++) {
		    	    if ((days[j].equals(day))) {		    	    	
		    	    	remov = false;
		    	    	break;
		            }
	            }
	        }
		    if (remov == true) {
		    	 itr.remove();
		    }
        }
	    return base;
    }
    
    public AirlineBase findFlyByDayTime(AirlineBase list, String str, DayOfWeek...days) {
    	
    	AirlineBase lowBase = findFlyByDay(list, days);  
    	LocalTime dT = LocalTime.parse(str, formatter);
    	
    	ListIterator itr = lowBase.getLineBase().listIterator();
	    while (itr.hasNext()){
		    Airline line = (Airline)itr.next();		   
		    boolean remov = true;
		    for (int i = 0; i < line.getTime().size(); i++) {
		    	LocalTime time = line.getTimeByInd(i);  		       
		    	    if (time.isAfter(dT)) {		    	    	
		    	    	remov = false;
		    	    	break;
		            }
	        }	   
		    if (remov == true) {
		    	 itr.remove();
		    }
        }    	
    	return lowBase;
    }
}