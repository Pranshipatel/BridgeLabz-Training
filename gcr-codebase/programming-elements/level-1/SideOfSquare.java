//  program to find the side of the square whose parameter you read from user

import java.util.Scanner;
public class SideOfSquare{
	public static void main(String[] args){
		int perimeter;
		
		// Create Scanner Object to take user input
		Scanner input = new Scanner(System.in);
		
		// Take the perimeter as input
		System.out.println("Enter the perimeter of Square: ");
		perimeter = input.nextInt();
		
		// Calculate the side of square
		int side = perimeter / 4;
		
		// Print the perimeter and length of side
		System.out.println("The length of the side is " + side + " and perimeter is " + perimeter);
	
	}
}
		
		

