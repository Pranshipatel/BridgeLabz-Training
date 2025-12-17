// program to calculate the profit and loss in number and percentage based on the cost price

public class ProfitAndLoss{
	
	public static void main (String[] args){
		
		// Take the cost price in INR
		double costPrice = 129;
		
		// Take the selling price in INR
		double sellingPrice = 191;
		
		// Print the Selling price in INR
		System.out.println("The Cost Price is INR "+ costPrice + " and Selling Price in INR " + sellingPrice);
		
		// Calculate the profit 
		double profit = sellingPrice - costPrice;
		
		// Calculate the Profit Percentage 
		double profitPercentage = (profit / costPrice) * 100;
		
		// Print the Profit and Profit Percentage
		System.out.println("The Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage);
	}
	
}