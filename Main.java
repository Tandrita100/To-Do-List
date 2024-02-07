package com.ToDoList;

import java.util.Scanner;

public class Main {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        ToDoList List = new ToDoList();

        while(true){
            System.out.println("1. Add New Task");
            System.out.println("2. Mark As Completed");
            System.out.println("3. Display All Tasks");
            System.out.println("4. Exit");
            System.out.println("Enter Your Choice: ");


        int choice = sc.nextInt();
        sc.nextLine();    // Consume the newline character

        switch (choice) {
            case 1:
                System.out.println("Enter New Task: ");
                String NewTask = sc.nextLine();
                List.addTask(NewTask);
                break;
            case 2:
                System.out.println("Enter task ID to mark as complete: ");
                int taskId = sc.nextInt();
                List.markTaskAsCompleted(taskId);
                break;
            case 3:
                List.displayTasks();
                break;
            case 4:
                System.out.println("Exiting BYE-BYE!");
                System.exit(0);
            default:
                System.out.println("*INVALID CHOICE*");
        }
        }

    }
}
