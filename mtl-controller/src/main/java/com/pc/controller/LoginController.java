package com.pc.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pc.bean.JsonResultVo;
import com.pc.bean.User;
import com.pc.service.IUserService;

@Controller
@RequestMapping("/login")
public class LoginController
{
	@Autowired
	private IUserService userservice;
	
	@RequestMapping("/tologin")
	public String login(String userName,String password,HttpSession session,Model model){
		System.out.println(userName);
		System.out.println(password);
		JsonResultVo jsonResultVo = new JsonResultVo();
		User selectUser = userservice.selectUser(userName, password);
		if(selectUser != null){
			jsonResultVo.setCode(1);
			session.setAttribute("user", selectUser);
			model.addAttribute("jsonResult", jsonResultVo);
		}else{
			jsonResultVo.setCode(0);
			model.addAttribute("jsonResult", jsonResultVo);
		}
		return "login";
	}
}
