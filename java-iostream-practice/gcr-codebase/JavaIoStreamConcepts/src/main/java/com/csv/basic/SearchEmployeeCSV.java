package com.csv.basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class SearchEmployeeCSV {

    public static void main(String[] args) {

        String searchName = "Neha";

        try (BufferedReader br = new BufferedReader(new InputStreamReader(
                SearchEmployeeCSV.class.getClassLoader()
                        .getResourceAsStream("docs/csv/employees.csv")))) {

            String line;
            boolean isHeader = true;
            boolean found = false;

            String name = null, department = null, salary = null;

            while ((line = br.readLine()) != null) {

                if (isHeader) {
                    isHeader = false;
                    continue;
                }

                String[] data = line.split(",");

                if (data[1].equalsIgnoreCase(searchName)) {
                    name = data[1];
                    department = data[2];
                    salary = data[3];
                    found = true;
                    break;
                }
            }

            // ===== OUTPUT REPORT =====
            System.out.println("====================================");
            System.out.println(" EMPLOYEE SEARCH RESULT ");
            System.out.println("====================================");

            if (found) {
                System.out.println("Status     : FOUND");
                System.out.println("Name       : " + name);
                System.out.println("Department : " + department);
                System.out.println("Salary     : " + salary);
            } else {
                System.out.println("Status     : NOT FOUND");
                System.out.println("Search Key : " + searchName);
            }

            System.out.println("====================================");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
