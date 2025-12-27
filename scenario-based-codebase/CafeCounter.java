//Write a Java program that asks the user for the coffee type using switch,
//accepts quantity, calculates the total bill using price multiplied by quantity,
//adds GST using arithmetic operators, and continues serving customers using a while loop. 
//The program should stop when the user types “exit”.
 
 import java.util.Scanner;
 
 public class CafeCounter{
	 
	 // method to calculate coffee price
	 public static double computeCoffeePrice(int productPrice, int quantity){
		 int price = productPrice *quantity;
		 double gst = computeGst(price);
		 double finalPrice = gst + price;
		 return finalPrice;
	 }
	 
	 // method to compute gst
	 public static double computeGst(int price){
		 double gst = (price * 18.0) / 100;
		 return gst;
	 }
	 
	 public static void main(String[] args){
		 
		 // Create a Scanner Object
		 Scanner input = new Scanner(System.in);
		 
		 String coffeType;
		 
		 while(true){
			 
			 // Take cofe type as user input
			 System.out.println(
              "Enter coffee type:\n" +
              "Espresso for 150/-\n" +
              "Hot Coffee for 100/-\n" +
              "Cold Coffee for 120/-\n" +
              "Type exit to stop"
             );

			 coffeType = input.nextLine();
			 
			 if(coffeType.equalsIgnoreCase("exit")){
				 System.out.println("This cafe is closed now");
				 break;
			 }
			 
			 int productPrice = 0;
			
			 
			 switch(coffeType){
				 
				 case "Espresso"   : {
					 productPrice = 150;
					 break;
				 }
				 case "Hot Coffee" : {
					 productPrice = 100;
					 break;
				 }
				 case "Cold Coffee": {
					 productPrice = 120;
					 break;
				 }
				 default : productPrice = -1;
			 }
			 
			 if(productPrice == -1){
				 System.out.println("Enter valid coffeee");
			 } else {
				 System.out.println("Enter Quantity:");
				 int quantity = input.nextInt();
				 input.nextLine();
				 
				 // Calling the method to compute the coffee price 
				 double price = computeCoffeePrice(productPrice, quantity);
				 System.out.println("Bill of " + quantity + " " + coffeType + " with gst is : " + price);
			 }
		  }	
		  
		  input.close();
	 }
	 
 }	 
				 
			 