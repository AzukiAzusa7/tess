package com.example.demo.domain.model;

@Entity
@Data
@Table(name = "rooms")
public class Room implements Serializable{
	//TODO OneToManyが正常に動作するか
	@OneToMany(mappedBy = "room")
	private List<RoomUser> roomUsers;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer room_id;
	private String roomName;
}