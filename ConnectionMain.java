package is.isc.ex4;

public class ConnectionMain {

	public static void main(String[] args) {
		//simple DB connection
		DataBaseConnectoin db1 = new DataBaseConnectoin();		
		db1.connect();
		db1.disconnect();
		
		DataBaseConnectoin db2 = new DataBaseConnectoin();
		db2.connect();
		db2.disconnect();
		
		//singleton DB connection
		SingletonDataBaseConnection db3 = SingletonDataBaseConnection.getInstance();
		db3.connect();
		db3.disconnect();
		
		SingletonDataBaseConnection db4 = SingletonDataBaseConnection.getInstance();
		db4.connect();
		db4.disconnect();
		
		
	}

}
