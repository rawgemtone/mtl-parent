package com.pc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pc.bean.BrandPage;
import com.pc.bean.PageBean;
import com.pc.bean.PageQuery;
import com.pc.bean.Product;
import com.pc.dao.IProductDao;

@Service
public class IProductServiceImpl implements IProductService
{
	@Autowired
	private IProductDao productdao;
	
	@Override
	public PageBean<Product> selectProductListByPage(Integer currentPage)
	{
		PageBean<Product> pageBean = new PageBean<Product>();
		//设置当前页数
		pageBean.setCurrentPage(currentPage);
		//设置每页记录数
		int pageSize = 2;
		pageBean.setPageSize(pageSize);
		//设置所有记录数
		int totalSize = selectTotalSize();
		pageBean.setTotalSize(totalSize);
		//设置总页数
		int totalPage = (totalSize % pageSize == 0) ? totalSize / pageSize :totalSize / pageSize +1;
		pageBean.setTotalPage(totalPage);
		//设置当前页数据
		int begin = (currentPage -1)*pageSize;
		//查询当前页得数据
		//select * from xx limit ?,?  从第几条开始，查询显示多少条数据
		List<Product> selectProductListByPage = productdao.selectProductListByPage(new PageQuery(begin,totalSize));
		pageBean.setList(selectProductListByPage);
		return pageBean;
	}

	@Override
	public Integer selectTotalSize()
	{
		
		return productdao.selectTotalSize();
	}

	@Override
	public List<Product> selectProductListById(String brandName)
	{
		List<Product> selectProductListById = productdao.selectProductListById(brandName);
		return selectProductListById;
	}

	@Override
	public Integer selectTotalSizeByName(String brandName)
	{
		return productdao.selectTotalSizeByName(brandName);
	}

	@Override
	public Product selectProductById(Integer productId)
	{
		return productdao.selectProductById(productId);
		
	}
}
