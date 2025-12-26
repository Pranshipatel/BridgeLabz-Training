// Program for Date Comparison

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class DateComparator {

    public static void main(String[] args) {
		
        Scanner input = new Scanner(System.in);
        
        DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE;

        System.out.println("Enter the first date in year-mm-day : ");
        String dateInput1 = input.nextLine();

        System.out.println("Enter the second date: ");
        String dateInput2 = input.nextLine();

        try {
            // Parse the input strings into LocalDate objects
            LocalDate date1 = LocalDate.parse(dateInput1, formatter);
            LocalDate date2 = LocalDate.parse(dateInput2, formatter);

            // Compare the two dates
            if (date1.isBefore(date2)) {
                System.out.println("The first date is before the second date.");
            } else if (date1.isAfter(date2)) {
                System.out.println("The first date is after the second date.");
            } else if (date1.isEqual(date2)) {
                System.out.println("The first date is the same as the second date.");
            } else {
                System.out.println("The dates are improper");
            }

        } catch (DateTimeParseException e) {
            System.out.println("Error: Invalid date format.");
        } finally {
            input.close();
        }
    }
}
