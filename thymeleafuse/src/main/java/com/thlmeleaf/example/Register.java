package com.thlmeleaf.example;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
@Entity
public class Register {
	@Valid
	@NotBlank(message="the username cann't be empty ")
	@Size(min=3,max=12,message="the username should be greater then 2 and smaller then 13 ")
	public  String name;
	@Id
	@Valid
	@NotNull
	@Min(1)
	public int rollnumber ;
	@Valid
	@NotBlank(message="roll number cann't be empty ")
	public String password;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getRollnumber() {
		return rollnumber;
	}
	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}
	@Override
	public String toString() {
		return "Logincont [name=" + name + ", password=" + password + ", rollnumber=" + rollnumber + ", age=" + age
				+ ", Address=" + Address + "]";
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	@Valid
	@NotNull
	public int age ;
	@Valid
	@NotBlank(message="Address cann't be empty ")
	public  String  Address;	
}
