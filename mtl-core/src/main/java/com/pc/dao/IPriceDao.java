package com.pc.dao;

import org.apache.ibatis.annotations.Param;

public interface IPriceDao
{
	public Integer calculatePrice(Integer[] ids);
}
