package com.corygreen.tasksetter;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "reminders")
public class Reminder implements Serializable {
	private static final long serialVersionUID = 3L;
	
	@Id
	@Column(name = "reminder_id", unique = true)
	private int reminderID;
	@Column(name = "reminder_time", nullable = false)
	private String reminderTime;
	@Column(name = "task_id", nullable = false)
	private int taskID;
	
	public int getReminderID() {
		return reminderID;
	}
	public void setReminderID(int reminderID) {
		this.reminderID = reminderID;
	}
	public String getReminderTime() {
		return reminderTime;
	}
	public void setReminderTime(String reminderTime) {
		this.reminderTime = reminderTime;
	}
	public int getTaskID() {
		return taskID;
	}
	public void setTaskID(int taskID) {
		this.taskID = taskID;
	}
	
}
