package tamrin1.session7.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ORMExaple {

	 private static final String URL = "jdbc:h2:tcp://localhost:9092/~/testdb";
	 private static final String USER = "sa"; // Default username
	 private static final String PASSWORD = ""; // Default password (empty)
	
	public static void main(String[] args) {
    	String salary= "5000";
    	String sql = """
    			SELECT EMPLOYEE_ID, FIRST_NAME, LAST_NAME, EMAIL, SALARY, EMPLOYEES.DEPARTMENT_ID, DEPARTMENT_NAME
    			FROM EMPLOYEES , DEPARTMENTS
    			WHERE EMPLOYEES.DEPARTMENT_ID =DEPARTMENTS.DEPARTMENT_ID
    			AND SALARY > ?
    			""";
    	List<Employee> employees =new ArrayList<>();
    	
		try (Connection cn = DriverManager.getConnection(URL, USER, PASSWORD);
				PreparedStatement preparedSt = cn.prepareStatement(sql)) {
			System.out.println("Connected to the H2 database successfully!");
			preparedSt.setString(1, salary);
			try (ResultSet rs = preparedSt.executeQuery()) {
				while (rs.next()) {
					String Id = rs.getString("EMPLOYEE_ID"); 
					String firstName = rs.getString("FIRST_NAME"); 
					String lastName = rs.getString("LAST_NAME"); 
					String email = rs.getString("EMAIL"); 
					String depId = rs.getString("DEPARTMENT_ID"); 
					String depName = rs.getString("EMPLOYEES.DEPARTMENT_ID"); 
					Department d = new Department(depName, depId);
					Employee emp = new Employee(Id, firstName, lastName, email, salary, d);
					employees.add(emp);
				}
				employees.forEach(System.out::println);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
