package by.htp.part02.block8.Ex4;

public class DepoLogic {

	 Depo sortTrainByNumber(Depo depo) {
		
		Depo helpDepo = new Depo();
		helpDepo.setTrainList(depo.getTrainList());
		
		boolean isSorted = true;
		
		while(isSorted) {
			isSorted = false;
		    for(int i = 1; i < helpDepo.getTrainList().length; i++) {
			    if(helpDepo.getTrain(i).getTrainNumber() < helpDepo.getTrain(i - 1).getTrainNumber()) {
				   swap(helpDepo.getTrainList(), i, i-1);
				    isSorted = true;
			    }
		    }
		 }
		return helpDepo;
	 }
	
	private static void swap(Train[] trainList, int a, int b ) {
		
		Train tmp = trainList[a];
		trainList[a] = trainList[b];
		trainList[b] = tmp;		
	}	 
	
	public Train getTrainByNumber(Depo depo, int trNumber) {
		Train train = null;	
		   for(int i = 0; i < depo.getTrainList().length; i++) {
			    if(depo.getTrain(i).getTrainNumber() == trNumber) {
				    train = depo.getTrain(i);
				    break;
			    }
		   }
		   if (train == null) {
			   System.out.println("Поезда не существует в этом депо");
		   }
		return train;
	}
	
	 Depo sortTrainByDestanation(Depo depo) {
			
		Depo helpDepo = new Depo();
		helpDepo.setTrainList(depo.getTrainList());
		
		boolean isSorted = true;
		
		while(isSorted == true) {
			isSorted = false;
		    for(int i = 1; i < helpDepo.getTrainList().length; i++) {
			    if(helpDepo.getTrain(i).getCity().compareTo(helpDepo.getTrain(i - 1).getCity()) < 0) {
				   swap(helpDepo.getTrainList(), i, i-1);
				   isSorted = true;
			    } else if (helpDepo.getTrain(i).getCity().compareTo(helpDepo.getTrain(i - 1).getCity()) == 0 
			    		&& 
			    		(depo.getTrain(i).getTime().isBefore(depo.getTrain(i - 1).getTime())) == true) {
			    	swapByTime(helpDepo, i, i-1);
			    	isSorted = true;			    	
			    }			    
		    } 		  
		 }
		return helpDepo;
	 }
	 
	 private static void swapByTime(Depo depo, int a, int b) {
			if (depo.getTrain(a).getTime().isBefore(depo.getTrain(b).getTime()) == true) {
				swap(depo.getTrainList(), a, b);
			}				
	}	 
}
