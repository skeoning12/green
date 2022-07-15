package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletContext;

public class DBcon {
	private static Connection conn = null;
	private String url = "jdbc:oracle:thin:@localhost:1521/xe";
	private String uid = "green01";
	private String upw = "1234";
	
	private DBcon() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(url, uid, upw); 
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public DBcon(ServletContext application) {
		try {
			String driver = application.getInitParameter("OracleDriver");
			Class.forName(driver);
			
			String url1 = application.getInitParameter("OracleURL");
			String uid1 = application.getInitParameter("UserId");
			String upw1 = application.getInitParameter("UserPw");
			
			conn = DriverManager.getConnection(url1, uid1, upw1);
			System.out.println("DB 연결 성공 (인수생성자 2)");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static Connection getConnection() {
		if(conn == null) {
			new DBcon();
		}
		return conn;
	}
}
