// Program to find the youngest friends among 3 Amar, Akbar, and Anthony based on their ages and the tallest among the friends based on their heights

import java.util.Scanner;
import java.util.Arrays;

public class YoungestFriend{
	public static void main (String[] args){
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
		
		int youngestFriend = Integer.MAX_VALUE;
		int ageIndex = 0;
		
		int tallestFriend = Integer.MIN_VALUE;
		int heightIndex = 0;
		
		// Loop to check the youngest and tallest friend
		for ( int i = 0; i < 3 ; i++ ){
			
			// find age of youngest
			if(ageOfFriends[i] < youngestFriend ){
				youngestFriend = ageOfFriends[i];
				ageIndex = i;
			}
			
			// find height of tallestFriend
			if(heightOfFriends[i] > tallestFriend){
				tallestFriend = heightOfFriends[i];
				heightIndex = i;
			}
		}
		
		// Print the tallest and youngest
		System.out.println("Youngest age = " + youngestFriend + " at index " + ageIndex);
		System.out.println("Tallest height = " + tallestFriend + " at index " + heightIndex);
		
		input.close();
		
	}
}
		
		