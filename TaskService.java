package com.example.demo.photoeditor;

import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class TaskService {
    private final Map<UUID, Task> tasks = new ConcurrentHashMap<>();

    public UUID createTask(){
        Task task = new Task();
        tasks.put(task.getId(), task);

        new Thread(() ->{
            try{
                Thread.sleep(5000);
                task.setResult("Task result");
                task.setStatus("ready");
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }).start();

        return task.getId();
    }

    public Task getTask(UUID id){
        return tasks.get(id);
    }

}
