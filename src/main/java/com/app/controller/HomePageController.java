package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomePageController {
	public HomePageController() {
		System.out.println("in ctor of "+getClass());
	}
	//add req handling method to forward the clnt to index.jsp
	@RequestMapping("/")
	public String showHomePage()
	{
		System.out.println("in show home page");
		return "/index";//AVN : /WEB-INF/views/index.jsp
	}

}
