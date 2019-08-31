package by.htp.part02.block8.Ex4;

public class Depo {
	
	private Train[] trainList;
	int counter;
	
	public Depo() {
		trainList = new Train[5];
		counter = 0;
	}
	
	public Depo(Train[] trainList) {
		this.trainList = trainList;
		counter = trainList.length;
	}

	public Train[] getTrainList() {
		return trainList;
	}
	
	public Train getTrain(int i) {
		return trainList[i];
	}
	
	public void addTrain(Train train) {
		if (this.counter < 5) {
			this.trainList[counter + 1] = train;
			counter++;
		} else {
			System.out.println("Depo is full. Create new depo");
		}
	}	

	public void setTrainList(Train[] trainList) {
		this.trainList = trainList;
		this.counter = trainList.length;
	}
}
