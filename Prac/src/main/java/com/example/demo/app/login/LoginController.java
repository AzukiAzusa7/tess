package com.example.demo.app.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//https://medium-company.com/category/work/development/java/
@Controller
public class LoginController{
	@RequestMapping("login")
	String loginForm(){
		return "login/login";
	}
	//@RequestMapping("logout")
}