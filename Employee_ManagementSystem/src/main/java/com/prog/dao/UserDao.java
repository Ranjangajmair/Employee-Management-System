package com.prog.dao;

import com.prog.entity.User;

public interface UserDao {

	public int saveUser(User user);

	public User loginUser(String email, String password);

}
