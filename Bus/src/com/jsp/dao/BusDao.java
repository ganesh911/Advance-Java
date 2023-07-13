package com.jsp.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.jsp.bus.dto.Bus;

public class BusDao {
	
	
	public static Connection getConnection() {
		String url = "jdbc:mysql://localhost:3306/ganesh_database";
		String user = "root";
		String password = "root";
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
	
	
	
	public int createTableBus() {
		try {
			Connection connection = BusDao.getConnection();
			Statement statement =connection.createStatement();
			statement.execute("create table bus (no int primary key, route varchar(30), noOfPass int , time int )");
			return 1;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return -1;
	}
	
	public int insertBusValue(Bus bus) {
		Connection connection = BusDao.getConnection();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement("insert into bus values(?, ?, ? , ?)");
			preparedStatement.setInt(1, bus.getNo());
			preparedStatement.setString(2, bus.getRoute());
			preparedStatement.setInt(3	, bus.getNoOfPass());
			preparedStatement.setInt(4, bus.getTime());
			int status = preparedStatement.executeUpdate();
			return status;
		} catch (SQLException e) {
			e.printStackTrace();
		}
				return -1;
	}
	
	
	public int updateBus(Bus bus) {
		Connection connection = BusDao.getConnection();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement("update bus set route=?, noOfPass=?, time=? where no=?");
			preparedStatement.setString(1, bus.getRoute());
			preparedStatement.setInt(2, bus.getNoOfPass());
			preparedStatement.setInt(3, bus.getTime());
			preparedStatement.setInt(4, bus.getNo());
			int status  = preparedStatement.executeUpdate();
			return status;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return -1;
	}
	
	public int deleteBus(int primary_key) {
		Connection connection = BusDao.getConnection();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement("delete from bus where no=?");
			preparedStatement.setInt(1, primary_key);
			int status = preparedStatement.executeUpdate();
			return status;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return -1;
	}
	
	public Bus getBusById(int id) {
		Connection connection = BusDao.getConnection();
		PreparedStatement preparedStatement;
		try {
			preparedStatement = connection.prepareStatement("select * from bus where no=?");
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				int no = resultSet.getInt("no");
				String route = resultSet.getString("route");
				int noOfPass = resultSet.getInt("noOfPass");
				int time = resultSet.getInt("time");
				
				Bus bus = new Bus();
				bus.setNo(no);
				bus.setRoute(route);
				bus.setNoOfPass(noOfPass);
				bus.setTime(time);	
				return bus;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
				return null;
	}
	
	public List<Bus> getAllBus(){
		List<Bus> list = new ArrayList<Bus>();
		Bus bus = new Bus();
		try {
			Connection connection = BusDao.getConnection();
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from bus");
			while(resultSet.next()) {
				int no = resultSet.getInt("no");
				String route = resultSet.getString("route");
				int noOfPass = resultSet.getInt("noOfPass");
				int time = resultSet.getInt("time");
				

				bus.setNo(no);
				bus.setRoute(route);
				bus.setNoOfPass(noOfPass);
				bus.setTime(time);
				
				  list.add(bus);
		
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}
	
	
}
