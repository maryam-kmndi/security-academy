package tamrin1.session7.jsons;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Person {
	private int id;
	private String name;
	@JsonProperty("ages")
	private int age;
	private String[] hobbies;
	
	
	public Person() {
		super();
	}

	public Person(int id, String name, int age, String[] hobbies) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.hobbies = hobbies;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public String[] getHobbies() {
		return hobbies;
	}
	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + ", hobbies=" + Arrays.toString(hobbies) + "]";
	}
}
