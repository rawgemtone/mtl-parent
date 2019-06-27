package com.pc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pc.bean.AttrInfo;
import com.pc.bean.AttrType;
import com.pc.bean.Product;
import com.pc.service.IAttrService;
import com.pc.service.IProductService;


@Controller
@RequestMapping("/info")
public class InfoController
{
	@Autowired
	private IProductService productservice;
	@Autowired
	private IAttrService attrservice;
	@RequestMapping("/toInfo")
	public String toinfo(Integer productId,Model model){
		System.out.println("²úÆ·id"+productId);
		Product selectProductById = productservice.selectProductById(productId);
		model.addAttribute("productById", selectProductById);
		
		List<AttrType> selectAttrTypeList = attrservice.selectAttrTypeList();
		model.addAttribute("attrTypeList", selectAttrTypeList);
		System.out.println(selectAttrTypeList);
		
		List<AttrInfo> selectAttrInfoList = attrservice.selectAttrInfoList();
		System.out.println(selectAttrInfoList);
		model.addAttribute("attrInfoList", selectAttrInfoList);
		return "info";
	}
}
