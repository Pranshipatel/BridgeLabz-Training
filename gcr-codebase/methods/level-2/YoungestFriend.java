// Program to find the youngest friends among 3 Amar, Akbar, and Anthony based on their ages and the tallest among the friends based on their heights

import java.util.Scanner;
import java.util.Arrays;

public class YoungestFriend{
	
	// Method to find the youngest friend
	public static void youngestFriend( int ageOfFriends[] ){
		
		int youngest = Integer.MAX_VALUE;
		int ageIndex = 0;
		
		// Loop to check the youngest and tallest friend
		for ( int i = 0; i < 3 ; i++ ){
			
			// find age of youngest
			if(ageOfFriends[i] < youngest ){
				youngest = ageOfFriends[i];
				ageIndex = i;
			}
			
			
		}
		
		// Print the youngest
		System.out.println("Youngest age = " + youngest + " at index " + ageIndex);
		
	}
	
	// Method to find the tallest friend
	public static void tallestFriend( int heightOfFriends[]){
		
		
		int tallest = Integer.MIN_VALUE;
		int heightIndex = 0;
		
		
		// Loop to check the tallest friend
		for ( int i = 0; i < 3 ; i++ ){
			
			// find height of tallestFriend
			if(heightOfFriends[i] > tallest){
				tallest = heightOfFriends[i];
				heightIndex = i;
			}
			
		}
		
		
		// Print the tallest 
		System.out.println("Tallest height = " + tallest + " at index " + heightIndex);
		
		
	}
	
	
	public static void main (String[] args){
		
		YoungestFriend friend = new YoungestFriend();
		
		// Create a Scanner Object
        Scanner input = new Scanner(System.in);
		
		// Creating array to store ages
		int ageOfFriends[] = new int[3];
		// Creating array to store height
		int heightOfFriends[] = new int[3];
		
		// Loop to take age and height as input
		for( int i = 0; i < 3 ; i++ ){
			System.out.println("Enter age of " + i + "th friend");
			ageOfFriends[i] = input.nextInt();
			System.out.println("Enter height of " + i + "th friend");
			heightOfFriends[i] = input.nextInt();
		}
		
		youngestFriend( ageOfFriends );
		tallestFriend( heightOfFriends );
		
		
		input.close();
		
	}
}
		
		