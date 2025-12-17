// Program to Calculate Student Fee and University Discount

import java.util.Scanner;

public class UniversityDiscount{
	
	public static void main(String[] args){
		
		// Create Scanner Object to take user input from Standard Input 
		Scanner input = new Scanner(System.in);

		// Create a variable named Studnet fee and take user input.
		System.out.println("Enter Student Fee : ");
		int studentFee = input.nextInt();
		
		// Create another variable discountPercent and take user input.
		System.out.println("Enter Discount Percentage: ");
		int discountPercent = input.nextInt();
		
		// Compute discount and assign it to the discount variable.
		int discount = (studentFee * discountPercent) / 100;
		
		// Computer the fee you have to pay by subtracting the discount from the fee.
		int discountedFee = studentFee - discount;
		
		// Print the discount amount and final discounted fee
		System.out.print("The discount amount is INR " + discount + " and final discounted fee in INR "+ discountedFee);
		
    }

}