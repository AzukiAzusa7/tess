package com.example.demo.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.model.User;
import com.example.demo.domain.model.UserProfile;
import com.example.demo.domain.service.user.UserService;

@Controller
public class IndexController{
	@Autowired
	UserService userService;

	@RequestMapping("index")
	String indexForm(User user,Model model){
		//TODO index��userProfile�̏�񂪎擾�ł���̂����m�F
		UserProfile userProfile = userService.findById(user.getUserid()).getUserProfile();
		model.addAttribute("userProfile",userProfile);
		return "index";
	}
}