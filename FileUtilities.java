package is.isc.ex4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileUtilities{
	
	public static void main(String[] args) throws FileUtilitiesException {
        String filePath = "example.txt";
        
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new FileUtilitiesException("Failed to read the file: " + filePath);
        }
	}
}