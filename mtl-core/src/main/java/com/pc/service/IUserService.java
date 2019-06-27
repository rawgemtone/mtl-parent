package com.pc.service;

import org.apache.ibatis.annotations.Param;

import com.pc.bean.User;

public interface IUserService
{
	public User selectUser(String userName,String password);
}
