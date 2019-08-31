package by.htp.part02.block8.Ex5;

/*
 * 5. Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение на 
 * единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и
 * произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод позволяющее 
 * получить его текущее состояние. Написать код, демонстрирующий все возможности класса
 */
public class Counter {

	private int currentValue;
	private int maxValue;
	private int minValue;

	public Counter(int currentValue, int maxValue, int minValue) {
		this.setCurrentValue(currentValue);
		this.setMaxValue(maxValue);
		this.setMinValue(minValue);
	}

	public Counter() {
		setCurrentValue(5);
		setMaxValue(10);
		setMinValue(0);
	}

	public int getCurrentValue() {
		return currentValue;
	}

	public void setCurrentValue(int currentValue) {
		this.currentValue = currentValue;
	}

	public int getMaxValue() {
		return maxValue;
	}

	public void setMaxValue(int maxValue) {
		this.maxValue = maxValue;
	}

	public int getMinValue() {
		return minValue;
	}

	public void setMinValue(int minValue) {
		this.minValue = minValue;
	}

	public int increaseValue() {
		int increaseValue = currentValue + 1;
		
		if (increaseValue < maxValue && increaseValue > minValue) {
			currentValue = increaseValue;
		} else {
			System.out.println("Значение вне заданного диапазона");
		}
		return currentValue;
	}

	public int decreaseValue() {
		int decreaseValue = currentValue - 1;
		
		if (decreaseValue < maxValue && decreaseValue > minValue) {
			currentValue = decreaseValue;
		} else {
			System.out.println("Значение вне заданного диапазона");
		}
		return currentValue;
	}

	public static void main(String[] args) {
		Counter count1 = new Counter();
		count1.setCurrentValue(11);
		count1.decreaseValue();
		System.out.println("Текущее значение: " + count1.getCurrentValue());
	}
}
