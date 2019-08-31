package by.htp.part02.block8.Ex2;

/*
 * 2. Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами. Добавьте конструктор, 
 * инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей экземпляра класса.
 */
public class Test2 {

	private int a;
	private int b;

	Test2(int a, int b) {
		this.a = a;
		this.b = b;
	}

	Test2() {
		a = 12;
		b = 34;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getA() {
		return a;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getB() {
		return b;
	}

	public static void main(String[] args) {
	}
}

