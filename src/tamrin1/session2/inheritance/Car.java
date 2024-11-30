package tamrin1.session2.inheritance;

public class Car {
	private String color;
	private String model;
	private int speed;
	
	public Car(String color, String model, int speed) {
		super();
		this.color = color;
		this.model = model;
		this.speed = speed;
	}



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public String getModel() {
		return model;
	}



	public void setModel(String model) {
		this.model = model;
	}



	public int getSpeed() {
		return speed;
	}



	public void setSpeed(int speed) {
		this.speed = speed;
	}



	public int increamentSpeed(int i) {
		if (i >= 0) {
			this.speed += i;
		}else {
			System.out.println("Invrement can not be negative");
		}
		return this.speed;
	}
	
	public int decrementSpeed(int d) {
		if (d >= 0 && d < this.speed) {
			this.speed -= d;
		} else {
			System.out.println("Decrement can't be negative or greater than current speed.");
		}
		return this.speed;
	}



	@Override
	public String toString() {
		return "Car [color=" + color + ", model=" + model + ", speed=" + speed + "]";
	}

}
