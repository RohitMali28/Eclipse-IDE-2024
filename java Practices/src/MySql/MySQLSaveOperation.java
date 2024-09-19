package MySql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MySQLSaveOperation {
	public static void main(String[] args) {
		// Database connection settings
		String dbUrl = "jdbc:mysql://localhost:3306/mydatabase";
		String username = "RohitMali";
		String password = "RohitMali";

		// Data to be saved
		String name = "John Doe";
		int age = 30;

		// Create a connection to the database
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(dbUrl, username, password);
		} catch (SQLException e) {
			System.out.println("Error connecting to database: " + e.getMessage());
			return;
		}

		// Create a prepared statement to insert data into the table
		String query = "INSERT INTO mytable (name, age) VALUES (?, ?)";
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, name);
			pstmt.setInt(2, age);
		} catch (SQLException e) {
			System.out.println("Error preparing statement: " + e.getMessage());
			return;
		}

		// Execute the prepared statement to save the data
		try {
			pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("Error saving data: " + e.getMessage());
			return;
		}

		// Close the prepared statement and connection
		try {
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			System.out.println("Error closing resources: " + e.getMessage());
		}

		System.out.println("Data saved successfully!");
	}
}