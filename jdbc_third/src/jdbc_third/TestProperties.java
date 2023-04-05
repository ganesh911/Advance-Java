package jdbc_third;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;
public class TestProperties {

	public static void main(String[] args) {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Properties p = new Properties();
			FileInputStream fileInputStream = new FileInputStream("test.properties");
			p.load(fileInputStream);
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", p);
			System.out.println("Login success");
			Statement statement = connection.createStatement();
			statement.execute("create table user (id int, name varchar(20), age int(10))");
			System.out.println("Table created");
			connection.close();	
			
		} catch (ClassNotFoundException e) {
			System.out.println("class not found");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("sql error");			
		} catch (IOException e) {
			System.out.println("file path wrong");
		}
		
	}
}
