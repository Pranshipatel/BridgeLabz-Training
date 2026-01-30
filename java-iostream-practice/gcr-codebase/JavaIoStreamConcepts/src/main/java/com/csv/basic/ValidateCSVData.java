package com.csv.basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class ValidateCSVData {

    // Regex for valid email
    private static final String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

    // Regex for exactly 10-digit phone number
    private static final String PHONE_REGEX = "\\d{10}";

    public static void main(String[] args) {

        Pattern emailPattern = Pattern.compile(EMAIL_REGEX);
        Pattern phonePattern = Pattern.compile(PHONE_REGEX);

        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(
                        ValidateCSVData.class.getClassLoader()
                                .getResourceAsStream("docs/csv/users.csv")))) {

            String line;
            boolean isHeader = true;
            int rowNumber = 1;

            while ((line = br.readLine()) != null) {

                // Skip header
                if (isHeader) {
                    isHeader = false;
                    continue;
                }

                rowNumber++;

                // TAB-separated CSV
                String[] data = line.split("\\t");

                // Safety check
                if (data.length < 4) {
                    System.out.println("Malformed Row at " + rowNumber + " → " + line);
                    System.out.println("----------------------------------");
                    continue;
                }

                String email = data[2].trim();
                String phone = data[3].trim();

                boolean isValid = true;

                if (!emailPattern.matcher(email).matches()) {
                    System.out.println("Invalid Email at row " + rowNumber + " → " + email);
                    isValid = false;
                }

                if (!phonePattern.matcher(phone).matches()) {
                    System.out.println("Invalid Phone Number at row " + rowNumber + " → " + phone);
                    isValid = false;
                }

                if (!isValid) {
                    System.out.println("Invalid Row Data: " + line);
                    System.out.println("----------------------------------");
                }
            }

        } catch (IOException | NullPointerException e) {
            e.printStackTrace();
        }
    }
}
