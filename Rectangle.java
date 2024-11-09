package ir.isc.exercise2;

public class Rectangle extends Shape {
	
	private double w;
	private double h;
	
	public Rectangle(double w, double h) {
		this.w = w;
		this.h = h;
	}

	@Override
	public double area() {
		return w * h;
	}

}
