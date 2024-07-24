package com.dileep.assignment5;

public class Main {
	public static void main(String[] args) {
        TaskScheduler scheduler = new TaskScheduler();

        // Define tasks using lambda expressions
        Task task1 = () -> System.out.println("Task 1 running... (every 2 seconds)");
        Task task2 = () -> System.out.println("Task 2 running... (every 4 seconds)");
        Task task3 = () -> System.out.println("Task 3 running... (every 6 seconds)");

        // Schedule tasks with their respective intervals
        scheduler.scheduleTask(task1, 2); 
        scheduler.scheduleTask(task2, 4); 
        scheduler.scheduleTask(task3, 6); 

        try {
            Thread.sleep(30000); // Sleep for 30 seconds to observe task execution
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
