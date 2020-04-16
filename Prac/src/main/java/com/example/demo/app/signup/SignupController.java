package com.example.demo.app.signup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.domain.model.dto.UserRequest;
import com.example.demo.domain.service.user.UserService;

@Controller
public class SignupController{
	@Autowired
	UserService userService;

	@GetMapping("signup")
	String signupForm(){
		return "signup/signup";
	}
	@PostMapping("signup")
	public String create(@Validated @ModelAttribute UserRequest userRequest,BindingResult result,Model model){
		if(result.hasErrors()){
			return "signup";
		}
		userService.save(userRequest);
		return "redirect:/index";
	}
}