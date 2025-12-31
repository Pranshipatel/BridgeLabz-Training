// Festival Lucky Draw 🎉

import java.util.Scanner;
public class FestivalLuckyDraw{
	public static void main(String[] args){
		
		System.out.println("--------------------------------");
	    System.out.println("       Festival Lucky Draw      ");
	    System.out.println("--------------------------------\n");
		
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);
		int number ;
		
		
		while(true){
			System.out.println("Draw a Random Number");
			number = input.nextInt();
			System.out.println("\n--------------------------------\n");
		
			
			if(number % 3 == 0 && number % 5 == 0){
				System.out.println("Yeaahhhhh! You won a gift");
			} else {
				System.out.println("Oops! wrong number");
			}
			
			input.nextLine();
			System.out.println("For Exiting the game press 'e' and for continuing press 'c'");
			String c = input.nextLine();
			
			if(c.equalsIgnoreCase("e")){
				System.out.println("You have successfully exited game");
				break;
			}
		}
	
	    input.close();
		
	}
}
			