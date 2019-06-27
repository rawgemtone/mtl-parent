package com.pc.service;

import java.util.List;

import com.pc.bean.Brand;

public interface IBrandService
{
	public List<Brand> selectBrandList();
	public List<Brand> selectBrandById(Integer brandId);
}
