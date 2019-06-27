package com.pc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pc.bean.Product;
import com.pc.service.IPriceService;
import com.pc.service.IProductService;

@Controller
@RequestMapping("/price")
public class PriceController
{
	@Autowired
	private IProductService productservice;
	@Autowired
	private IPriceService priceservice;
	
	@RequestMapping("/toprice.do")
	public String toprice(Integer productId,Integer[] discount_ids,Model model){
		System.out.println("²úÆ·id"+productId);
		Product productById = productservice.selectProductById(productId);
		String productMoney = productById.getBak1();
		Integer productMinPrice = productById.getProductMinPrice();
		Integer price = priceservice.calculatePrice(discount_ids);
		Integer integer = new Integer(productMoney);
		Integer totalPrice =integer - price;
		if(totalPrice < productMinPrice){
			 productMinPrice = totalPrice;
		}
		model.addAttribute("totalPrice", totalPrice);
		System.out.println(totalPrice);
		
		return "price";
	}
}
