package ir.isc.exercise2;

public class Triangle extends Shape {

	private double h;
	private double b;
	
	
	public Triangle(double h, double b) {
		this.h = h;
		this.b = b;
}

	@Override
	public double area() {		
		return h * b;
	}

}
