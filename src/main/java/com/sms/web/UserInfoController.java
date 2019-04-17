package com.sms.web;

import com.sms.model.UserInfo;
import com.sms.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;


@Controller
public class UserInfoController {

	@Autowired
	private UserInfoService service;

	@RequestMapping(value={"/","/login"},method = RequestMethod.GET)
	protected String login() {
		return "login";
	}

	@RequestMapping(value="/login",method = RequestMethod.POST)
	protected String login(HttpServletRequest request, Model model) {
		
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		
		UserInfo user = this.service.login(name, password);
		
		if(user==null)
		{
			model.addAttribute("msg", "用户名或者密码错误");
			return "/login";
		}
		else{
			request.getSession().setAttribute("user", user);
			return "redirect:/student/list";
		}
		
	}

}
