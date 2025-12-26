// Program for date formatting

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatting{
	public static void main(String[] args){
		
		LocalDate today = LocalDate.now();
		
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

        // Print the date
        System.out.println("Current Date in three formats:");
        System.out.println("dd/MM/yyyy:       " + today.format(formatter1));
        System.out.println("yyyy-MM-dd:       " + today.format(formatter2));
        System.out.println("EEE, MMM dd, yyyy: " + today.format(formatter3));
    }
}