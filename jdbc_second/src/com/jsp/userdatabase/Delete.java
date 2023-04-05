package com.jsp.userdatabase;
import java.sql.*;
public class Delete
{
	public static void main(String[] args)
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/userdatabse?user=root&password=root");
			PreparedStatement preparedStatement = connection.prepareStatement("delete from user where id=?");
			preparedStatement.setInt(1,2);
		int k = preparedStatement.executeUpdate();
		if(k>0) {
			System.out.println("Data is deleted...");
		}
		else {
			System.out.println("Data not found to delete..");
		}
		connection.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
