package com.corygreen.tasksetter.repository;

import com.corygreen.tasksetter.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {

}
