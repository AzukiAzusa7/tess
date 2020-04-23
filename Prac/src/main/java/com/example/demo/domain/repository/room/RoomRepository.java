package com.example.demo.domain.repository.room;

public interface RoomRepository extends JpaRepository<Room,String>{
	@Query("select r,roomId,r.roomName from roomsUsers ru left outer join user u on ru.user = u.userid left outer join rooms r on ru.room = r.roomId where ru.user = :userId",nativeQuery = true)
	List<Room> findByUserId(@Param("userId") String userId);

	@Query("select r,roomId,r.roomName from roomsUsers ru left outer join user u on ru.user = u.userid left outer join rooms r on ru.room = r.roomId where ru.user = :userId and r.roomName like %:roomName%",nativeQuery = true)
	List<Room> findByUserIdAndRoomName(@Param("userId")String userId,@Param("roomName")String roomName);
}