package com.pc.service;

import java.util.List;

import com.pc.bean.BrandPage;
import com.pc.bean.PageBean;
import com.pc.bean.Product;

public interface IProductService
{
	public PageBean<Product> selectProductListByPage(Integer currentPage);

	public Integer selectTotalSize();
	
	//根据brandid查询产品
	public List<Product> selectProductListById(String brandName);
	
	public Integer selectTotalSizeByName(String brandName);
	
	public Product selectProductById(Integer productId);
}

