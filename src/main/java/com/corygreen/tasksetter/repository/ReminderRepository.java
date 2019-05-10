package com.corygreen.tasksetter.repository;

import com.corygreen.tasksetter.Reminder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReminderRepository extends JpaRepository<Reminder, Long> {

}
