package by.htp.part02.block8.Ex1;

/*
 * 1. Создайте класс Test1 c двумя переменными. Добавьте метод вывода на экран и методы изменения этих переменных.
 *  Добавьте метод, который находит сумму значений этих переменных, и метод, который находит наибольшее значение из
 *   этих двух переменных.
 */
public class Test1 {
	private int a;
	private int b;

	public Test1(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public void setA(int a) {
		this.a = a;
	}

	public void SetB(int b) {
		this.b = b;
	}

	static void display(int a, int b) {
		System.out.println(a + ", " + b);
	}

	static int sumVariable(int a, int b) {
		int sum = a + b;
		System.out.println("Сумма переменных = " + sum);
		return sum;
	}

	static int maxVariable(int a, int b) {
		int max = a;
		if (a > b) {			
			System.out.println("a is max");
		} else if (b > a) {
			max = b;
			System.out.println("b is max");
		}
		return max; 
	}

	public static void main(String[] args) {
		Test1 test1 = new Test1(5, 6);
		display(test1.a, test1.b);
		test1.sumVariable(test1.a, test1.b);
		test1.maxVariable(test1.a, test1.b);

	}

}
