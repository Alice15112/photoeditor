package com.example.demo.photoeditor;

import java.util.UUID;

public class Task {
    private UUID id;
    private String status;
    private String result;

    public Task{
        this.id = UUID.randomUUID();
        this.status = "in_progress";
    }



    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
