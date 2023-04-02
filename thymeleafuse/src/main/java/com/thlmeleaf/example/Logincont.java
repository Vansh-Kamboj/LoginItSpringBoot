package com.thlmeleaf.example;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
public class Logincont {
	@Valid
	@NotBlank(message="the username cann't be empty ")
	@Size(min=3,max=12,message="the username should be greater then 2 and smaller then 13 ")
	public  String username;
	public String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword() {
		return password;
	}
	
	@Override
	public String toString() {
		return "Logincont [username=" + username + ", password=" + password + "]";
	}
	

}
