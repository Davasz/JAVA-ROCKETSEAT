package com.davas.todolist.user;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserModel {
	
	@JsonProperty("username")
	String username;
	
	@JsonProperty("name")
	String name;
	
	@JsonProperty("password")
	String password;
}
