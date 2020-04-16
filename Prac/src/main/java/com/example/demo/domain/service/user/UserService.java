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
	//���[�U�[���X�V
	public void update(UserUpdateRequest userUpdateRequest){
		UserProfile userProfile = findById(userUpdateRequest.getUserId());
		userProfile.setNickName(userUpdateRequest.getNickName());
		userRepository.save(userProfile);
	}
	public void save(UserRequest userRequest){
		User user = new User();
		user.setUserId(userRequest.getUserId);
		user.setPassword(userRequest.serUserPassword);
		user.serRoleName("USER");
		userRepository.save(user);
	}
}
