// Program to find the bonus of employees based on their years of service.

import java.util.Scanner;
public class BonousOfEmployees{
	public static void main (String[] args){
		int salary;
		int yearOfService;
		
		// Create a Scanner Object
        Scanner input = new Scanner(System.in);
		// Take salary and year as input
		System.out.println("Enter the salary : ");
		salary = input.nextInt();
		System.out.println("Enter the year : ");
		yearOfService = input.nextInt();
		
		// Take bonous amount as 0
		int bonousAmount = 0;
		
		// Calculate the bonous amount 
		if ( yearOfService > 5 ){
			bonousAmount = ( salary * 5 ) / 100;
			
			// Print bonous amount 
			System.out.println("Bonous Amount = " + bonousAmount);
			
		} else {
			System.out.println("Salary Amount = " + salary);
		}
	    
		input.close();
		
	}
}
		
		