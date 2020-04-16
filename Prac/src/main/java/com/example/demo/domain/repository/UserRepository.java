package com.example.demo.domain.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,String>{
	public Optional<User> findById(String UserId);
}