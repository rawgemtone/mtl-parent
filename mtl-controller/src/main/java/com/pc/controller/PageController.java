package com.pc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pc.bean.Brand;
import com.pc.bean.PageBean;
import com.pc.bean.Product;
import com.pc.service.IBrandService;
import com.pc.service.IProductService;

@Controller
@RequestMapping("/product")
public class PageController
{
//	@Autowired
//	private IProductService productservice;
//	@Autowired
//	private IBrandService brandservice;
//
//	@RequestMapping("/selectProductListByPage.do")
//	public String selectProductListByPage(Model model, Integer currentPage)
//	{
//
//		if (null == currentPage)
//		{
//			currentPage = 1;
//		}
//		PageBean<Product> pageBean = productservice
//				.selectProductListByPage(currentPage);
//		model.addAttribute("pageBean", pageBean);
//		List<Brand> brandList = brandservice.selectBrandList();
//		model.addAttribute("brandList", brandList);
//		return "index";
//	}
}
