package com.multithreading.restaurantordersystem;

class Chef extends Thread {

    private String dish;
    private long totalTime; // in milliseconds

    public Chef(String name, String dish, long totalTime) {
        super(name);
        this.dish = dish;
        this.totalTime = totalTime;
    }

    @Override
    public void run() {

        System.out.println(getName() + " started preparing " + dish);

        int[] progressSteps = {25, 50, 75, 100};

        for (int progress : progressSteps) {
            try {
                Thread.sleep(totalTime / 4); // divide cooking time into 4 steps
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            System.out.println(getName() + " preparing " + dish + ": "
                    + progress + "% complete");
        }

        System.out.println(getName() + " completed " + dish);
    }
}