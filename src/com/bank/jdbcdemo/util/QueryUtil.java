package com.bank.jdbcdemo.util;

public class QueryUtil {
	public static final String CREATE_SQL = "insert into Account_Info(AccountName, AccountType, AccountNumber, AccountBalance)values(?,?,?,?)";
	public static final String LIST_SQL = "select * from Account_Info where AccountNumber=?";
//	public static final String UPDATE_SQL = "update accountinfo set Name=?, age=? where ID=?";
	//public static final String DEPOSIT_SQL = "update accountinfo set AccountBalance=? where AccountNumber=?";
	//public static final String WITHDRAW_SQL = "update accountinfo set AccountBalance=? where AccountNumber=?";
	

}
