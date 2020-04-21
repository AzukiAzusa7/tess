package com.example.demo.domain.service;

public class LoginUserDetails extends org.springframework.security.core.userdetails.User{
	private String userId;
	public LoginUserDetails(User user){
        super(user.getUserid(), user.getPassword(), AuthorityUtils.createAuthorityList("USER"));
        this.userId = user.getUserid();
    }
    public String getUserid() {
        return userId;
    }
}