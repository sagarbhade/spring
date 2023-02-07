package com.app.controller;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
public HelloController() {
	System.out.println("in constr of"+getClass());
}
@PostConstruct
public void init() {
	System.out.println("init"+getClass());
}
@RequestMapping("/hello")
public String sayHello() {
	System.out.println("in sayHello");
	return "/welcome";
}
}
