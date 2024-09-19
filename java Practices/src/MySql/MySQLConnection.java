package MySql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnection {
	public static void main(String[] args) {
		// Database connection parameters
		String dbHost = "localhost";
		String dbPort = "3306";
		String dbUser = "RohitMali";
		String dbPassword = "RohitMali";

		// Connection string
		String connectionString = "jdbc:mysql://" + dbHost + ":" + dbPort + "/" + dbHost;

		// MySQL Connector/J driver
		String dbDriver = "com.mysql.cj.jdbc.Driver";

		try {
			// Load MySQL Connector/J driver
			Class.forName(dbDriver);

			// Establish database connection
			Connection conn = null;

			DriverManager.getConnection(connectionString, dbUser, dbPassword);

			// Check connection
			if (conn != null)
				System.out.println("Connected to MySQL database successfully!");
			else
				System.out.println("Failed to connect to MySQL database.");

			// Close connection
			conn.close();
		} catch (ClassNotFoundException e) {
			System.out.println("MySQL Connector/J driver not found.");
		} catch (SQLException e) {
			System.out.println("Error connecting to MySQL database: " + e.getMessage());
		}
	}
}
