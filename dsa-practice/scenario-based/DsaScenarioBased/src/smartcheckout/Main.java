package smartcheckout;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		 SmartCheckout checkout = new SmartCheckout();

	     checkout.addItem("Milk", 50, 10);
	     checkout.addItem("Bread", 30, 5);
		 Customer c = new Customer("Pranshi", Arrays.asList("Milk", "Bread") ); 
		 
		 checkout.addCustomer(c);
		 checkout.processCustomer();
		
	}

}
