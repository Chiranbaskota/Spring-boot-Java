package com.chiran.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController
{
	@RequestMapping("home")
	
    public String home() {
    	System.out.println("Hi I am here.");
    	return "home.jsp";
    }
}
