package com.corygreen.tasksetter;

// import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User/* implements Serializable*/ {
	// private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long userID;
	@Column(name = "name", nullable = false)
	private String name;
	@Column(name = "e_mail", nullable = false)
	private String email;
	@Column(name = "password", nullable = false)
	private String password;
	@Column(name = "date_user_joined", nullable = true)
	private String dateUserJoined;

	public User() {

	}

	public User(Long userID, String name, String email, String password, String dateUserJoined) {
		this.userID = userID;
		this.name = name;
		this.email = email;
		this.password = password;
		this.dateUserJoined = dateUserJoined;
	}

	public Long getUserID() {
		return userID;
	}
	public void setUserID(Long userID) {
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
