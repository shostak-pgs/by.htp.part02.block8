package by.htp.part02.block8.Ex9;

import java.util.ArrayList;
import java.util.List;

public class Autors {	
    private List<String> autors;
    
    public Autors(String[] names) {
    	this.autors = new ArrayList<String>();    	
    	for(String str : names) {
    		autors.add(str);
    	}
    }
    
    public Autors() {
    	this.autors = new ArrayList<String>();
    }
    
    public List<String> getAutors() {
    	return this.autors;
    }
    
    public void setAutors(List<String> autors) {
    	this.autors = autors;
    }
    
    public void addAutors(String autor) {
    	this.autors.add(autor);
    }
    
    @Override
	public String toString() {
		String autors = "";
		
		for(String str : this.autors) {
			autors = autors + str + ", ";
		}
		autors = autors.substring(0, autors.length() - 2);
		return autors;
	}    
}
