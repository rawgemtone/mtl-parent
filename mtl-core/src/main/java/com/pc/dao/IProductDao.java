package com.pc.dao;

import java.util.List;

import com.pc.bean.BrandPage;
import com.pc.bean.PageBean;
import com.pc.bean.PageQuery;
import com.pc.bean.Product;

public interface IProductDao
{
	public List<Product> selectProductListByPage(PageQuery pagequery);

	//传共有多少条数据记录
	public Integer selectTotalSize();
	
	//根据品牌名查询手机
	public List<Product> selectProductListById(String BrandName);
	
	//根据品牌名称查询有多少条记录
	public Integer selectTotalSizeByName(String brandName);
	
	//根据品牌id查询品牌
	public Product selectProductById(Integer productId);
}
