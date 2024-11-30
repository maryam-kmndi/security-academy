package tamrin1.session2.inheritance;

public class LuxCar extends Car {
	private int voltage;
	
	
	public LuxCar(String color, String model, int speed, int voltage) {
		super(color, model, speed);
		this.voltage = voltage;
	}


	public boolean canWorkwith(int cityVoltage) {
		if (cityVoltage > this.voltage) {
			return true;
		}else {
			return false;
		}
	}
}
