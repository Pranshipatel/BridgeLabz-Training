// program to check whether a person can vote, depending on whether his/her age is greater than or equal to 18

import java.util.Scanner;
public class VoteEligibility{
	public static void main(String[] args){
		int age;
		
		// Create a Scanner Object
        Scanner input = new Scanner(System.in);
		// Take age as input
		System.out.println("Enter the age : ");
		age = input.nextInt();
		
		if( age >= 18 ){
			System.out.println("The person's age is " + age + " and can vote");
		} else {
			System.out.println("The person's age is " + age + " and cannot vote");
		}
		
		input.close();
		
	}
}