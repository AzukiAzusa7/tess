package com.example.demo.domain.repository.room;

@Repository
public interface RoomUserRepositoy extends JpaRepository<RoomUser,String>{
	List<RoomUser> findAllByUserId(String userId);
}