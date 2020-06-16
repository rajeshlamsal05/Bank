package com.bank.jdbcdemo.client;

import java.util.List;
import java.util.Scanner;

import com.bank.jdbcdemo.TandDcreate.CreateDatabase;
import com.bank.jdbcdemo.TandDcreate.CreateTable;
import com.bank.jdbcdemo.dao.UserDao;
import com.bank.jdbcdemo.dao.UserDaoImpl;
import com.bank.jdbcdemo.model.User;

public class UserTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		UserDao userDao = new UserDaoImpl();
		String decision="";
		User user = new User();

		
		do {
			System.out.println("Which banking operation you want to perform?\nEnter 1: To create database"
					+ "\nEnter 2: Tor create table\nEnter 3: To open new account\nEnter 4: T Deposit Cash"
					+ "\nEnter 5: To Withdraw money\nEnter 6: To Print Account Details\n");
			String choice = input.next();
			
			switch(choice) {
			case "1":	//create database
				CreateDatabase db = new CreateDatabase();
				db.createDatabase();
				break;
			case "2":	//create table
				CreateTable tb = new CreateTable();
				tb.createTable();
				break;
			case "3":	//open new account
				System.out.println("Enter your name: ");
				String Name = input.next();
				System.out.println("Enter account number: ");
				int Number = input.nextInt();
				System.out.println("Enter the initial amount to deposit: ");
				double initialamount = input.nextDouble();
				System.out.println("Enter the account type: ");
				String type = input.next();
				user.setAccountName(Name);
				user.setAccountNumber(Number);
				user.setAccountBalance(initialamount);
				user.setAccountType(type);
				int created = userDao.CreateAccount(user);
				if(created>=1) {
					System.out.println("Account created");
				}else {
					System.out.println("Error");
				}
				break;
			case "4":		//deposit
				
				break;
			case "5":		//withdraw
				break;
			case "6":		//print account details
				List<User>userList=userDao.GetAccountInfo();
				userList.forEach(u->{
					System.out.println("Account Name is "+u.getAccountName());
					System.out.println("Account Number is "+u.getAccountNumber());
					System.out.println("Account type is "+u.getAccountType());
					System.out.println("Account balance is "+u.getAccountBalance());
					System.out.println("+++++++++++");
				});
				break;
			default:
				System.out.println("Error!!!");
				break;
			}
			System.out.println("Do you want to perform another transaction?");
			decision = input.next();
			
		}while(decision.equalsIgnoreCase("yes"));
		input.close();
		
		System.out.println("Thank you!");
	}

}
