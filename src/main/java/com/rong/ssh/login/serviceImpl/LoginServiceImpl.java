package com.rong.ssh.login.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rong.ssh.login.dao.UserDao;
import com.rong.ssh.login.service.LoginService;
@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
    private UserDao userDao;
	
	public LoginServiceImpl() {
	}

	@Override
	public int login(String userName, String password) {
		return userDao.find(userName, password)==null?0:1;
	}

}
