package com.example.demo.domain.model;

@Entity
@Data
@Table(name = "rooms")
public class Room implements Serializable{
	//TODO OneToMany������ɓ��삷�邩
	@OneToMany(mappedBy = "room")
	private List<RoomUser> roomUsers;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer room_id;
	private String roomName;
}