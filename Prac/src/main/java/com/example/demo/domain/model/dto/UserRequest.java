package com.example.demo.domain.model.dto;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class UserRequest implements Serializable{
	@NotEmpty(message ="empty")
	@Size(max = 100,message = "100�ȉ�")
	private String userId;
	@Size(max = 255,message ="255�ȉ�")
	private String nickname;
}