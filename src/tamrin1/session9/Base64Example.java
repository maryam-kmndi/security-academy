package tamrin1.session9;

import java.util.Base64;

public class Base64Example {

	public static void main(String[] args) {
		byte[] byteArray = {10, 20, 30};
		
		String e = Base64.getEncoder().encodeToString(byteArray);
		System.out.println(e);
		
		byte[] d = Base64.getDecoder().decode(e);
		for (byte b : d) {
			System.out.println(b);
		}
	}

}
