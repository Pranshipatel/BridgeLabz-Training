package com.csv.basic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadLargeCSV {

    private static final int CHUNK_SIZE = 100;

    public static void main(String[] args) {

        String filePath = "data/large_employees.csv";
        int totalRecords = 0;
        int batchNumber = 0;

        System.out.println("========================================");
        System.out.println(" LARGE CSV PROCESSING REPORT ");
        System.out.println("========================================");
        System.out.println("File       : " + filePath);
        System.out.println("Batch Size : " + CHUNK_SIZE);
        System.out.println("----------------------------------------");

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;
            boolean isHeader = true;
            List<String> batch = new ArrayList<>(CHUNK_SIZE);

            while ((line = br.readLine()) != null) {

                if (isHeader) {
                    isHeader = false;
                    continue;
                }

                batch.add(line);

                if (batch.size() == CHUNK_SIZE) {

                    batchNumber++;
                    processBatch(batch);
                    totalRecords += batch.size();

                    System.out.println("Processed Batch   : " + batchNumber);
                    System.out.println("Records Processed : " + totalRecords);
                    System.out.println("----------------------------------------");

                    batch.clear();
                }
            }

            if (!batch.isEmpty()) {
                batchNumber++;
                processBatch(batch);
                totalRecords += batch.size();
            }

            System.out.println("FINAL SUMMARY");
            System.out.println("----------------------------------------");
            System.out.println("Total Records     : " + totalRecords);
            System.out.println("========================================");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void processBatch(List<String> batch) {
        for (String record : batch) {
            // processing logic
        }
    }
}
