package tamrin1.session4.singleton;

public class Main {

	public static void main(String[] args) {
		DataBaseConnection db1 = new DataBaseConnection();
		db1.connect();
		db1.disconnect();
		
		DataBaseConnection db2 = new DataBaseConnection();
		db2.connect();
		db2.disconnect();
		
		System.out.println("__________________________");
		
		SingletonDataBaseConnection db3 = SingletonDataBaseConnection.getInstance();
		db3.connect();
		db3.disconnect();
		
		SingletonDataBaseConnection db4 = SingletonDataBaseConnection.getInstance();
		db4.connect();
		db4.disconnect();
	}

}
