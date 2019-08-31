package by.htp.part02.block8.Ex7;

public class Main {

	public static void main(String[] args) {
		
		Point a = new Point (4,3);
		Point b = new Point (-3,-3);
		Point c = new Point (2,7);
		Triangle abc = new Triangle(a, b, c);
		TriangleLogic trlog = new TriangleLogic();
		double ab = trlog.getSide(a,b);
		double bc = trlog.getSide(b,c);
		double ac = trlog.getSide(a,c);
		System.out.printf("Периметр треугольника авс = %.2f %n", trlog.getPerimeter(ab, bc, ac));
		System.out.println("Площадь треугольника авс = " + trlog.getArea(a, b, c));
		Point medians = new Point(trlog.getPointMedianX(a,b,c), trlog.getPointMedianY(a, b, c));
		System.out.printf("Координаты точки пересечения медиан ( %.1f : %.1f )", medians.getX(), medians.getY());
		
		

	}
}
