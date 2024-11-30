package exercise8;

public class Main {

	public static void main(String[] args) {
		HttpConnection validConncection = 
				new HttpConnection.Builder()
								  .setUsername("mary")
								  .setPassword("1234")
								  .setUrl("http://localhost")
								  .build();
		
		HttpConnection invalidConncection = 
				new HttpConnection.Builder()
				.setUsername("amir")
				.setPassword("4321")
				.setUrl("localhost")
				.build();

	}

}
