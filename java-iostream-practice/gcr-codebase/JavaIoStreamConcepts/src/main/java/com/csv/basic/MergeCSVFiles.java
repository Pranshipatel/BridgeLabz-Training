package com.csv.basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MergeCSVFiles {

    public static void main(String[] args) {

        Map<String, String> studentDetails = new HashMap<>();

        String outputDir = "output";
        String outputFile = outputDir + "/merged_students.csv";

        File dir = new File(outputDir);
        if (!dir.exists()) {
            dir.mkdir();
        }

        // ================= STEP 1: READ students1.csv =================
        try (BufferedReader br1 = new BufferedReader(
                new InputStreamReader(
                        MergeCSVFiles.class.getClassLoader()
                                .getResourceAsStream("docs/csv/students1.csv")))) {

            String line;
            boolean isHeader = true;

            while ((line = br1.readLine()) != null) {
                if (isHeader) {
                    isHeader = false;
                    continue;
                }

                String[] data = line.split("\\t");
                if (data.length < 3) continue;

                String id = data[0].trim();
                String name = data[1].trim();
                String age = data[2].trim();

                studentDetails.put(id, name + "," + age);
            }

        } catch (IOException | NullPointerException e) {
            e.printStackTrace();
        }

        // ================= STEP 2: READ students2.csv & MERGE =================
        try (BufferedReader br2 = new BufferedReader(
                new InputStreamReader(
                        MergeCSVFiles.class.getClassLoader()
                                .getResourceAsStream("docs/csv/students2.csv")));
             BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {

            // Fancy header inside CSV
            bw.write("=====================================");
            bw.newLine();
            bw.write(" MERGED STUDENT DETAILS ");
            bw.newLine();
            bw.write("=====================================");
            bw.newLine();
            bw.write("ID | NAME | AGE | MARKS | GRADE");
            bw.newLine();
            bw.write("-------------------------------------");
            bw.newLine();

            String line;
            boolean isHeader = true;

            while ((line = br2.readLine()) != null) {
                if (isHeader) {
                    isHeader = false;
                    continue;
                }

                String[] data = line.split("\\t");
                if (data.length < 3) continue;

                String id = data[0].trim();
                String marks = data[1].trim();
                String grade = data[2].trim();

                if (studentDetails.containsKey(id)) {
                    String[] details = studentDetails.get(id).split(",");
                    bw.write(id + " | " + details[0] + " | " + details[1]
                            + " | " + marks + " | " + grade);
                    bw.newLine();
                }
            }

            // ===== Console Report =====
            System.out.println("====================================");
            System.out.println(" CSV MERGE REPORT ");
            System.out.println("====================================");
            System.out.println("Input File 1 : students1.csv");
            System.out.println("Input File 2 : students2.csv");
            System.out.println("Output File  : " + outputFile);
            System.out.println("Status       : SUCCESS");
            System.out.println("====================================");

        } catch (IOException | NullPointerException e) {
            e.printStackTrace();
        }
    }
}
