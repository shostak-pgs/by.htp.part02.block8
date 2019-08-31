package by.htp.part02.block8.Ex8;

import java.util.ListIterator;
import java.util.Collections;
import java.util.List;

import by.htp.part02.block8.Ex10.Airline;
import by.htp.part02.block8.Ex10.AirlineBase;
import by.htp.part02.block8.Ex9.Book;
import by.htp.part02.block8.Ex9.Library;

public class SearchLogic {
    
	public CustomerReport sortByName(CustomerReport cusRep) {			
			
			CustomerReport helpRep = new CustomerReport();
			helpRep.setCustomerReport(cusRep.getCustomerReport());			
			
			boolean isSorted = true;
			
			while(isSorted) {
				isSorted = false;
			    for(int i = 1; i < helpRep.getCustomerReport().size(); i++) {
				    if (helpRep.getCustomerByNumber(i).getSurname().compareTo(helpRep.getCustomerByNumber(i - 1).getSurname()) < 0) {
					   swap(helpRep.getCustomerReport(), i, i-1);
					   isSorted = true;
				    } else if (helpRep.getCustomerByNumber(i).getSurname().compareTo(helpRep.getCustomerByNumber(i - 1).getSurname()) == 0) {
				    	if (helpRep.getCustomerByNumber(i).getName().compareTo(helpRep.getCustomerByNumber(i - 1).getName()) < 0) {
							   swap(helpRep.getCustomerReport(), i, i-1);
					    isSorted = true;
				    	}
				    }
			    }
			 }
			return helpRep;
		 }
		
		private static void swap(List<Customer> list, int a, int b ) {
			
			Customer tmp = list.get(a);
			list.set(a, list.get(b));
			list.set(b, tmp);	
		}	
	
    public CustomerReport sortByCard(CustomerReport cusRep, int a, int b) {			
			
    	CustomerReport helpRep = new CustomerReport();
		helpRep.setCustomerReport(cusRep.getCustomerReport());	
		
			ListIterator itr = helpRep.getCustomerReport().listIterator();			
			
			    while (itr.hasNext()){
				    Customer customer = (Customer)itr.next();
				    if (!(customer.getCardNumber() > a && customer.getCardNumber() < b)) {
					    itr.remove();
				    }
			    }			
			return helpRep;			
	}
		
}
