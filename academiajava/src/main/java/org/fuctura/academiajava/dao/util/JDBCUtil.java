package org.fuctura.academiajava.dao.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtil {

	private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String USER = "anderson";
	private static final String SENHA = "12345";
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	
	public static Connection getConnection(){
		try {
			Class.forName(DRIVER);		
			Connection connection = DriverManager.getConnection(URL, USER, SENHA);
			return connection;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}