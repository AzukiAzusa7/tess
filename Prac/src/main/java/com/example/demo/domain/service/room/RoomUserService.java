package com.example.demo.domain.service.room;

@Service
@Transactional
public class RoomUserService{
	@Autowired
	private RoomService roomService;
	@Autowired
	private UserSerivce userService;
//	@Autowired
//	private RoomUserRepository roomUserReposiroty;
	@Autowired
	private RoomRepository roomRepostiory;
	
	public void save(List<RoomUser> roomUsers){
		for(RoomUser ru : roomUsers){
			roomUserRepository.save(ru);
		}
	}
	/*
	public List<Room> findAllByUserId(String userId){
		return roomRepository.findByUserId(userId);
	}
	*/
	
}