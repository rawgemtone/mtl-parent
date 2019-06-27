package com.pc.MyTest;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.pc.bean.PageBean;
import com.pc.bean.Product;
import com.pc.service.IBrandService;
import com.pc.service.IProductService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:/applicationContext-dao.xml","classpath*:/applicationContext-service.xml"})
public class MyTest
{
	@Autowired
	private IBrandService brandservice;
	@Autowired
	private IProductService productservice;
	
//	@Test
//	public void test(){
//		List<Brand> brandList = brandservice.selectBrandList();
//		System.out.println(brandList);
//	}
//	@Test
//	public void test2(){
//		PageBean<Product> selectProductListByPage = productservice.selectProductListByPage(2);
//		System.out.println(selectProductListByPage);
//	}
//	@Test
//	public void test3(){
//		List<Brand> selectBrandByName = brandservice.selectBrandById(1);
//		System.out.println(selectBrandByName);
//	}
//	@Test
//	public void test4(){
//		
//		List<Product> productListById = productservice.selectProductListById("华为");
//		System.out.println(productListById);
//	}
//	@Test
//	public void test5(){
//		PageBean<Product> selectProductListByPage = productservice.selectProductListByPage(2);
//		System.out.println(selectProductListByPage);
//	}
//	@Test
//	public void test6(){
//		Integer selectTotalSize = productservice.selectTotalSize();
//		System.out.println(selectTotalSize);
//	}
//	@Test
//	public void test7(){
//		Integer selectTotalSizeByName = productservice.selectTotalSizeByName("华为");
//		System.out.println(selectTotalSizeByName);
//	}
	@Test
	public void test8(){
		Product selectProductById = productservice.selectProductById(1);
		System.out.println(selectProductById);
	}
}
