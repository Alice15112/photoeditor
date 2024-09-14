package com.example.demo.photoeditor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/task")
public class TaskController {
    @Autowired
    private TaskService taskService;

    @PostMapping
    public UUID createTask(){
        return taskService.createTask();
    }

    @GetMapping("/status/{taskId}")
    public String getStatus(@PathVariable UUID taskId){
        Task task = taskService.getTask(taskId);
        return task != null ? task.getStatus() : "Task not found";
    }
    @GetMapping("/result/{taskId}")
    public String getresult(@PathVariable UUID taskId){
        Task task = taskService.getTask(taskId);
        return task != null ? task.getResult() : "Task not found";
    }
}
