package com.bank.jdbcdemo.dao;

import java.util.List;

import com.bank.jdbcdemo.model.User;

public interface UserDao {
	
	int CreateAccount(User user);
	
	List<User>GetAccountInfo();
	
	

}
