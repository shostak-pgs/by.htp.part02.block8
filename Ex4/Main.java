package by.htp.part02.block8.Ex4;

public class Main {

	public static void main(String[] args) {
		
		DepoLogic dl = new DepoLogic();
		
		Train [] trainList = {
			new Train ("Gomel", 8, 8, 34),
			new Train("Grogno", 3, 9, 45),
			new Train("Gomel", 5, 13, 40),
			new Train("Gomel", 6, 16, 30),
			new Train("Mogilev", 2, 8, 15)
			};
		
		Depo depo1 = new Depo(trainList);
		
		Depo sortedDepo = dl.sortTrainByNumber(depo1);
			 display(sortedDepo);
			 System.out.println();
		
	    int NumberToFind = 3;	
	    System.out.println("Информация о поезде № " + NumberToFind);
	    Train tr = dl.getTrainByNumber(depo1, NumberToFind);
	    System.out.println(tr);
	    
	    System.out.println();
	    Depo sortedDepo1 = dl.sortTrainByDestanation(depo1);
	    System.out.println("Отсортированые по назначению:");
		 display(sortedDepo1);
		 System.out.println();
		}
	
	 public static void display(Depo depo) {
		 		 
		for(int i = 0;  i < depo.getTrainList().length; i++) {		
		    System.out.println(depo.getTrain(i));		 
	    }		  
	 }	 
}


