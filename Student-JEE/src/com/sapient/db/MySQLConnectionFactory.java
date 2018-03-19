package com.sapient.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class MySQLConnectionFactory {

	static {
		try {
			DriverManager.registerDriver(new Driver());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection()throws SQLException {
		String url="jdbc:mysql://localhost:3306/";
		String user="root";
		String password="root";
		Connection con=DriverManager.getConnection(url, user, password);
		return con;
	}

}







