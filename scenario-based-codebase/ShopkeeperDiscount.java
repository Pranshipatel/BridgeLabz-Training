// Program for Shopkeeper’s Discount Dashboard

// Import Scanner object
import java.util.Scanner;

public class ShopkeeperDiscount{
	
	// method to Calculate total price of item
	public static double calculateTotalPrice(int totalItem, Scanner input){
		double price;
		double totalPrice = 0;
		
		for(int i = 1; i <= totalItem ; i++){
			System.out.println("Enter the price of " + i + " item ");
			price = input.nextDouble();
			totalPrice += price;
		}
		return totalPrice;
	}
	
	// Method to Calculate final price
	public static double calculateDiscountedPrice(double totalPrice){
		double discountPercentage = 0;
		
		if(totalPrice < 200 ){
			discountPercentage = 5;
		} else if (totalPrice < 600 ){
			discountPercentage = 10;
		} else{
			discountPercentage = 15;
		}
		
		double discountedPrice = (totalPrice * discountPercentage)/ 100;
		
		return totalPrice - discountedPrice;
	}
	
	public static void main(String[] args){
		
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);
		
		System.out.println("Food item menu---:");
		System.out.println("Idli/Sambhar : 120/- \n Plain Dosa : 100/- \n Rasam Rice : 100/- ");
		
		// Enter the total item 
		System.out.println("Enter total item : ");
		int totalItem = input.nextInt();
		
		double totalPrice = calculateTotalPrice(totalItem, input);
		
		double discountedPrice = calculateDiscountedPrice(totalPrice);
		
		// Print the total price and discounted price
		System.out.println("Total price of " + totalItem + " item is " + totalPrice);
		System.out.println("Discounted Price is = " + discountedPrice);
		
		input.close();
		
	}
}