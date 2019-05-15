package com.corygreen.tasksetter;

// import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "tasks")
public class Task/* implements Serializable*/ {
	// private static final long serialVersionUID = 2L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long taskID;
	@Column(name = "description", nullable = false)
	private String description;
	@Column(name = "time_task_set", nullable = true)
	private String timeTaskSet;
	@Column(name = "task_deadline", nullable = true)
	private String taskDeadline;
	@Column(name = "user_id", nullable = false)
	private Long userID;
	@Column(name = "task_complete", nullable = false)
	private Boolean taskComplete;

	public Task() {

	}

	public Task(Long taskID, String description, String timeTaskSet, String taskDeadline, Long userID) {
		this.taskID = taskID;
		this.description = description;
		this.timeTaskSet = timeTaskSet;
		this.taskDeadline = taskDeadline;
		this.userID = userID;
		this.taskComplete = taskComplete;
	}

	public Long getTaskID() {
		return taskID;
	}

	public void setTaskID(Long taskID) {
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
	public Long getUserID() {
		return userID;
	}
	public void setUserID(Long userID) {
		this.userID = userID;
	}
	public Boolean getTaskComplete() { return taskComplete; }
	public void setTaskComplete(Boolean taskComplete) { this.taskComplete = taskComplete; }
}
