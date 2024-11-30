package tamrin1.session2.inheritance;

public class Main {

	public static void main(String[] args) {
		Car c1 = new Car("black", "2014", 120);
		c1.increamentSpeed(5);
		System.out.println(c1.getSpeed());
		
		LuxCar c2 = new LuxCar("white", "2023", 220, 125);
		System.out.println(c2.canWorkwith(100));
	}

}
