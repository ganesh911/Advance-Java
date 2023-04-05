package com.jspider.dao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.jspider.dto.Person;
import com.mysql.cj.jdbc.Driver;
public class PersonDao {
	String url = "jdbc:mysql://localhost:3306/ganesh_database";
	String user = "root";
	String password = "root";
	//1:To create Person Table
	public void createTablePerson() 
	{
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			Connection connection = DriverManager.getConnection(url, user, password);
			Statement statement = connection.createStatement();
			statement.execute("create table person (id int primary key, name varchar(45), age int , email varchar(60), password varchar(60))");
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//2:To insert values in to Person Table
	public void insertValuesInPerson(Person person) {
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			Connection connection = DriverManager.getConnection(url, user, password);
			PreparedStatement preparedStatement = connection.prepareStatement("insert into person values(?, ?, ?, ?, ?)");
			preparedStatement.setInt(1, person.getId());
			preparedStatement.setString(2, person.getName());
			preparedStatement.setInt(3, person.getAge());
			preparedStatement.setString(4, person.getEmail());
			preparedStatement.setString(5, person.getPassword());
			int k = preparedStatement.executeUpdate();
			connection.close();
			if(k>0) {
				System.out.println("data inserted....");
			}
			else {
				System.err.println("Error  with insertion...");
			}
		} catch (SQLException e) {
				e.printStackTrace();
		}
	}
	
	//3:to update the values in the Person table
	
	public void updateThePerson(Person person) {
		try {
			DriverManager.registerDriver(new Driver());
			Connection connection = DriverManager.getConnection(url, user, password);
			PreparedStatement preparedStatement = connection.prepareStatement("update person set name=? where id=?");
			preparedStatement.setInt(1, person.getId());
			preparedStatement.setString(2, person.getName());
			int k = preparedStatement.executeUpdate();
			connection.close();
			if(k>0) {
				System.out.println("update success...");
			}
			else {
				System.out.println("no data found...");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//to display all the person
	public List<Person> getAllPersons(){
		
		List<Person> list = new ArrayList();
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection(url, user, password);
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from Person");
		while(resultSet.next()) {
			int id = resultSet.getInt("id");
			String name = resultSet.getString("name");
			int age = resultSet.getInt("age");
			String email = resultSet.getString("email");
			String password = resultSet.getString("password");
			
			Person person = new Person();
			person.setId(id);
			person.setName(name);
			person.setAge(age);
			person.setEmail(email);
			person.setPassword(password);
			
			list.add(person);
			System.out.println("------------------");
			for(int i=0; i<list.size();i++) {
				System.out.println("id: "+person.getId());
				System.out.println("name: "+person.getName());
				System.out.println("age: "+person.getAge());
				System.out.println("email: "+person.getEmail());
				System.out.println("password: "+person.getPassword());
			}
		}
		
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
	return list;
	}
}
