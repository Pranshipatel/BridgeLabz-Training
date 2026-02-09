package com.multithreading.threadstatemonitoring;

import java.time.LocalTime;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class StateMonitor extends Thread {

    private List<Thread> threads;
    private Map<String, Set<Thread.State>> stateHistory = new HashMap<>();

    public StateMonitor(List<Thread> threads) {
        this.threads = threads;
    }

    @Override
    public void run() {

        boolean allTerminated = false;

        while (!allTerminated) {
            allTerminated = true;

            for (Thread t : threads) {
                Thread.State state = t.getState();
                stateHistory
                        .computeIfAbsent(t.getName(), k -> new HashSet<>())
                        .add(state);

                System.out.println("[Monitor] " + t.getName()
                        + " is in " + state
                        + " state at " + LocalTime.now());

                if (state != Thread.State.TERMINATED) {
                    allTerminated = false;
                }
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        // Summary
        System.out.println("\n===== SUMMARY =====");
        for (Map.Entry<String, Set<Thread.State>> entry : stateHistory.entrySet()) {
            System.out.println(entry.getKey() + " went through "
                    + entry.getValue().size() + " states: " + entry.getValue());
        }
    }
}
