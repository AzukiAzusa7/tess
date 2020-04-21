package com.example.demo.domain.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;

@Entity
@Data
@Table(name = "user")
public class User{
	@OneToOne(mappedBy="user_id",cascade = CascadeType.ALL)
	@ToString.Exclude
	private UserProfile userProfile;
	
	@OneToMany(mappedBy = "user")
	private List<RoomUser> roomUsers;

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "userid")
	private String userid;
	@Column(name = "password")
	private String password;
	@Enumerated(EnumType.STRING)
	@Column(name = "role")
	private RoleName role;
}