package tamrin1.session6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseConnection {
	
	private static final String URL ="jdbc:h2:tcp://localhost:9092/~/testdb";
	private static final String USER ="sa";
	private static final String PASSWORD ="";
	
	public static void main(String[] args) {
		
		try (Connection cn = DriverManager.getConnection(URL, USER, PASSWORD);
				Statement st = cn.createStatement()) {
			String q1 = "SELECT * FROM COUNTRIES";
			ResultSet rs = st.executeQuery("q1");
			
			while (rs.next()) {
				int id = rs.getInt("COUNRTY_ID");
				String name = rs.getString("COUNRTY_NAME");
				System.out.println("ID: " + id + ", Name: " + name);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
