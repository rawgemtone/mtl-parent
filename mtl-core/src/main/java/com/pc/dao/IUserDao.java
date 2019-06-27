package com.pc.dao;

import org.apache.ibatis.annotations.Param;

import com.pc.bean.User;

public interface IUserDao
{
	public User selectUser(@Param("userName")String userName,@Param("password")String password);
}
