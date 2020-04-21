package com.example.demo.app.room;

@Controller
public class RoomsController{
	@Autowired
	RoomService roomService;
	
	@RequestMapping(value = "rooms" ,Method = RequestMethod.GET)
	String listRooms(Model model, @AuthenticationPrincipal LoginUserDetails loginUserDetails){
		List<Room> rooms = roomService.ifUserSignIn(loginUserDetails);
		//List<Room> rooms = roomServive.findRooms(userId);
		model.addAttribute("rooms",room);
		return "index";
	}
}