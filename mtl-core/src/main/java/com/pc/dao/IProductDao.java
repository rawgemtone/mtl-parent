package com.pc.dao;

import java.util.List;

import com.pc.bean.BrandPage;
import com.pc.bean.PageBean;
import com.pc.bean.PageQuery;
import com.pc.bean.Product;

public interface IProductDao
{
	public List<Product> selectProductListByPage(PageQuery pagequery);

	//�����ж��������ݼ�¼
	public Integer selectTotalSize();
	
	//����Ʒ������ѯ�ֻ�
	public List<Product> selectProductListById(String BrandName);
	
	//����Ʒ�����Ʋ�ѯ�ж�������¼
	public Integer selectTotalSizeByName(String brandName);
	
	//����Ʒ��id��ѯƷ��
	public Product selectProductById(Integer productId);
}
