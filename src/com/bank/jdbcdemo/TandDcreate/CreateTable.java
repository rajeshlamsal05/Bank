package com.bank.jdbcdemo.TandDcreate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
	
	public static final String URL = "jdbc:mysql://localhost:3306/bank_db";
	public static final String USER_NAME = "root";
	public static final String PASSWORD = "root";
	public static final String DRIVER_NAME = "com.mysql.jdbc.Driver";
	public static final String CREATE_TABLE = "create table Account_Info(AccountName varchar(50), AccountType varchar(20), AccountNumber int, AccountBalance double)";
	
	public void createTable() {
		
		Connection con = null;
		Statement st = null;
	try {
		Class.forName(DRIVER_NAME);
		con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
		st = con.createStatement();
		st.executeUpdate(CREATE_TABLE);
		System.out.println("Table created");
	} catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}
	}

}
