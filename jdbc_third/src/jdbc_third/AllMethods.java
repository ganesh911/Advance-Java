package jdbc_third;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.*;

import com.mysql.cj.jdbc.Driver;
public class AllMethods {

	static Scanner sc = new Scanner (System.in);
	
	public static void main(String[] args) {
		//load or register the driver
		
		try {
			//load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//register the driver
			DriverManager.registerDriver(new Driver());
			
			//Establish the connection
			//1
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo?user=root&password=root");
			System.out.println(connection);
			
			//2
			Connection connection1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "root");
			System.out.println(connection1);
			
			//3
			Properties properties = new Properties();
			//FileInputStream fileInputStream = new FileInputStream("test.properties");
			properties.put("user", "root");
			properties.put("password", "root");
			//properties.load(fileInputStream);
			Connection connection2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo",properties);
			System.out.println(connection2);
			
			//Establish the Statement
			//1
			Statement statement = connection.createStatement();
			statement.execute("create table");//static query priority
			
			//2
			PreparedStatement preparedStatement = connection.prepareStatement("insert into table values");
			int k = preparedStatement.executeUpdate();
			if(k>1) {
				System.out.println("Data updated");
			}
			else {
				System.out.println("Data not found");
			}
			
			CallableStatement callableStatement = connection.prepareCall("call procedure(?)");
			ResultSet resultSet = callableStatement.executeQuery("select * from user");
			while(resultSet.next()) {
				System.out.println("id"+resultSet.getInt(1));
			}
			
			connection.close();
			connection1.close();
			connection2.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
