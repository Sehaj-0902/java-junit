package com.bridgelabz;

public class TimeoutPerformance {
    public String longRunningTask() {
        try {
            Thread.sleep(3000);
        }
        catch (InterruptedException e) {
            throw new RuntimeException();
        }
        return "Task Completed!";
    }
}
