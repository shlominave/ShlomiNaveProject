package com.example.shlominaveproject;

import android.widget.SeekBar;

import java.util.Date;

public class Task {
    private String description;
    private String deadline;
//    private SeekBar progress=null;
    public boolean completed=false;
   private int id=1;

//    public Task(String description, String deadline, SeekBar progress, int id) {
//        this.description = description;
//        this.deadline = deadline;
//        this.progress = progress;
//        this.completed = false;
//        this.id=id;
//    }

    public Task(String description, String deadline,int id) {
        this.description = description;
        this.deadline = deadline;
        this.completed = false;
        this.id=id;
    }

//    public Task(String description, SeekBar progress, int id) {
//        this.description = description;
//        this.progress = progress;
//        this.completed = false;
//        this.id=id;
//    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDeadline() {
        return deadline;
    }

    public void  setDeadline(String deadline) {
        this.deadline = deadline;
    }

//    public SeekBar getProgress() {
//        return progress;
//    }
//
//    public void setProgress(SeekBar progress) {
//        this.progress = progress;
//    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

//    @Override
//    public String toString() {
//        return "Task{" +
//                "description='" + description + '\'' +
//                ", deadline=" + deadline +
//                ", progress=" + progress +
//                ", completed=" + completed +
//                ", id=" + id +
//                '}';
//    }


    @Override
    public String toString() {
        return
                "deadline:'" + deadline + '\'' +
                ", completed=" + completed +
                ", This task's task id is:" + id ;
    }
}
