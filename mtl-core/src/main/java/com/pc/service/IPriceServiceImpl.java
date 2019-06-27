package com.pc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pc.dao.IPriceDao;

@Service
public class IPriceServiceImpl implements IPriceService
{
	@Autowired
	private IPriceDao pricedao;

	@Override
	public Integer calculatePrice(Integer[] ids)
	{
		// TODO Auto-generated method stub
		return pricedao.calculatePrice(ids);
	}
	

}
