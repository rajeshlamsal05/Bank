package com.bank.jdbcdemo.model;



public class User {
	private int AccountNumber;
	private String AccountName;
	private String AccountType;
	private double AccountBalance;
	private int accountChoice;
	
	
	
	public int getAccountChoice() {
		return accountChoice;
	}
	public void setAccountChoice(int accountChoice) {
		this.accountChoice = accountChoice;

	}
	public int getAccountNumber() {
		return AccountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		AccountNumber = accountNumber;
	}
	public String getAccountName() {
		return AccountName;
	}
	public void setAccountName(String accountName) {
		AccountName = accountName;
	}
	public double getAccountBalance() {
		return AccountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		AccountBalance = accountBalance;
	}
	public String getAccountType() {
		return AccountType;
	}
	public void setAccountType(String accountType) {
		AccountType = accountType;
	}
	

	

}
