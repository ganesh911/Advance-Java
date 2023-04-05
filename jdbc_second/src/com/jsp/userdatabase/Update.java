package com.jsp.userdatabase;
import java.sql.*;
import java.util.*;
public class Update
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args)
	{
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/userdatabse";
		String user = "root";
		String password = "root";
		
		try
		{
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, user, password);
			PreparedStatement preparedStatement = con.prepareStatement("update Emp set name=? where id=?");
			preparedStatement.setString(1, "jani");
			preparedStatement.setInt(2,400);
			
		int b =	preparedStatement.executeUpdate();
			if(b>0) {
				System.out.println("Values are updated");
			}
			else {
				System.out.println("values not update");
			}
			
			System.out.println("update success...");
			con.close();
		}catch(ClassNotFoundException e)
		{
			System.out.println("class not found check driver path...");
		}catch(SQLException e)
		{
			System.out.println("sql connection fault check connection path....");
		}
	}
}
