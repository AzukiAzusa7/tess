package com.example.demo.domain.model;

@Entity
@Data
@Table(name = "rooms")
public class Room implements Serializable{
	@OneToMany(mappedBy = "room")
	private List<RoomUser> roomUsers;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer roomId;
	private String roomName;
}