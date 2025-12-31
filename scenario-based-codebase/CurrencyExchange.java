// Currency Exchange Kiosk

import java.util.Scanner;
public class CurrencyExchange{
	public static void main(String[] args){
		
		System.out.println("--------------------------------");
	    System.out.println("     Currency Exchange Kiosk    ");
	    System.out.println("--------------------------------\n");
	    
	    // Create a Scanner Object
	    Scanner input = new Scanner(System.in);
		double amount;
		int currency;
		double convertedAmount = 0;
		
		do{
			System.out.println("     Enter the amount in INR     ");
			amount = input.nextDouble();
			System.out.println("--------------------------------");
			System.out.println("\n     Choose the Currency     ");
			System.out.println("     1 => USD");
			System.out.println("     2 => Korean");
			System.out.println("     3 => Euro");
			System.out.println("     4 => Japanese");
			System.out.println("--------------------------------\n");
			currency = input.nextInt();
			
			switch(currency){
				case 1 -> {
					convertedAmount = amount * 0.011;
					System.out.println(amount + "INR to USD is " + convertedAmount + " dollar");
			    }
				case 2 -> {
					convertedAmount = amount * 16.12;
					System.out.println(amount + "INR to Korean won is " + convertedAmount + " won");
			    }
				case 3 -> {
					convertedAmount = amount * 0.0095;
					System.out.println(amount + "INR to Euro is " + convertedAmount + " euro");
				}
				case 4 -> {
					convertedAmount = amount * 1.74;
					System.out.println(amount + "INR to Japanese Yen is " + convertedAmount + " yen");
				}
				default -> System.out.println("     Enter Valid Currency     ");
			}
			
			input.nextLine();
			System.out.println("\nWant to continue Conversion?? \nPress 'y' for YES and 'n' for NO");
			String another = input.nextLine();
			
			if (another.equalsIgnoreCase("n")) {
				System.out.println("\nYou have successfully Exited");
				break;
			}
			
		} while ( true);
		
	
	    input.close();
	}
}
	
	
	
	