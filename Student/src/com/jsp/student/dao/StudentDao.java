package com.jsp.student.dao;
import java.sql.*;
import com.jsp.student.dto.Student;
public class StudentDao {
	
	//To create Student Table
	public void createTableStudent() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ganesh_database", "root", "root");
			Statement statement = connection.createStatement();
			statement.execute("create table Student(RollNo int primary key, Name varchar(45), Phone varchar(10), Address varchar(45))");
			System.out.println("Table created Successfully.............");
			connection.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	//To insert the data in to student
	public void insertValueStudent(Student student) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ganesh_database", "root", "root");
			PreparedStatement preparedStatement = connection.prepareStatement("insert into Student values(?, ?, ?, ?)");
			preparedStatement.setInt(1, student.getRollNo());
			preparedStatement.setString(2, student.getName());
			preparedStatement.setString(3, student.getPhone());
			preparedStatement.setString(4, student.getAddress());
			int result = preparedStatement.executeUpdate();
			connection.close();
			if(result>0) {
				System.out.println("Data Inserted Successfully.....");
			}
			else {
				System.out.println("Data Insertion Error...");
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void getByRollNo(int rollNo) {
		try {
			Student student = new Student();
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ganesh_database", "root", "root");
			PreparedStatement preparedStatement = connection.prepareStatement("select * from Student where RollNo=?");
			preparedStatement.setInt(1, rollNo);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
			int roll= resultSet.getInt("rollNo");
			String phone = resultSet.getString("phone");
			String name= resultSet.getString("name");
			String address = resultSet.getString("address");
			
			student.setRollNo(roll);
			student.setPhone(phone);
			student.setName(name);
			student.setAddress(address);
			
			}
			System.out.println(student.getRollNo());
			System.out.println(student.getName());
			System.out.println(student.getPhone());
			System.out.println(student.getAddress());
			connection.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void updateStudent(String name, String phone, String address, int rollno) {
		Student student = new Student();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ganesh_database", "root", "root");
			PreparedStatement preparedStatement = connection.prepareStatement("update Student set Name=?, Phone=?, Address=? where RollNo=? ");
			preparedStatement.setString(1,name);
			preparedStatement.setString(2, phone);
			preparedStatement.setString(3, address);
			preparedStatement.setInt(4, rollno);
		int k = preparedStatement.executeUpdate();
		connection.close();
		if(k>0) {
			System.out.println("Data updated");
		}
		else {
			System.out.println("May be wrong roll no");
		}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	public void deleteStudent(int roll) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ganesh_database","root","root");
			PreparedStatement preparedStatement = connection.prepareStatement("delete from Student where RollNo=?");
			preparedStatement.setInt(1,roll);
			int k = preparedStatement.executeUpdate();
			connection.close();
			if(k>0) {
				System.out.println("Data deleted");
			}
			else {
				System.out.println("The roll no is not there");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
