package is.isc.ex4;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class Serialize {

	public static void main(String[] args) {
		
		List<String> accounts = List.of("ac4546", "ac9898");
		User user1 = new User("Mary", accounts, "6037997212345678", "@12345");
		
	        try (FileOutputStream fileOut = new FileOutputStream("user.ser");
	             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
	            out.writeObject(user1);
	            System.out.println("Serialized data is saved in user.ser");
	        } catch (IOException i) {
	            i.printStackTrace();
	        }
	}

}
