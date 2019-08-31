package by.htp.part02.block8.Ex10;


import java.util.ArrayList;
import java.util.List;

public class AirlineBase {
	
    private List <Airline> lineBase;
    
    public AirlineBase() {
    	lineBase = new ArrayList<Airline>();
    }
    
    public AirlineBase(List<Airline> lineBase) {
    	this.lineBase = lineBase;
    }    

	public List <Airline> getLineBase() {
		return lineBase;
	}
	
	public void addAirline(Airline line) {
		lineBase.add(line);
	}

	public void setLineBase(List <Airline> lineBase) {
		this.lineBase = lineBase;
	}
    
	

}
