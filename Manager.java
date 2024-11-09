package ir.isc.exercise2;

public class Manager extends Person {

	public Manager(String name) {
		super(name);
	}

	@Override
	public void notifyy() {
		System.out.println("Meet Manager " + getName());

	}

}
