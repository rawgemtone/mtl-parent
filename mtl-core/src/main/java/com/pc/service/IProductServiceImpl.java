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
		//���õ�ǰҳ��
		pageBean.setCurrentPage(currentPage);
		//����ÿҳ��¼��
		int pageSize = 2;
		pageBean.setPageSize(pageSize);
		//�������м�¼��
		int totalSize = selectTotalSize();
		pageBean.setTotalSize(totalSize);
		//������ҳ��
		int totalPage = (totalSize % pageSize == 0) ? totalSize / pageSize :totalSize / pageSize +1;
		pageBean.setTotalPage(totalPage);
		//���õ�ǰҳ����
		int begin = (currentPage -1)*pageSize;
		//��ѯ��ǰҳ������
		//select * from xx limit ?,?  �ӵڼ�����ʼ����ѯ��ʾ����������
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
