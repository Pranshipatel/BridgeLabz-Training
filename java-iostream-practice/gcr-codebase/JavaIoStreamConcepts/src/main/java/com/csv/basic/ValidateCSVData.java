package com.csv.basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class ValidateCSVData {

    private static final String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
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

            System.out.println("========================================");
            System.out.println(" CSV DATA VALIDATION REPORT ");
            System.out.println("========================================");

            while ((line = br.readLine()) != null) {

                if (isHeader) {
                    isHeader = false;
                    continue;
                }

                rowNumber++;

                String[] data = line.split("\\t");

                if (data.length < 4) {
                    System.out.println("Row Number : " + rowNumber);
                    System.out.println("Status     : MALFORMED");
                    System.out.println("Raw Data   : " + line);
                    System.out.println("----------------------------------------");
                    continue;
                }

                String email = data[2].trim();
                String phone = data[3].trim();

                boolean isValid = true;

                StringBuilder errorMsg = new StringBuilder();

                if (!emailPattern.matcher(email).matches()) {
                    errorMsg.append(" - Invalid Email       : ").append(email).append("\n");
                    isValid = false;
                }

                if (!phonePattern.matcher(phone).matches()) {
                    errorMsg.append(" - Invalid Phone       : ").append(phone).append("\n");
                    isValid = false;
                }

                if (!isValid) {
                    System.out.println("Row Number : " + rowNumber);
                    System.out.println("Status     : INVALID");
                    System.out.print("Errors     :\n" + errorMsg);
                    System.out.println("Raw Data   : " + line);
                    System.out.println("----------------------------------------");
                }
            }

        } catch (IOException | NullPointerException e) {
            e.printStackTrace();
        }
    }
}
