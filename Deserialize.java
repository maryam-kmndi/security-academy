package is.isc.ex4;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialize {

	public static void main(String[] args) {

		User user2 = null;
		
		try (FileInputStream fileIn = new FileInputStream("user.ser");
				ObjectInputStream in = new ObjectInputStream(fileIn)) {
			user2 = (User) in.readObject();
			System.out.println("Deserialized user: " + user2);
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
		
	
	}
}
