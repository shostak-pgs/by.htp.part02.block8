package by.htp.part02.block8.Ex7;

/*
 * 7. Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления
 * площади, периметра и точки пересечения медиан.
 */

public class Triangle {

	private Point a;
	private Point b;
	private Point c;

	public Triangle(Point a, Point b, Point c) {
		this.setA(a);
		this.setB(b);
		this.setC(c);
	}

	public Point getA() {
		return a;
	}

	public void setA(Point a) {
		this.a = a;
	}

	public Point getB() {
		return b;
	}

	public void setB(Point b) {
		this.b = b;
	}

	public Point getC() {
		return c;
	}

	public void setC(Point c) {
		this.c = c;
	}
 
	
}
