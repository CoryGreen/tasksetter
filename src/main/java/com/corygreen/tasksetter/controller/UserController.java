package com.corygreen.tasksetter.controller;

import com.corygreen.tasksetter.repository.UserRepository;
import com.corygreen.tasksetter.User;
import net.bytebuddy.implementation.bind.MethodDelegationBinder;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@RestController
@RequestMapping("api/v1/")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value="users", method = RequestMethod.GET)
    public List<User> users() {
        return userRepository.findAll();
    }
    @RequestMapping(value="users/{id}", method = RequestMethod.GET)
    public User get(@PathVariable Long id) {
        return userRepository.findOne(id);
    }
    @RequestMapping(value = "users", method = RequestMethod.POST)
    public User create (@RequestBody User user){
;       return userRepository.saveAndFlush(user);
    }

    @RequestMapping(value = "users/{id}", method = RequestMethod.PUT)
    public User update (@PathVariable Long id, @RequestBody User user){
        User existingUser = userRepository.findOne(id);
        BeanUtils.copyProperties(user, existingUser);
        return userRepository.saveAndFlush(user);
    }

    @RequestMapping(value = "users/{id}", method = RequestMethod.DELETE)
    public User delete (@PathVariable Long id){
        User existingUser = userRepository.findOne(id);
        userRepository.delete(existingUser);
        return existingUser;
    }

}
