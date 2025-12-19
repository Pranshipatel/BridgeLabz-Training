// Program to create a 2D Array and Copy the 2D Array into a single dimension array

import java.util.Scanner;
import java.util.Arrays;

public class MultiDimensionalArray{
	public static void main(String[] args){
		// Create a Scanner Object
        Scanner input = new Scanner(System.in);
		
		// Take row as input
		System.out.println("Enter the row:");
		int rows = input.nextInt();
		
		// Take coloumn as input
		System.out.println("Enter the coloumn:");
		int coloumn = input.nextInt();
		
		// initializing the 2D array
		int twoDArray[][] = new int[rows][coloumn];
		
		// Taking values from user
        // Input the elements of the 2D Array
        System.out.println("Enter the elements of the 2D Array: ");
		for(int i = 0; i < rows ; i++ ){
			for(int j = 0; j < coloumn ; j++ ){
				twoDArray[i][j] = input.nextInt();
			}
		}
		
		// Display the elements of the 2D Array 
        System.out.println("The elements of the 2D Array are: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < coloumn; j++) {
                System.out.print(twoDArray[i][j] + " ");
            }
            System.out.println();
        }
		
		// Storing the value in 1D array
		int array[] = new int[rows * coloumn];
		int k = 0;
		for(int i = 0; i < rows ; i++ ){
			
			for(int j = 0; j < coloumn ; j++ ){
				array[k] = twoDArray[i][j];
				k++;
			}
			
		}	
		
		// Print the single array
		System.out.println("The elements of 1D array is : " + Arrays.toString(array));

        input.close();
	}
}