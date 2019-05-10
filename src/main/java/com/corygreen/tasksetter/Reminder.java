package com.corygreen.tasksetter;

// import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "reminders")
public class Reminder/* implements Serializable*/ {
	// private static final long serialVersionUID = 3L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long reminderID;
	@Column(name = "reminder_time", nullable = false)
	private String reminderTime;
	@Column(name = "task_id", nullable = false)
	private Long taskID;

	public Reminder() {

	}

	public Reminder(Long reminderID, String reminderTime, Long taskID) {
		this.reminderID = reminderID;
		this.reminderTime = reminderTime;
		this.taskID = taskID;
	}
	
	public Long getReminderID() {
		return reminderID;
	}
	public void setReminderID(Long reminderID) {
		this.reminderID = reminderID;
	}
	public String getReminderTime() {
		return reminderTime;
	}
	public void setReminderTime(String reminderTime) {
		this.reminderTime = reminderTime;
	}
	public Long getTaskID() {
		return taskID;
	}
	public void setTaskID(Long taskID) {
		this.taskID = taskID;
	}
	
}
