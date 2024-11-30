package tamrin1.session3.collections;

import java.util.Objects;

public class Person implements Comparable<Person> {		//implement compareTo method for sort
	private String name;
	private String email;
	private int age;
	
	public Person(String name, String email, int age) {
		super();
		this.name = name;
		this.email = email;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person name=" + name + ", email=" + email + ", age=" + age +"\n";
	}

	@Override
	public int hashCode() {
		return Objects.hash(age);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age;
	}

	@Override
	public int compareTo(Person o) {
		return o.age - this.age;
	}
	
	

}
