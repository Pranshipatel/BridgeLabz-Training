package com.csv.basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class FilterStudentsByMarks {

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(
                FilterStudentsByMarks.class.getClassLoader()
                        .getResourceAsStream("docs/csv/studentmarks.csv")))) {

            String line;
            boolean isHeader = true;

            System.out.println("STUDENTS WITH MARKS > 80");
            System.out.println("================================");
            System.out.printf("%-6s %-15s %-6s%n", "ID", "NAME", "MARKS");
            System.out.println("--------------------------------");

            while ((line = br.readLine()) != null) {

                if (isHeader) {
                    isHeader = false;
                    continue;
                }

                String[] data = line.split(",");

                String id = data[0];
                String name = data[1];
                int marks = Integer.parseInt(data[3]);

                if (marks > 80) {
                    System.out.printf("%-6s %-15s %-6d%n", id, name, marks);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
