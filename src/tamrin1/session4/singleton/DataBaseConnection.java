package tamrin1.session4.singleton;

public class DataBaseConnection {
	private String url;
	
	public DataBaseConnection() {
		super();
		this.url = "localhost://5000";
	}

	public void connect() {
		System.out.println("Connecting to " + url);
	}
	
	public void disconnect() {
		System.out.println("Discounnecting from " + url);
	}
}
