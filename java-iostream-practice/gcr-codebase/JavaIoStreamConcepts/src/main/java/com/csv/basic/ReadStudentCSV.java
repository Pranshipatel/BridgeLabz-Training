package com.csv.basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ReadStudentCSV {

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(
                ReadStudentCSV.class.getClassLoader()
                        .getResourceAsStream("docs/csv/students.csv")))) {

            String line;
            boolean isHeader = true;

            // Print table header once
            System.out.println("STUDENT DETAILS");
            System.out.println("========================================");
            System.out.printf("%-6s %-15s %-6s %-6s%n", "ID", "NAME", "AGE", "MARKS");
            System.out.println("----------------------------------------");

            while ((line = br.readLine()) != null) {

                if (isHeader) {
                    isHeader = false;
                    continue;
                }

                String[] data = line.split(",");

                String id = data[0];
                String name = data[1];
                String age = data[2];
                String marks = data[3];

                // Print student data in aligned format
                System.out.printf("%-6s %-15s %-6s %-6s%n",
                        id, name, age, marks);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
