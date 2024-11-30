package tamrin1.session3.function;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import tamrin1.session3.collections.Person;

public class FunctionsUsage {

	public static void main(String[] args) {
		//sort persons list and returns 5 first whom older than 10
		Person p1 = new Person("Mary", "mary@gmail.com", 23);
		Person p2 = new Person("Amir", "amir@gmail.com", 22);
		Person p3 = new Person("Negar", "negar@gmail.com", 19);
		Person p4 = new Person("Nima", "nima@gmail.com", 4);
		Person p5 = new Person("Ali", "ali@gmail.com", 6);
		Person p6 = new Person("Reza", "reza@gmail.com", 16);
		Person p7 = new Person("Fateme", "fateme@gmail.com", 60);
		Person p8 = new Person("Zahra", "zahra@gmail.com", 20);
		Person p9 = new Person("Nahid", "nahid@gmail.com", 35);
		Person p10 = new Person("Pash", "pash@gmail.com", 4);
		
		List<Person> persons = new ArrayList<>();
		persons.add(p1);
		persons.add(p2);
		persons.add(p3);
		persons.add(p4);
		persons.add(p5);
		persons.add(p6);
		persons.add(p7);
		persons.add(p8);
		persons.add(p9);
		persons.add(p10);
		
		
		//without function
		Collections.sort(persons);
		
		int count = 0;
		for (Person person : persons) {
			if (count >= 5) {
				break;	
			}
			if (person.getAge() > 10) {
				count++;
				System.out.println(person.getName());
			}
		}
		
		System.out.println("____________________");
		
		//Using functions
		persons	
				.stream()
				.sorted()
				.limit(5)
				.filter(p -> p.getAge() > 10)
				.map(t -> t.getName())
				.forEach(t -> System.out.println(t));
				
		persons.replaceAll(p -> {
			p.setAge(p.getAge() + 2);
			return p;
		});
				
	}

}
