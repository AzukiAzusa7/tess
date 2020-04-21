package com.example.demo.domain.service.room;

@Service
@Transactional
public class RoomUserService{
	@Autowired
	private RoomService roomService;
	@Autowired
	private UserSerivce userService;
	@Autowired
	private RoomUserRepository roomUserReposiroty;
	/*
	public void save(RoomUser roomUser,Integer roomId ,String userId){
		roomUser.setRoom(roomService.findOne(roomId));
		roomUser.setUser(userService.findOne(userId));
		roomUserRepository.save(roomUser);
	}
	*/
	public List<RoomUser> findAllByUserId(String userId){
		return roomUserRepository.findAllByUserId(userId);
	}
}