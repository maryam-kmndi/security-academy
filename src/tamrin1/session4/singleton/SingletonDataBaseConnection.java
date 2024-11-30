package tamrin1.session4.singleton;

public class SingletonDataBaseConnection {
	private String url;
	//2
	private static SingletonDataBaseConnection instance; 
		
	
	//1
	private SingletonDataBaseConnection() {
		super();
		this.url = "localhost://5000";
	}
	
	//3
	public static SingletonDataBaseConnection getInstance() {
		if (instance == null) {
			instance = new SingletonDataBaseConnection();
		} else {
			System.out.println("Reusing existing connection to: " + instance.url);
		}
		return instance;
	}
	
	public void connect() {
		System.out.println("Connecting to " + url);
	}
	
	public void disconnect() {
		System.out.println("Discounnecting from " + url);
	}
}
