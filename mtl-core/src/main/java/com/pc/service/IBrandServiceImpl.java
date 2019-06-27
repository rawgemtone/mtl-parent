package com.pc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pc.bean.Brand;
import com.pc.dao.IBrandDao;

@Service
public class IBrandServiceImpl implements IBrandService
{
	@Autowired
	private IBrandDao branddao;
	
	public List<Brand> selectBrandList(){
		List<Brand> BrandList = branddao.selectBrandList();
		return BrandList;
	}

	@Override
	public List<Brand> selectBrandById(Integer brandId)
	{
		List<Brand> brandListByName = branddao.selectBrandById(brandId);
		return brandListByName;
	}
}
