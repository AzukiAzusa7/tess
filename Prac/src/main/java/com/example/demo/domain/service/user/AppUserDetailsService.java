package com.example.demo.domain.service.user;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.domain.model.User;
import com.example.demo.domain.repository.UserRepository;

@Service
public class AppUserDetailsService implements UserDetailsService{
	@Autowired
	UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String userId) throws UsernameNotFoundException{
		Optional<User> user = userRepository.findById(userId);
		user.orElseThrow(() -> new UsernameNotFoundException("User Not Found:" + username));
		return user.map(AppUserDetailsService::new).get();
	}
}