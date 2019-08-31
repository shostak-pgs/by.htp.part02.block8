package by.htp.part02.block8.Ex8;

public class Main {

	public static void main(String...args) {
		
	    CustomerReport cusList = new CustomerReport();
	    
	    cusList.addCustomer(new Customer(1, "Shostak", "Artyom", "Valentinovich", "Mogilev", 111111, 123456789));    
	    cusList.addCustomer(new Customer(2, "Shostak", "Alina", "Vladimirovna", "Mogilev", 222222, 123654789));
	    cusList.addCustomer(new Customer(3, "Shostak", "David", "Arch", "Mogilev", 555555, 123986789));
	    cusList.addCustomer(new Customer(4, "Kotlar", "Sergey", "Vladimirovich", "Bobruisk", 444444, 127856789));
	    cusList.addCustomer(new Customer(5, "Kotlar", "Aleksey", "Sergeevich", "Bobruisk", 333333, 127800789));
	   
	    SearchLogic sl = new SearchLogic();
	    
	    
	    System.out.printf("Все покупатели в алфавитном порядке: %n");
	    CustomerReport SearchRez1 = sl.sortByName(cusList);
	    
	    print(SearchRez1);
	    System.out.println();
	    
	    int cardNumber1 = 200000;
	    int cardNumber2 = 500000;
	    System.out.printf("Все покупатели c картами от %s до %s: %n", cardNumber1, cardNumber2);
	    CustomerReport SearchRez2 = sl.sortByCard(cusList, cardNumber1, cardNumber2);
	    
	    printWithCard(SearchRez2);
	    System.out.println();
	    
	    }	
	
	    public static void print(CustomerReport rep) {
	    	for (Customer cus : rep.getCustomerReport()) {
	    		System.out.println(cus);
	    	}
	    }
	    	
	    public static void printWithCard(CustomerReport rep) {
	 	   for (Customer cus : rep.getCustomerReport()) {
	 	      System.out.println(cus + ", карта № "+ cus.getCardNumber());
	 	   }
	    }
}

