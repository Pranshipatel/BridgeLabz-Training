// Program to input the unit price of an item and the quantity to be bought

import java.util.Scanner;
public class PriceOfItem{
	public static void main(String[] args){
		int unitPrice;
		int quantity;
		
		//Create Scanner Object to take user input
		Scanner input = new Scanner(System.in);
		
		// Take unitPrice and quantity as input
		System.out.println("Enter unit price: ");
		unitPrice = input.nextInt();
		System.out.println("Enter quantity: ");
		quantity = input.nextInt();
		
		// Calculate total price
		int totalPrice = unitPrice * quantity;
		
		// Print total purchase price in INR, quantity of item and unit price
		System.out.println("The total purchase price is INR " + totalPrice + " if the quantity " 
		                    + quantity + "  and unit price is INR " + unitPrice);
							
	}
}
