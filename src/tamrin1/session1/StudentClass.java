package tamrin1.session1;

//Class (access-modifier	class-keyword	class-name{...})
public class StudentClass {
	//Properties
	private String name;
	private int age;
	public String field;
	
	//Constructor (ALT + SHIFT + S)
	public StudentClass(String name, int age, String field) {
		super();
		this.name = name;
		this.age = age;
		this.field = field;
	}
	
	//Getters & Setters (ALT + SHIFT + S)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//Methods
	public void printStudent() {
		System.out.println("Student " + name + " is " + age + " and study in " + field + " filed.");
	}
	
	
	//to call it
	public static void main(String[] args) {
		StudentClass s1 = new StudentClass("Mary", 23, "computer");
		s1.printStudent();
		s1.setAge(22);
		s1.field = "Accounting";	//Public property is reachable this way
		s1.printStudent();
		
	}

}
