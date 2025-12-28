// Program to design election pooling booth system

import java.util.Scanner;

public class ElectionBooth {
	
	// Method to check eligiblity of voter
	public static boolean canVote(int age) {
		if(age>=18) {
			return true;
			
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);
		int voteCount = 0;
		
		
		while(true) {
			System.out.println("Continue vote = 'c' or end voting 'e'");
			char voting = input.next().charAt(0);
			if(voting == 'e') {
				break;
			}
		
			System.out.println("Enter the age of voter");
			int age = input.nextInt();
			if(canVote(age)) {
				voteCount++;
			}else {
				System.out.println("Not eligible to vote");
			}
			

		}
		System.out.println("The total number of votes eligiblie is " + voteCount);
		
		input.close();
	}

}