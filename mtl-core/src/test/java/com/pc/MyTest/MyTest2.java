package com.pc.MyTest;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.pc.bean.AttrInfo;
import com.pc.bean.AttrType;
import com.pc.dao.IPriceDao;
import com.pc.service.IAttrService;
import com.pc.service.IPriceService;
import com.pc.service.IUserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:/applicationContext-dao.xml","classpath*:/applicationContext-service.xml"})
public class MyTest2
{
	@Autowired
	private IAttrService attrservice;
	@Autowired
	private IPriceService priceservice;
	@Autowired
	private IUserService userservice;
	
//	
//	@Test
//	public void test2(){
//		List<AttrInfo> selectAttrInfoList = attrservice.selectAttrInfoList();
//		System.out.println(selectAttrInfoList);
//	}
	@Test
	public void test3(){
		userservice.selectUser("admin", "123456");
	}
}
