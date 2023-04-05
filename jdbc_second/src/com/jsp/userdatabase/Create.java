package com.jsp.userdatabase;
import java.sql.*;
public class Create {
public static void main(String[] args) {
	try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/userdatabse", "root", "root");
	Statement st = con.createStatement();
	st.execute("create table Emp(id int primary key, name varchar(20), sal int)");
	System.out.println("table created");
	con.close();
	}catch(ClassNotFoundException e) {
		System.out.println("Class not found for this driver");	
	}catch(SQLException e) {
		System.out.println("SQL Exception ");
	}
	
}
}
