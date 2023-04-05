package com.jsp.userdatabase;
import java.sql.*;
public class Drop {
public static void main(String[] args) {
	String driver = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/userdatabse";
	String user = "root";
	String password = "root";
	String query="drop table emp";
	try {
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement st = con.createStatement();
		st.execute(query);
		System.out.println("table is dropped");
		con.close();
	}catch(ClassNotFoundException e) {
		System.out.println("Check your driver path...");
	}catch(SQLException e) {
		System.out.println("Check your connection path.....");
	}
}
}
