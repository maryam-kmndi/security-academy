package tamrin1.session3.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class PersonMain {

	public static void main(String[] args) {
		Person p1 = new Person("Mary", "mary@gmail.com", 23);
		Person p2 = new Person("Amir", "amir@gmail.com", 22);
		Person p3 = new Person("Negar", "negar@gmail.com", 9);
		Person p4 = new Person("Nima", "nima@gmail.com", 4);
		Person p5 = new Person("Ali", "ali@gmail.com", 6);
		
		//List: get objects, can be repeated, save by order
		//first way
		List<Person> persons1 = new ArrayList<>();	
		persons1.add(p1);
		persons1.add(p2);
		persons1.add(p3);
		persons1.add(p4);
		
		//second way
		Person[] personsArray = {p1, p4};
		List<Person> persons2 = Arrays.asList(personsArray);
		
		//third way
		List<Person> persons3 = List.of(p1, p2, p3, p4, p5);
	
		//display list
		System.out.println(persons1);
		
		//utilites
		int persons1Size = persons1.size();	//returns size of list
		
		List<Person> childs = persons1.subList(0, 2);//make copy of (firstIndex, lastIndex)
		
		persons1.add(2,p5);	//Add new obj to index 2
		
		persons1.remove(0);	//remove from index 0
		
//		persons1.clear();  //make it an empty list
	
//		Collections.copy(persons3, persons2);	//(destination, source) d >= s
//		boolean disjoint = Collections.disjoint(persons1, childs);	//return t if 2 collections have no elements in common
	
		int indexof = persons3.indexOf(p4);	//returns index or -1 if not found
		
		//find first solutaion
		for (Person p : persons3) {
			if (p.getName().equals("Mary")) {	//we determine which property check for equal by overriding it in Person class
				System.out.println("Find!");
			}
		}
		//find second solutaion
		boolean contains = persons3.contains("mary");
		
		//sort
		Collections.sort(persons1, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getAge() - o2.getAge();
			}
			
		});	//without Comparable implementation in class
		
		Collections.sort(persons1);	//Comparable methods implemented in Person class
		
		
		//Iterators use to iterate over collections and change them
		for (Iterator iterator = persons1.iterator(); iterator.hasNext();) {
			Person person = (Person) iterator.next();
			person.setName(person.getName().toUpperCase());
			if (person.getAge() < 10) {
				iterator.remove();
			}
		};
		System.out.println(persons1);
		
	}

}
