// Program to divide N number of chocolates among M children

import java.util.Scanner;
import java.util.Arrays;

public class NumberOfChocolates{
	
	public static int[] findNumberOfChocolates(int chocolatesNumber, int numberOfStudent) {
		
		int quotientAndRemainder[] = new int[2];
		
		// calculate quotient and reminder
		quotientAndRemainder[0] = chocolatesNumber / numberOfStudent; // quotient
		quotientAndRemainder[1] = chocolatesNumber % numberOfStudent;  // reminder
		
		return quotientAndRemainder;
		
	}

	
	public static void main(String[] args){
		
		NumberOfChocolates numberOfChocolates = new NumberOfChocolates();
		
		// Create a Scanner Object
        Scanner input = new Scanner(System.in);
		
		// Take number as input
		System.out.println("Enter the number of chocolates : ");
		int chocolatesNumber = input.nextInt();
		
		// Take divisor as input
		System.out.println("Enter the number of student: ");
		int numberOfStudent = input.nextInt();
		
		// Get the result
		int result[] = numberOfChocolates.findNumberOfChocolates(chocolatesNumber, numberOfStudent);
		
		
		// Print number of chocolates each child gets and number of remaining chocolates
        System.out.println("Number of chocolates each child gets and number of remaining chocolates = "
                           + Arrays.toString(result));
		
		input.close();
		
	}
}