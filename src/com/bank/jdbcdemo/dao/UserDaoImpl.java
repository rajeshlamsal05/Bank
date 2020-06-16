package com.bank.jdbcdemo.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.bank.jdbcdemo.model.User;
import com.bank.jdbcdemo.util.DBUtil;
import com.bank.jdbcdemo.util.QueryUtil;

public class UserDaoImpl implements UserDao{

	@Override
	public int CreateAccount(User user) {
		int created=0;
		try(PreparedStatement ps = DBUtil.getConnection().prepareStatement(QueryUtil.CREATE_SQL);){
			ps.setString(1, user.getAccountName());
			ps.setString(2, user.getAccountType());
			ps.setInt(3, user.getAccountNumber());
			ps.setDouble(4, user.getAccountBalance());
			created=ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return created;
	}

	
	

	@Override
	public List<User> GetAccountInfo() {
		List<User>UserList=new ArrayList<>();
		try(PreparedStatement ps = DBUtil.getConnection().prepareStatement(QueryUtil.LIST_SQL);){
			User user = new User();
			Scanner input = new Scanner(System.in);
			System.out.println("Enter account number: ");
			int accountChoice = input.nextInt();
			ps.setInt(1, accountChoice);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				user.setAccountName(rs.getString("AccountName"));
				user.setAccountNumber(rs.getInt("AccountNumber"));
				user.setAccountType(rs.getString("AccountType"));
				user.setAccountBalance(rs.getDouble("AccountBalance"));
				UserList.add(user);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return UserList;
	}








	











}
