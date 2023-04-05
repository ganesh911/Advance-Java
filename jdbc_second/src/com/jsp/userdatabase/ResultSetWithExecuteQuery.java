package com.jsp.userdatabase;
import java.sql.*;
public class ResultSetWithExecuteQuery {
 public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection  = DriverManager.getConnection("jdbc:mysql://localhost:3306/userdatabse","root","root");
		Statement statement = connection.createStatement();
		// executeQuery() return ResultSet so that's why we are storing it into ResultSet
		ResultSet  resultSet = statement.executeQuery("select * from user");
		System.out.println(resultSet);
		
		//to fetch the object use next() and getType(int index);
		while(resultSet.next()) {
			System.out.println("id->"+resultSet.getInt(1));
			System.out.println("name->"+resultSet.getString(2));
			System.out.println("age->"+resultSet.getInt(3));
			System.out.println("**************************");
		}
 		connection.close();
		System.out.println("-----------------------");
		System.out.println(resultSet);
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
