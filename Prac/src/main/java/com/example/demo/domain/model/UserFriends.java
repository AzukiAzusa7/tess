package com.example.demo.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "userfriends")
public class UserFriends{
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;

	@OneToMany(mappedBy = "user")
	private List<User> friends;
	
	@Column(name = "friend_id")
	private String friend_id;
}