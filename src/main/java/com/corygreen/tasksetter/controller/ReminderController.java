package com.corygreen.tasksetter.controller;

import com.corygreen.tasksetter.repository.ReminderRepository;
import com.corygreen.tasksetter.Reminder;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/")
public class ReminderController {
    @Autowired
    private ReminderRepository reminderRepository;
    @RequestMapping(value="reminders", method = RequestMethod.GET)
    public List<Reminder> reminders() {
        return reminderRepository.findAll();
    }
    @RequestMapping(value="reminders/{id}", method = RequestMethod.GET)
    public Reminder get(@PathVariable Long id) {
        return reminderRepository.findOne(id);
    }

    @RequestMapping(value = "reminders", method = RequestMethod.POST)
    public Reminder create(@RequestBody Reminder reminder){
        return reminderRepository.saveAndFlush(reminder);
    }

    @RequestMapping(value = "reminders/{id}", method = RequestMethod.PUT)
    public Reminder update (@PathVariable Long id, @RequestBody Reminder reminder) {
        Reminder existingReminder = reminderRepository.findOne(id);
        BeanUtils.copyProperties(reminder, existingReminder);
        return reminderRepository.saveAndFlush(reminder);
    }
    @RequestMapping(value = "reminders/{id}", method = RequestMethod.DELETE)
    public Reminder delete (@PathVariable Long id){
        Reminder existingReminder = reminderRepository.findOne(id);
        reminderRepository.delete(existingReminder);
        return existingReminder;
    }
}
