package com.bank.jdbcdemo.TandDcreate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDatabase {
	
	public static final String URL = "jdbc:mysql://localhost:3306/";
	public static final String USER_NAME = "root";
	public static final String PASSWORD = "root";
	public static final String DRIVER_NAME = "com.mysql.jdbc.Driver";
	public static final String CREATE_DATABASE = "create database bank_db";
	


		
		public void createDatabase(){
			Connection con = null;
			Statement st = null;
		try {
			Class.forName(DRIVER_NAME);
			con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			st = con.createStatement();
			st.executeUpdate(CREATE_DATABASE);
			System.out.println("Database created");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		}

	

}
