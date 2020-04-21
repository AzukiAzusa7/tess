package com.example.demo.domain.repository.room;

public interface RoomRepository extends JpaRepository<Room,String>{
	@Query("SELECT DISTINCT x FROM Room x WHERE x.userId = :userId ORDER BY x.roomId ASC")
	List<Room> findByRoomId_userIdOrderByRoomId_roomIdAsc(@Param("userId") String userId);
}