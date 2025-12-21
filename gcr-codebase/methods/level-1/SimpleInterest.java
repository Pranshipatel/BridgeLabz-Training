// Program to input the Principal, Rate, and Time values and calculate Simple doubleerest.

import java.util.Scanner;

public class SimpleInterest{
	
	public double calculationOfSimpledoubleerest( double principal, double rate, double time){
		
		double simpledoubleerest = (principal + rate + time ) / 100;
		
		return simpledoubleerest;
		
	}

	
	public static void main (String[] args){
		
		SimpleInterest SI = new SimpleInterest();
		
		// Create Scanner object
        Scanner input = new Scanner(System.in);
		
		// Taking Principal, Rate and Time values as user input
		System.out.println("Enter the Principal");
		double principal = input.nextDouble();
		System.out.println("Enter the Rate");
		double rate = input.nextDouble();
		System.out.println("Enter the Time");
		double time = input.nextDouble();
		
		double result = SI.calculationOfSimpledoubleerest(principal, rate, time);
		
		System.out.println("The Simple Interest is " + result + " for principal " + principal + 
		                    " Rate of Interest " + rate + " and Time " + time);
		
		input.close();
		
	}
}