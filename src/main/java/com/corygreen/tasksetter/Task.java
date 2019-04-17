package com.corygreen.tasksetter;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tasks")
public class Task implements Serializable {
	private static final long serialVersionUID = 2L;
	
	@Id
	@Column(name = "task_id", unique = true)
	private int taskID;
	@Column(name = "description", nullable = false)
	private String description;
	@Column(name = "time_task_set", nullable = true)
	private String timeTaskSet;
	@Column(name = "task_deadline", nullable = false)
	private String taskDeadline;
	@Column(name = "user_id", nullable = false)
	private int userID;

	public int getTaskID() {
		return taskID;
	}

	public void setTaskID(int taskID) {
		this.taskID = taskID;
	}

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getTimeTaskSet() {
		return timeTaskSet;
	}
	public void setTimeTaskSet(String timeTaskSet) {
		this.timeTaskSet = timeTaskSet;
	}
	public String getTaskDeadline() {
		return taskDeadline;
	}
	public void setTaskDeadline(String taskDeadline) {
		this.taskDeadline = taskDeadline;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
}