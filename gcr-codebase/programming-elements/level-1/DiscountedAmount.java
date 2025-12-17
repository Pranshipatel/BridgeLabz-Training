// Program to find the discounted amount and discounted price the student will pay for the course.

public class DiscountedAmount{
	
	public static void main(String[] args){
		
		// Create a variable named fee and assign 125000 to it.
		int fee = 125000;
		
		// Create another variable discountPercent and assign 10 to it.
		int discountPercent = 10;
		
		// Compute discount and assign it to the discount variable.
		int discount = (fee * discountPercent) / 100;
		
		// Computer the fee you have to pay by subtracting the discount from the fee.
		int discountedFee = fee - discount;
		
		// Print the discount amount and final discounted fee
		System.out.print("The discount amount is INR " + discount + " and final discounted fee in INR "+ discountedFee);
		
    }

}

    