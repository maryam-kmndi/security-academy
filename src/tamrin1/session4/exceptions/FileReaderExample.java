package tamrin1.session4.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

	public static void main(String[] args) {
		 String filePath = "example.txt";

	        // Call the method to read and print the file
	        readFile1(filePath);
	}
	
	//try-catch
	public static void readFile1(String filePath) {
		try {
			BufferedReader reader = null;
			reader = new BufferedReader(new FileReader(filePath));
			
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//throw
	public static void readFile2(String filePath) throws IOException {
		BufferedReader reader = null;
		reader = new BufferedReader(new FileReader(filePath));
			
		String line;
		while ((line = reader.readLine()) != null) {
			System.out.println(line);
		}
	}
	
	//close resources
	public static void readFile3(String filePath){
		try (BufferedReader reader = new BufferedReader(new FileReader(filePath));) { 
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
