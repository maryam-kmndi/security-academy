package exercise7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Main {
	
	 private static final String URL = "jdbc:h2:tcp://localhost:9092/~/testdb";
	 private static final String USER = "sa"; 
	 private static final String PASSWORD = "";
	 
	public static void main(String[] args) {
		String country= "United States";
    	String sql = """
    			SELECT COUNTRY_NAME, DEPARTMENT_NAME, LOCATIONS.LOCATION_ID 
    			FROM COUNTRIES ,DEPARTMENTS ,LOCATIONS
    			WHERE 
    			 	COUNTRIES.COUNTRY_ID = LOCATIONS.COUNTRY_ID  
    			 	AND
    			 	LOCATIONS.LOCATION_ID = DEPARTMENTS.LOCATION_ID 
    			 	AND
    			 	COUNTRY_NAME = ?
    			""";
    	
		try (Connection cn = DriverManager.getConnection(URL, USER, PASSWORD);
				PreparedStatement preparedSt = cn.prepareStatement(sql)) {
			System.out.println("Connected to the H2 database successfully!");
			preparedSt.setString(1, country);
			try (ResultSet rs = preparedSt.executeQuery()) {
				while (rs.next()) {
	                String departmentName = rs.getString("DEPARTMENT_NAME");
					String countryName = rs.getString("COUNTRY_NAME");
	                System.out.println("Department: " + departmentName + ", Country: " + countryName);
				}

			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}