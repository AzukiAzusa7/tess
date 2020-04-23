package com.example.demo.domain.service.room;


@Service
@Transactional
public class RoomService{
	@Autowired
	RoomRepository roomRepository;
//	@Autowired
//	RoomUserService roomUserService;
	
	//TODO room‚ğæ“¾‚·‚éSQL‚ª³í‚Éì“®‚·‚é‚©Šm”F
	public List<Room> findRooms(String userId){
		return roomRepository.findByUserId(userId);
	}
	public List<Room> ifUserSignIn(@AuthenticationPrincipal LoginUserDetails loginUserDetails){
//		List<RoomUser> roomsUser = roomUserService.findAllByUserId(loginUserDetails.getUserid());
//		List<Room> rooms = new ArrayList<Room>();
//		for(RoomUser roomuser : roomsUser){
//			Room room = roomuser.getRoom();
//			rooms.add(room);
//		}
//		return rooms;
		return findRooms(loginUserDetails.getUserId());
	}
	public List<Room> searchRoom(String userId,String roomId){
		roomRepository.findByUserIdAndRoomName(userId,roomId);
	}
	public void save(Room room){
		roomRepository.save(room);
	}
	
}