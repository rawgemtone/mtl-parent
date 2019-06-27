package com.pc.MyTest;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.pc.bean.Brand;
import com.pc.bean.PageBean;
import com.pc.bean.Product;
import com.pc.service.IBrandService;
import com.pc.service.IProductService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:/applicationContext-dao.xml","classpath*:/applicationContext-service.xml"})
public class MyTest
{
	@Autowired
	private IBrandService brandService;
//	@Autowired
//	private IProductService productservice;
	
	@Test
	public void test1(){
		List<Brand> selectBrandList = brandService.selectBrandList();
		System.out.println(selectBrandList);
	}
//	@Test
//	public void test2(){
//		PageBean<Product> selectProductListById = productservice.selectProductListById(1,1);
//		System.out.println(selectProductListById);
//	}

}
