package com.jsp.userdatabase;

import java.util.*;

import com.mysql.cj.jdbc.Driver;

import java.sql.*;
public class InsertUsingPreparedStatement 
{
static Scanner sc = new Scanner(System.in);
public static void main(String[] args) {
	System.out.println("Enter the id of the emp");
	int id =  sc.nextInt();
	System.out.println("Enter the name of the emp");
	String name = sc.next();
	System.out.println("Enter the salary of the emp");
	int sal = sc.nextInt();
	try {
		DriverManager.registerDriver(new Driver());
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/userdatabse?user=root&password=root");
		PreparedStatement preparedStatement = connection.prepareStatement("insert into Emp values(?,?,?)");
		preparedStatement.setInt(1, id);
		preparedStatement.setString(2, name);
		preparedStatement.setInt(3, sal);
		preparedStatement.execute();
		System.out.println("Insertion successful");
		connection.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}

