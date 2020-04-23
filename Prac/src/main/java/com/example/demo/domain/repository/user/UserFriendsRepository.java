package com.example.demo.domain.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.model.User;

@Repository
public interface UserFriendsRepository extends JpaRepository<User,String>{
	//TODO ñ‚ëËÇ»Ç≠SQLÇ™é¿çsÇ≥ÇÍÇÈÇ©
	@Query("select u.user_id,u.nickname from userfriends uf left outer join user u on uf.friend_id = u.user_id where uf.user_id = :userId",nativeQuery = true)
	public List<User> findAll(@Param("userId") String userId);
}