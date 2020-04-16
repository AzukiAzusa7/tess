package com.example.demo.domain.model.dto;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class UserUpdateRequest extends UserRequest implements Serializable{
	@NotNull
	private String userId;
}