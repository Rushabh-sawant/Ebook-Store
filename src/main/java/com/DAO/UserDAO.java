package com.DAO;

import com.entity.User;

public interface UserDAO {
	public boolean UserRegister(User us);
	
	public User login(String email, String password);
}
