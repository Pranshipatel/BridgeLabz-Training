// Program to print date

import java.util.Scanner;
import java.time.*;

public class ArithmeticDate{
	public static void main(String[] args){
		
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);
		
		// Take date as input
		System.out.println("Enter the date");
		String inputDate = input.nextLine();
		
		LocalDate getParseDate = LocalDate.parse(inputDate);
		
		LocalDate plusDate = getParseDate.plusDays(7).plusMonths(1).plusYears(2);
		
		LocalDate finalOutput = plusDate.minusWeeks(3);
		
		// Print the final date
		System.out.println("The final output is = " + finalOutput);
		
	}
}
		