package com.jsp.dao;
import java.sql.*;
import com.jsp.dto.Person;
import com.mysql.cj.jdbc.Driver;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class PersonDao {
Scanner sc = new Scanner(System.in);
	public void createPersonTable(){
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/userdatabse?user=root&password=root");
				Statement statement = connection.createStatement();
				statement.execute("create table person(id int primary key, name varchar(45), age int, mail varchar(100), password varchar(40))");
				connection.close();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}   
			
		}
	
	public int insertValueInPersonTable(Person person ) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/userdatabse?user=root&password=root");
			PreparedStatement preparedStatement = connection.prepareStatement("insert into person values(?, ?, ?, ?, ?)");
			preparedStatement.setInt(1,person.getId());
			preparedStatement.setString(2,person.getName());
			preparedStatement.setInt(3, person.getAge());
			preparedStatement.setString(4, person.getMail());
			preparedStatement.setString(5, person.getPassword());
			 int k = preparedStatement.executeUpdate();
			 connection.close();
					 return k;
				
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	
	public List<Person> getPerson() {
		List<Person> list = new ArrayList<Person>();
		try {
			DriverManager.registerDriver(new Driver());
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/userdatabse", "root", "root");
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from person");
			while(resultSet.next()) {
				Person person = new Person();
				person.setId(resultSet.getInt("id"));
				person.setName(resultSet.getString("name"));
				person.setAge(resultSet.getInt("age"));
				person.setMail(resultSet.getString("mail"));
				person.setPassword(resultSet.getString("password"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
 		return list;
	}
	
	public Person loginPerson(int id , String password1) {
		Person person = new Person();
		try {
			DriverManager.registerDriver(new Driver());
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ganesh_database", "root", "root");
			PreparedStatement preparedStatement = connection.prepareStatement("select * from person where id=? and password=?");
			preparedStatement.setInt(1,id);
			preparedStatement.setString(2, password1);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
			person.setMail(resultSet.getString("mail"));
			person.setPassword(resultSet.getString("password"));
}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	return person;
	}

	

}
