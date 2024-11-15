package is.isc.ex4;

public class DataBaseConnectoin {
	
	public DataBaseConnectoin() {
		super();
		this.connectionURL = "localhost:8080/mydb";
	}

	private String connectionURL;
	
	public void connect() {
		System.out.println("Connecting to " + connectionURL);
	}
	
	public void disconnect() {
		System.out.println("Discounnecting from " + connectionURL);
	}
	
}	
