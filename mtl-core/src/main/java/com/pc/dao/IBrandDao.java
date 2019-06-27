package com.pc.dao;

import java.util.List;

import com.pc.bean.Brand;

public interface IBrandDao
{
	public List<Brand> selectBrandList(); 
	public List<Brand> selectBrandById(Integer brandId);
	
}
