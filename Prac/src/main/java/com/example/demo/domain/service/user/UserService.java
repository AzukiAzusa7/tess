package com.example.demo.domain.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.model.dto.UserRequest;
import com.example.demo.domain.model.dto.UserUpdateRequest;
import com.example.demo.domain.repository.UserRepository;

@Service
@Transactional(rollbackOn = Exception.class)
public class UserService{
	@Autowired
	private UserRepository userRepository;
	//
	public User findById(String userId){
		return userRepository.findById(userId).get();
	}
//	public void update(UserUpdateRequest userUpdateRequest){
	public void update(User user){
//		UserProfile userProfile = findById(userUpdateRequest.getUserId()).getUserProfile();
//		UserProfile userProfile = user.getUserProfile();
//		userProfile.setNickName(userProfile.getNickName());
//		userRepository.save(userProfile);
		userRepository.save(user);
	}
//	public void save(UserRequest userRequest){
	public void save(User user){
//		User user = new User();
//		user.setUserId(userRequest.getUserId);
//		user.setPassword(userRequest.setUserPassword);
//		user.setRoleName("USER");
		userRepository.save(user);
	}
}
