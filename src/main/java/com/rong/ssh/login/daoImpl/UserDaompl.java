package com.rong.ssh.login.daoImpl;

import com.rong.ssh.login.dao.UserDao;
import com.rong.ssh.login.entity.UserDTO;

public class UserDaompl implements UserDao {

	public UserDaompl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public UserDTO find(String userName, String password) {
		 return new UserDTO();//�����ݣ�����Ҫͨ��Hibernateȥ���ݿ�ȡ
	}

}
