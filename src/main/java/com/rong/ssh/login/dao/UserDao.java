package com.rong.ssh.login.dao;

import com.rong.ssh.login.entity.UserDTO;

public interface UserDao {
	 public UserDTO find(String userName,String password);
}
