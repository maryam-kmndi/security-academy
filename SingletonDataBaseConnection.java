package is.isc.ex4;

public class SingletonDataBaseConnection {

	//private constructor to prevent instantiation
	private SingletonDataBaseConnection() {
		super();
		this.connectionURL = "localhost:8088/mydb";
	}

	private String connectionURL;
	private static SingletonDataBaseConnection instance;
	
	//Create a static creation method that acts as a constructor
	public static SingletonDataBaseConnection getInstance() {
	        if (instance == null) {
	            instance = new SingletonDataBaseConnection();
	        } else {
	            System.out.println("Reusing existing connection to: " + instance.connectionURL);
	        }
	        return instance;
	    }
	
	
	public void connect() {
		System.out.println("Connecting to " + connectionURL);
	}
	
	public void disconnect() {
		System.out.println("Discounnecting from " + connectionURL);
	}

}
