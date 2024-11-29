package exercise7.json;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ReadAccount {

	public static void main(String[] args) throws Exception {
		File file = new File("account.json");
		ObjectMapper mapper = new ObjectMapper();
		Account acc = mapper.readValue(file, Account.class);
		System.out.println(acc);
		
	}

}
