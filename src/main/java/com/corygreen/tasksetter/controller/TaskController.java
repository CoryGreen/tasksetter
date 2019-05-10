package com.corygreen.tasksetter.controller;

import com.corygreen.tasksetter.repository.TaskRepository;
import com.corygreen.tasksetter.Task;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/")
public class TaskController {
    @Autowired
    private TaskRepository taskRepository;

    @RequestMapping(value="tasks", method = RequestMethod.GET)
    public List<Task> tasks() {
        return taskRepository.findAll();
    }
    @RequestMapping(value="tasks/{id}", method = RequestMethod.GET)
    public Task get(@PathVariable Long id) {
        return taskRepository.findOne(id);
    }

    @RequestMapping(value = "tasks", method = RequestMethod.POST)
    public Task create(@RequestBody Task task){
        return taskRepository.saveAndFlush(task);
    }

    @RequestMapping(value = "tasks/{id}", method = RequestMethod.PUT)
    public Task update (@PathVariable Long id, @RequestBody Task task) {
        Task existingTask = taskRepository.findOne(id);
        BeanUtils.copyProperties(task, existingTask);
        return taskRepository.saveAndFlush(task);
    }
    @RequestMapping(value = "tasks/{id}", method = RequestMethod.DELETE)
    public Task delete (@PathVariable Long id){
        Task existingTask = taskRepository.findOne(id);
        taskRepository.delete(existingTask);
        return existingTask;
    }
}
