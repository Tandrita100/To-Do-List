package com.ToDoList;

public class Task {
    private static int idCounter = 1;    //initially it will be 1

    private int id;
    private String description;
    private boolean completed;

    public Task(String description) {
        this.id = idCounter++;
        this.description = description;
        this.completed = false;
    }

    public int getId() {      //getter to get id
        return id;
    }

    public String getDescription() {       //getter to get description
        return description;
    }

    public boolean isCompleted() {       //getter to check if completed or not
        return completed;
    }

    public void markAsCompleted() {
        this.completed = true;
    }

    public String toString() {
    String completionStatus = "";
    if(completed)

    {
        completionStatus = "(completed)";   //if the task is completed it appends completed to completionstatus
    }
    return"["+id +"]"+ description +completionStatus;
    }
}





