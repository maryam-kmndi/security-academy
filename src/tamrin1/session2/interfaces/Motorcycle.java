package tamrin1.session2.interfaces;

public class Motorcycle implements Vehicle {
	int speed;
	int gear;
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getGeer() {
		return gear;
	}
	public void setGeer(int geer) {
		this.gear = geer;
	}
	@Override
	public void changeGear(int a) {
		gear = a;
		
	}
	@Override
	public void speedUp(int a) {
		speed += a;
	}
	@Override
	public void applyBrakes(int a) {
		speed -= a;
	}
	@Override
	public void printStates() {
		System.out.println("Motorcycle speed: " + speed + " gear: " + gear);		
	}
}
