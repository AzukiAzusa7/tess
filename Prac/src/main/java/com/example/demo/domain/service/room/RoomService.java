package com.example.demo.domain.service.room;


@Service
@Transactional
public class RoomService{
	@Autowired
	RoomRepository roomRepository;
	@Autowired
	RoomUserService roomUserService;
	
	public List<Room> findRooms(String userId){
		return roomRepository.findByRoomId_roomIdAsc(userId);
	}
	public List<Room> ifUserSignIn(@AuthenticationPrincipal LoginUserDetails loginUserDetails){
		List<RoomUser> roomsUser = roomUserService.findAllByUserId(loginUserDetails.getUserid());
		List<Room> rooms = new ArrayList<Room>();
		for(RoomUser roomuser : roomsUser){
			Room room = roomuser.getRoom();
			rooms.add(room);
		}
		return rooms;
	}
}