package com.multithreading.threadstatemonitoring;

import java.util.Arrays;
import java.util.List;

public class ThreadStateMonitoringSystem {

    public static void main(String[] args) {

        TaskRunner t1 = new TaskRunner("Task-1");
        TaskRunner t2 = new TaskRunner("Task-2");

        List<Thread> taskThreads = Arrays.asList(t1, t2);

        StateMonitor monitor = new StateMonitor(taskThreads);

        // NEW state visible here
        monitor.start();

        t1.start();
        t2.start();
    }
}