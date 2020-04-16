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
	@JoinColumn
	@MapsId
	@Column(name = "user_id")
	private String user_id;
	@Column(name = "nickname")
	private String nickname;
}