package com.multithreading.threadstatemonitoring;

class TaskRunner extends Thread {

    public TaskRunner(String name) {
        super(name);
    }

    @Override
    public void run() {
        // RUNNABLE (computation)
        for (int i = 0; i < 1_000_000; i++) {
            int x = i * i;
        }

        // TIMED_WAITING
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
