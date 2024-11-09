package ir.isc.exercise2;

public class Teacher extends Person {

	public Teacher(String name) {
		super(name);
	}

	@Override
	public void notifyy() {
		System.out.println("call proffessor " + getName());
	}

}
