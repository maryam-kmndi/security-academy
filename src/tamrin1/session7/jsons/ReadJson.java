package tamrin1.session7.jsons;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;


public class ReadJson {

	public static void main(String[] args) throws Exception {
		File file = new File("data-person.json");
		ObjectMapper objMap = new ObjectMapper();
		Person p = objMap.readValue(file, Person.class);
		System.out.println(p);
	 
//		System.out.println("Exists: " + file.exists());
//		System.out.println("Readable: " + file.canRead());
//		System.out.println("Path: " + file.getAbsolutePath());

	}

}
