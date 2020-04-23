package com.example.demo.app.room;

@Controller
public class RoomsController{
	@Autowired
	RoomService roomService;
	@Autowired
	UserService userService;
	
	@RequestMapping(value = "rooms" ,Method = RequestMethod.GET)
	String listRooms(Model model, @AuthenticationPrincipal LoginUserDetails loginUserDetails){
		List<Room> rooms = roomService.ifUserSignIn(loginUserDetails);
		//List<Room> rooms = roomServive.findRooms(userId);
		model.addAttribute("rooms",rooms);
		return "index";
	}
	@RequestMapping(value = "rooms/{userId}" ,Method = RequestMethod.GET)
	String listRooms(Model model, @PathVariable String userId){
		List<Room> rooms = roomService.findRooms(userId);
		model.addAttribute("rooms",rooms);
		return "index";
	}

	@RequestMapping(value = "rooms/search/{userId}" ,Method = RequestMethod.POST)
	String searchRooms(Model model,@PathVariable String userId,@ModelAttribute SearchForm searchForm){
		List<Room> rooms = roomService.searchRoom(userId,searchForm.getRoomName());
		model.addAttribute("rooms",rooms);
		return "index";
	}

	@RequestMapping(value = "rooms/{userId}/add" ,Method = RequestMethod.GET)
	String addRoom(Model model,@PathVariable String userId){
		List<User> friends = userService.findAll(userId);
		User user = userService.findByUserId(userId);
		model.addAttribute("user",user);
		model.addAttribute("friends",friends);
		return "room/addroom";
	}
	@RequestMapping(value = "rooms/{userId}/save",Method = RequestMethod.POST)
	String saveRoom(Model model,Room room,List<RoomUser> roomUsers,@PathVariable String userId){
		roomService.save(room);
		roomUserService.save(roomUsers);
		return "rooms/"+ userId;
	}

}