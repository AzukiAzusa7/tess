package com.example.demo.domain.model;

@Entity
@Data
@Table(name = "RoomsUsers")
public class RoomUser{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
	@ManyToOne
	@JoinColumn(name="room_id")
	private Room room;
	

}