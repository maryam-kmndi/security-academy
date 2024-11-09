package ir.isc.exercise2;

public class Circle extends Shape {
	private int r;
	public Circle(int r) {
		this.r = r;
	}

	@Override
	public double area() {
		return r * r * 3.14;
	}

}
