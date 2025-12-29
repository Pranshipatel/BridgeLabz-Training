// Phone Recharge Simulator Program

import java.util.Scanner;
public class RechargeSimulator{
	
	 // Jio Plans
    public static void displayPlan1() {
        System.out.println("Jio Offers:");
        System.out.println("₹199 - 28 Days | 1.5GB/day");
        System.out.println("₹299 - 56 Days | 2GB/day");
    }
	
	// Airtel Plans
    public static void displayPlan2() {
        System.out.println("Airtel Offers:");
        System.out.println("₹249 - 28 Days | 1.5GB/day");
        System.out.println("₹349 - 56 Days | 2GB/day");
    }

    // BSNL Plans
    public static void displayPlan3() {
        System.out.println("BSNL Offers:");
        System.out.println("₹199 - 30 Days | 2GB/day");
        System.out.println("₹399 - 60 Days | 3GB/day");
    }
	
	
	public static void main(String[] args){
		
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);
		double balance = 1000;
		
		while(balance != 0){
			System.out.println("---Choose your recharge plan---");
			System.out.println("1 => Jio");
			System.out.println("2 => Airtel");
			System.out.println("3 => Bsnl");
			
			int operator = input.nextInt();
			switch(operator){
				case 1:{
					displayPlan1();
					break;
				}
				case 2:{
					displayPlan2();
					break;
				}
				case 3:{
					displayPlan3();
					break;
				}
				default : System.out.println("Invalid operator!!");
			}
			System.out.println("Choose amount to recharge");
			double amount = input.nextDouble();
			
			if(amount > balance){
				System.out.println("Insufficient balance!!");
				System.out.println("Your current balance is " + balance);
				break;
			}
			
			balance -= amount;
			
			System.out.println("Recharge successful!");
			System.out.println("Your current balance is " + balance);
			
			System.out.println("Enter c to continue and e to exit");
			char c = input.next().charAt(0);
			if(c == 'e'){
				System.out.println("You have successfully exit the plan");
				break;
			}
			
		}
		
		input.close();
    }
}	