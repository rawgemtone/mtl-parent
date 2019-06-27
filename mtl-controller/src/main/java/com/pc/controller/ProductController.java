package com.pc.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;

import javax.jws.WebParam.Mode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.pc.bean.Brand;
import com.pc.bean.PageBean;
import com.pc.bean.Product;
import com.pc.service.IBrandService;
import com.pc.service.IProductService;

@Controller
@RequestMapping("/index")
public class ProductController
{
	Integer total = null;
	Integer totalPage = null;
	List<Product> pageList = null;
	Integer pageSize = 4;
	
	@Autowired
	private IProductService productservice;
	@Autowired
	private IBrandService brandservice;
	
	@RequestMapping("/toIndex.do")
	public String toIndex(Model model, Integer currentPage,String brandName) throws UnsupportedEncodingException
	{
		if (null == currentPage)
		{
			currentPage = 1;
		}
		if(brandName == null){
			PageBean<Product> pageBean = productservice
					.selectProductListByPage(currentPage);
			System.out.println(pageBean);
			model.addAttribute("pageBean", pageBean);
		}
		else{
			PageBean pageBean = new PageBean();
			//处理前端乱码问题
			String brandname =new String(brandName.getBytes("iso8859-1"), "utf-8");
			System.out.println("品牌名"+brandname);
			List<Product> productListById = productservice.selectProductListById(brandname);
			//设置一页显示多少个数据
			int totalSize = productservice.selectTotalSizeByName(brandname);
			//设置总页数
			int totalPage = (totalSize % pageSize == 0) ? totalSize / pageSize :totalSize / pageSize +1;
			//设置当前页数
			int begin = (currentPage -1)*pageSize;
			pageBean.setList(productListById);
			pageBean.setPageSize(pageSize);
			pageBean.setTotalSize(totalSize);
			pageBean.setTotalPage(totalPage);
			pageBean.setCurrentPage(currentPage);
			System.out.println(pageBean);
			model.addAttribute("pageBean", pageBean);
		}
		// 查询所有品牌
		List<Brand> brandList = brandservice.selectBrandList();
		model.addAttribute("brandList", brandList);
		System.out.println(brandList);

		return "index";
	}
	@RequestMapping("/totest.do")
	public String test(){
		return "index";
	}

}
