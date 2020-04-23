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
	@Autowired
	private UserProfileRepository userProfileRepository;
	@Autorwired
	private UserFriendsRepository userFriendsRepository;
	//
	public User findById(String userId){
		return userRepository.findById(userId).get();
	}

	public List<User> findAll(String userId){
		return userFriendsRepository.findAll(userId);
	}
//	public void update(UserUpdateRequest userUpdateRequest){
//	public void update(User user){
//		UserProfile userProfile = findById(userUpdateRequest.getUserId()).getUserProfile();
//		UserProfile userProfile = user.getUserProfile();
//		userProfile.setNickName(userProfile.getNickName());
//		userRepository.save(userProfile);
//		userRepository.save(user);
	//TODO メソッドが正常に動作するか確認
	public void udpdate(ProfileForm profileForm){
		UserProfile userProfile = new UserProfile();
		userProfile.setUserId(profileForm.getUseId());
		userProfile.setNickName(profileForm.getNickname());
		userProfileReposiroty.save(userProfile);
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
