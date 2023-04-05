package com.jsp.userdatabase;
import java.sql.*;
import java.util.Properties;
import java.io.*;
public class TestCallableStatement {

	public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Properties p = new Properties();
		FileInputStream fis= new FileInputStream("userpassword.properties");
		p.load(fis);
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/userdatabse",p);
		System.out.println("connect succesfully wtih mysql.. ");
		CallableStatement callableStatement = connection.prepareCall("call new_procedure(?, ?, ?)");
		callableStatement.setInt(1, 1);
		callableStatement.setString(2, "Ganeshu");
		callableStatement.setInt(3, 30);
		callableStatement.execute();
		System.out.println("opration successful....");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
}
