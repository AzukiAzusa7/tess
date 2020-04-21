package com.example.demo.domain.model;

@Entity
@Data
@Table(name = "RoomsUsers")
public class RoomUser{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@ManyToOne
	private User user;
	@ManyToOne
	private Room room;

}