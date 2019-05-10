package com.corygreen.tasksetter.repository;

import com.corygreen.tasksetter.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
