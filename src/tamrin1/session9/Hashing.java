package tamrin1.session9;

import java.security.MessageDigest;
import java.util.Base64;

public class Hashing {
	public static void main(String[] args) throws Exception{
			
		String input = "password1234";
		
		MessageDigest digest = MessageDigest.getInstance("MD5");
		
		byte[] hashBytes = digest.digest(input.getBytes());
		
		String base64Hash = Base64.getEncoder().encodeToString(hashBytes);
		System.out.println(base64Hash);
	}
}

