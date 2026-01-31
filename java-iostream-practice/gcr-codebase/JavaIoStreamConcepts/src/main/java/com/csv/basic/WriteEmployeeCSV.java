package com.csv.basic;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteEmployeeCSV {

    public static void main(String[] args) {

        String directoryPath = "output";
        String filePath = directoryPath + "/employees.csv";

        File directory = new File(directoryPath);
        if (!directory.exists()) {
            directory.mkdir();
        }

        int recordCount = 0;

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {

            // Write CSV header
            writer.write("ID,Name,Department,Salary");
            writer.newLine();

            // Write employee records
            writer.write("101,Pranshi,Engineering,60000");
            writer.newLine();
            recordCount++;

            writer.write("102,Rahul,HR,52000");
            writer.newLine();
            recordCount++;

            writer.write("103,Neha,Marketing,55000");
            writer.newLine();
            recordCount++;

            writer.write("104,Priya,Finance,62000");
            writer.newLine();
            recordCount++;

            writer.write("105,Amit,Sales,58000");
            writer.newLine();
            recordCount++;

            // ===== Console Report =====
            System.out.println("========================================");
            System.out.println(" EMPLOYEE CSV CREATION REPORT ");
            System.out.println("========================================");
            System.out.println("Output Directory : " + directoryPath);
            System.out.println("File Name        : employees.csv");
            System.out.println("Total Records    : " + recordCount);
            System.out.println("Status           : SUCCESS");
            System.out.println("========================================");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
