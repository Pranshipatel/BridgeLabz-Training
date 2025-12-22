// Program to take user input for the age of all 10 students in a class and check whether the student can vote depending on his/her age is greater or equal to 18

import java.util.Scanner;

public class StudentEligibility{
	public static String[][] twoD(int array[] ){
		String check[][] = new String[array.length][2];
		
		for(int i = 0; i < check.length ; i++ ){
			if(array[i] >= 18 ) {
				check[i][0] = String.valueOf(array[i]);
				check[i][1] = "true";
			} else { 
			    check[i][0] = String.valueOf(array[i]);
			    check[i][1] = "false";
			}
		}
		return check;
	}
	
	public static void main(String[] args){
		
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);
		
		// Initialize 1D array
		int array[] = new int[10];
		
		// Take age as input
		System.out.println("Enter the age in 2digit");
		for(int i = 0; i < array.length ; i++){
			array[i] = input.nextInt();
		}
		
		System.out.println("\nCharacter\tType");
        System.out.println("-----------------------");

        String twoDArray[][] = twoD(array);
		
		// Print the 2D array
		for (int i = 0; i < twoDArray.length ; i++ ){
			System.out.println(twoDArray[i][0] + "\t\t" + twoDArray[i][1]);
	    }
	}
}