package com.corygreen.tasksetter;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "user_id", unique = true)
	private int userID;
	@Column(name = "name", nullable = false)
	private String name;
	@Column(name = "e_mail", nullable = false)
	private String email;
	@Column(name = "password", nullable = false)
	private String password;
	@Column(name = "date_user_joined", nullable = true)
	private String dateUserJoined;
	
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDateUserJoined() {
		return dateUserJoined;
	}
	public void setDateUserJoined(String dateUserJoined) {
		this.dateUserJoined = dateUserJoined;
	}
}
