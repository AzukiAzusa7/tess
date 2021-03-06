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
@Table(name = "userprofile")
public class UserProfile{
	@OneToOne
	@JoinColumn(name="user_id")
	@MapsId
	private User user;
	@Column(name = "user_id")
	private String userId;
	@Column(name = "nickname")
	private String nickname;
}