package com.pc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pc.bean.User;
import com.pc.dao.IUserDao;

@Service
public class IUserServiceImpl implements IUserService
{
	
	@Autowired
	private IUserDao userdao;

	@Override
	public User selectUser(String userName, String password)
	{
		return userdao.selectUser(userName, password);
	}

}
