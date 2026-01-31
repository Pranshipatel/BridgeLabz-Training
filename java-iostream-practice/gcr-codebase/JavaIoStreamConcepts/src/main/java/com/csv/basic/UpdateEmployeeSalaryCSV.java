package com.csv.basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;

public class UpdateEmployeeSalaryCSV {

    public static void main(String[] args) {

        String outputDir = "output";
        String outputFile = outputDir + "/updated_employees.csv";

        File dir = new File(outputDir);
        if (!dir.exists()) {
            dir.mkdir();
        }

        try (BufferedReader br = new BufferedReader(new InputStreamReader(
                UpdateEmployeeSalaryCSV.class.getClassLoader()
                        .getResourceAsStream("docs/csv/employees.csv")));
             BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            boolean isHeader = true;
            int updatedCount = 0;

            // Write new header format
            bw.write("ID,Name,Department,UpdatedSalary");
            bw.newLine();

            while ((line = br.readLine()) != null) {

                if (isHeader) {
                    isHeader = false;
                    continue; // skip old header
                }

                String[] data = line.split(",");

                String department = data[2];
                double salary = Double.parseDouble(data[3]);

                if (department.equalsIgnoreCase("IT")) {
                    salary = salary + (salary * 0.10);
                    updatedCount++;
                }

                bw.write(data[0] + "," + data[1] + "," + department + "," + (int) salary);
                bw.newLine();
            }

            // ===== Console Report =====
            System.out.println("========================================");
            System.out.println(" EMPLOYEE SALARY UPDATE REPORT ");
            System.out.println("========================================");
            System.out.println("Source File  : employees.csv");
            System.out.println("Output File  : " + outputFile);
            System.out.println("Rule Applied : +10% salary for IT department");
            System.out.println("Employees Updated : " + updatedCount);
            System.out.println("Status       : SUCCESS");
            System.out.println("========================================");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
