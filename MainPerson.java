package ir.isc.exercise2;

public class MainPerson {

	public static void main(String[] args) {
		Person p1 = new Student("Mary");
		p1.awake();
		p1.notifyy();
		
		Person p2 = new Teacher ("Amir");
		p2.awake();
		p2.notifyy();
		
		Person p3 = new Manager ("Zahra");
		p3.awake();
		p3.notifyy();
	}

}
