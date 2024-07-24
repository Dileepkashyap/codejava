package com.dileep.assignment5;
import java.util.Timer;
import java.util.TimerTask;
public class TaskScheduler {
	private Timer timer;

    public TaskScheduler() {
        timer = new Timer(true); 
    }

    public void scheduleTask(Task task, int intervalInSeconds) {
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                task.execute();
            }
        }, 0, intervalInSeconds * 1000); 
    }
}
