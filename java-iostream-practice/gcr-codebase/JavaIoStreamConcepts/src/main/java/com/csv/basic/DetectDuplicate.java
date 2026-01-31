package com.csv.basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class DetectDuplicate {

    public static void main(String[] args) {

        Set<String> uniqueIds = new HashSet<>();

        try (BufferedReader br = new BufferedReader(new InputStreamReader(
                DetectDuplicate.class.getClassLoader()
                        .getResourceAsStream("docs/csv/employees.csv")))) {

            String line;
            boolean isHeader = true;
            boolean foundDuplicate = false;

            System.out.println("===== DUPLICATE RECORD REPORT =====\n");

            while ((line = br.readLine()) != null) {

                if (isHeader) {
                    isHeader = false;
                    continue;
                }

                String[] data = line.split(",");
                String id = data[0];

                if (!uniqueIds.add(id)) {
                    System.out.println("Duplicate ID Found");
                    System.out.println("ID     : " + id);
                    System.out.println("Record : " + line);
                    System.out.println("----------------------------------");
                    foundDuplicate = true;
                }
            }

            if (!foundDuplicate) {
                System.out.println("No duplicate records found.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
