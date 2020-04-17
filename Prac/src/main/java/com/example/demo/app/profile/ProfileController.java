package com.example.demo.app.profile;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.domain.model.UserProfile;
import com.example.demo.domain.model.dto.UserUpdateRequest;
import com.example.demo.domain.service.user.UserService;


@Controller
public class ProfileController{
	@Autowired
	UserService userService;

	@RequestMapping("profile/{userId}")
	public String viewProfile(@PathVariable String userId,Model model){
		UserProfile userProfile = userService.findById(userId).get().getUserProfile();
		model.addAttribute("userRequest",userProfile);
		return "profile/profile";
	}
	@RequestMapping(value = "profile/{userId}/update",method=RequestMethod.POST)
//	public String update(@PathVariable String userId,@Validated @ModelAttribute UserUpdateRequest userUpdateRequest,BindingResult result,Model model){
	public String update(@PathVariable String userId,@Validated @ModelAttribute User user,BindingResult result,Model model){
		if(result.hasErrors()){
			List<String> errorList = result.getAllErrors().stream().map(e -> e.getDefaultMessage()).collect(Collectors.toList());
			model.addAttribute("validationError",errorList);
			return "profile/{userId}";
		}
//		userService.update(userUpdateRequest);
		userService.update(user);
		return "redirect:/profile/{userId}";
	}
}