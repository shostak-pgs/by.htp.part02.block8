package by.htp.part02.block8.Ex8;

import java.util.ArrayList;
import java.util.List;

public class CustomerReport {
	private List<Customer> rep;
	
	public CustomerReport () {
		rep = new ArrayList<Customer>();
	}
	
	public CustomerReport (Customer...cust) {
		this.rep = new ArrayList<Customer>();
		for (Customer b : cust) {
			rep.add(b);
		}
	}
	
	public void addCustomer(Customer...cus) {
		
		for (Customer b : cus) {
			rep.add(b);
		}
	}
	
public void setCustomerReport(List<Customer>list) {	
	
		for (Customer b : list) {
			rep.add(b);
		}
	}

    public Customer getCustomerByNumber(int i) {
	    return this.rep.get(i);
    }

	public List<Customer> getCustomerReport() {
		return this.rep;
	}
}
