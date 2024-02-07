package com.ToDoList;

import java.util.ArrayList;

public class ToDoList {
    private ArrayList<Task> tasks;      //arraylist to store tasks

    public ToDoList() {
        tasks = new ArrayList<>();
    }

    public void addTask(String description) {      //function to add tasks
        Task newTask = new Task(description);
        tasks.add(newTask);
        System.out.println("Task added: " + newTask);
    }

    public void markTaskAsComplete(int taskId) {
        for (Task task : tasks) {
            if (task.getId() == taskId) {
                task.markAsCompleted();
                System.out.println("Task marked as completed: " + task);
                return;
            }
        }
        System.out.println("Task not found with ID: " + taskId);
    }

    public String getTasksAsString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Task task : tasks) {
            stringBuilder.append(task.toString()).append("\n");
        }
        return stringBuilder.toString();
    }

    public void displayTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks in the list.");
        } else {
            System.out.println("Tasks:");
            for (Task task : tasks) {
                System.out.println(task);
            }
        }
    }
}


