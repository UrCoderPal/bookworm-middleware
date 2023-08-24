package com.example.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString



public class JwtRequest {

	static{
		System.out.println("JwtRequest class loaded");
	}
	
	private String email;
	private String password;
}
