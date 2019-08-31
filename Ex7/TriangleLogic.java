package by.htp.part02.block8.Ex7;

public class TriangleLogic {
	
	public double getSide(Point a,Point b) {
		
		double side = Math.sqrt(Math.pow((b.getX() - a.getX()), 2) + Math.pow(b.getY() - a.getY(), 2));
		return side;
	}
	
	public double getPerimeter( double ab, double bc, double ac) {
		double perimeter = ab + bc + ac;
		return perimeter;
	}
	
	public double getArea(Point a, Point b, Point c) {
		double area = Math.abs(((a.getX() - c.getX()) * (b.getY() - c.getY()) - (b.getX() - c.getX()) * (a.getY() - c.getY())) / 2);
		return area;
	}
	
	public double getPointMedianX(Point a, Point b, Point c) {		
		double medianX = ((a.getX() * 1.0 + b.getX() * 1.0 + c.getX() * 1.0) / 3);		
		return medianX;
		
	}
	public double getPointMedianY(Point a, Point b, Point c) {
		double medianY = ((a.getY() + b.getY() + c.getY()) / 3);		
		return medianY;
	}
    
   
}
