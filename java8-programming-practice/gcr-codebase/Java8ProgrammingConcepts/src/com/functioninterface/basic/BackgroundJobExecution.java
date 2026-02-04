package com.functioninterface.basic;

public class BackgroundJobExecution {
	public static void main(String[] args) {

        // Runnable functional interface
        Runnable backgroundTask = () -> {
            System.out.println("Background task started...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Background task completed.");
        };

        // Execute asynchronously
        Thread thread = new Thread(backgroundTask);
        thread.start();

        System.out.println("Main thread continues execution...");
    }

}
