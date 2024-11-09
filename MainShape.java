package ir.isc.exercise2;

public class MainShape {

	public static void main(String[] args) {

		Circle c = new Circle(2);
		Rectangle r = new Rectangle(3, 4);
		Triangle t = new Triangle(2, 4);
		
		System.out.println(c.area());
		System.out.println(r.area());
		System.out.println(t.area());
	}

}
