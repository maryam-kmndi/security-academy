package ir.isc.exercise2;

public class Student extends Person {

	public Student(String name) {
		super(name);
	}

	@Override
	public void notifyy() {
		System.out.println("Send an SMS to student " + getName());
	}

	

}
