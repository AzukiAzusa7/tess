package com.example.demo.domain.model;

@Entity
@Data
@Table(name = "rooms")
public class Room implements Serializable{
	//TODO OneToMany‚ª³í‚É“®ì‚·‚é‚©
	@OneToMany(mappedBy = "room")
	private List<RoomUser> roomUsers;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer room_id;
	private String roomName;
}