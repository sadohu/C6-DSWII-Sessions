package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;


public class ConnectionDB {
	private static final String URL = "jdbc:mysql://localhost:3307/EABDBIBLIO";
	private static final String USER = "root1";
	private static final String PASSWORD = "123456";
	private static Connection connection;
	
	public static Connection getConnection() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		connection = DriverManager.getConnection(URL, USER, PASSWORD);
		if(connection != null)
			System.out.println("Database connection successful");
			// JOptionPane.showMessageDialog(null,"hay conexion con BD","MENSAJE",JOptionPane.INFORMATION_MESSAGE);
		return connection;
	}
}
