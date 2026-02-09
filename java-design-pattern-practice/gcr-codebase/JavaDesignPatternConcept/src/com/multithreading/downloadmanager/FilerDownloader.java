package com.multithreading.downloadmanager;

import java.util.Random;

class FileDownloader implements Runnable {

    private String fileName;
    private Random random = new Random();

    public FileDownloader(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {
        for (int progress = 0; progress <= 100; progress += 25) {
            try {
                Thread.sleep(random.nextInt(500) + 200); // simulate download time
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            System.out.println("[" + Thread.currentThread().getName() +
                    "] Downloading " + fileName + ": " + progress + "%");
        }
    }
}