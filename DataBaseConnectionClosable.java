package session6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataBaseConnectionClosable {
	
	private static final String URL ="jdbc:h2:tcp://localhost:9092/~/testdb";
	private static final String USER ="sa";
	private static final String PASSWORD ="";
	
	public static void main(String[] args) {
		String departmentId = "1";
		String countryCode = "US";
		String countryId = "AR";

		try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)){
			System.out.println("Connect to the h2 DataBase successfully!");
			
			 // Fetch employees by department
            fetchEmployeesByDepartment(connection, departmentId);

            // Fetch departments and locations by country
            fetchDepartmentsByCountry(connection, countryCode);
            
            //Insert an employee
            insertAnEmoployee(connection);
            
            //Update country name
            updateCountryNameToUpperCase(connection, countryId);
            
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	private static void fetchEmployeesByDepartment(Connection connection, String departmentId) {
		String query = "SELECT * FROM EMPLOYEES WHERE DEPARTMENT_ID = ?";
		try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
			preparedStatement.setString(1, departmentId);

			try (ResultSet resultSet = preparedStatement.executeQuery()) {
				System.out.println("\nEmployees in department: " + departmentId);
				while (resultSet.next()) {
					String employeeId = resultSet.getString("EMPLOYEE_ID");
					String firstName = resultSet.getString("FIRST_NAME");
					String lastName = resultSet.getString("LAST_NAME");
					String depId = resultSet.getString("DEPARTMENT_ID");
					System.out.println("Employee ID: " + employeeId + ", Name: " + firstName + " " + lastName + ", Department ID: " + depId);
				}
			}
		} catch (SQLException e) {
			System.err.println("Error fetching employees by department: " + e.getMessage());
		}
	}

	private static void fetchDepartmentsByCountry(Connection connection, String countryCode) {
		String query = "SELECT * FROM DEPARTMENTS D JOIN LOCATIONS L ON D.LOCATION_ID = L.LOCATION_ID WHERE L.COUNTRY_ID = ?";
		try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
			preparedStatement.setString(1, countryCode);

			try (ResultSet resultSet = preparedStatement.executeQuery()) {
				System.out.println("\nDepartments in: " + countryCode);
				while (resultSet.next()) {
					String departmentId = resultSet.getString("DEPARTMENT_ID");
			        String departmentName = resultSet.getString("DEPARTMENT_NAME");
			        String countryId = resultSet.getString("COUNTRY_ID");
			        System.out.println("Department ID: " + departmentId + ", Department Name: " + departmentName + ", Country ID: " + countryId);
				}
			}
		} catch (SQLException e) {
			System.err.println("Error fetching departments by country: " + e.getMessage());
		}
	}
	
	private static void insertAnEmoployee(Connection connection) {
		String query = "INSERT INTO EMPLOYEES ( FIRST_NAME , LAST_NAME , EMAIL , PHONE_NUMBER , HIRE_DATE , JOB_ID , SALARY , MANAGER_ID , DEPARTMENT_ID ) \r\n"
						+ "VALUES ( ?, ?, ?, ?, ?,  ?, ?, ?, ?)";
		
		try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
			preparedStatement.setString(1, "Mary");
			preparedStatement.setString(2, "Kmndi");
			preparedStatement.setString(3, "mary@gmail.com");
			preparedStatement.setInt(4, 234-435-6532);
			preparedStatement.setString(5, "2001-11-11");
			preparedStatement.setInt(6, 8);
			preparedStatement.setDouble(7, 20000.00);
			preparedStatement.setInt(8, 102);
			preparedStatement.setInt(9, 4);

            int rowsAffected = preparedStatement.executeUpdate();
            System.out.println(rowsAffected + " employee(s) inserted.");
		} catch (SQLException e) {
			System.err.println("Error inserting new employee: " + e.getMessage());
		}
	}

	private static void updateCountryNameToUpperCase(Connection connection, String countryId) {
	    String updateQuery = "UPDATE countries SET country_name = UPPER(country_name) WHERE country_id = ?";

	    try (PreparedStatement preparedStatement = connection.prepareStatement(updateQuery)) {
	        preparedStatement.setString(1, countryId);

	        int rowsAffected = preparedStatement.executeUpdate();
	        System.out.println(rowsAffected + " country name(s) updated to uppercase for ID: " + countryId);
	    } catch (SQLException e) {
	        System.err.println("Error updating country name: " + e.getMessage());
	    }
	}

}

