package com.jsp.userdatabase;
import java.sql.*;
public class TestResultSet {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/userdatabse?user=root&password=root");
			//we are performing static query which do not take any input from use so better to use Statement
			Statement statement = connection.createStatement();
			//executeQuery() returns ResultSet
		ResultSet resultSet = statement.executeQuery("select * from user");
	// to display the data of the table we use getType(); -- resultSet.getType(int indexPosition);
		//to move cursor on the next line we use next() present within ResultSet--- resultSet.next()
		
		while(resultSet.next()) {
			System.out.println("id-"+resultSet.getInt(1));
			System.out.println("name-"+resultSet.getString(2));
			System.out.println("age-"+resultSet.getInt(3));
			System.out.println("----------------------------------");
		}
		
		connection.close();
		} catch (ClassNotFoundException e) {
		System.out.println("Class not found check your driver");	
		} catch (SQLException e) {
		System.out.println("check your connction...");
		}
		
	}
}
