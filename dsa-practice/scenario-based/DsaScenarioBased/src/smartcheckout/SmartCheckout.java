package smartcheckout;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class SmartCheckout {
	Queue<Customer> queue = new LinkedList<>();
	HashMap<String, Integer> priceItem = new HashMap<>();
	HashMap<String, Integer> stockItem = new HashMap<>();
	
	void addCustomer(Customer c) {
		queue.add(c);
		System.out.println("Customer add to Queue");
	}
	
	void processCustomer() {
		if(queue.isEmpty()) {
			System.out.println("No Customer is here");
			return;
		}
		
		Customer c = queue.poll();
		int total = 0;
		
		for(String item : c.item) {
			if(stockItem.get(item) > 0) {
				total += priceItem.get(item);
				stockItem.put(item, stockItem.get(item)-1);
			} else {
				System.out.println("Sorry, Item out of stock");
			}
		}
		
		
		System.out.println(c.name + " billed Rs " + total);
		
		
	 }
	
	void addItem(String item, int price, int stock) {
		priceItem.put(item, price);
		stockItem.put(item, stock);
	}

}
