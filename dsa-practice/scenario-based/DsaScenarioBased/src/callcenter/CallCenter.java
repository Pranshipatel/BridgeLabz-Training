package callcenter;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class CallCenter {
	Queue<Customer> normalQueue = new LinkedList<>();
	
	PriorityQueue<Customer> vipQueue = new PriorityQueue<>(
			(a,b) -> a.customerId.compareTo(b.customerId)
	);
	
	HashMap<String, Integer> callCountMap = new HashMap<>();
	
	
	// Add incoming call
	public void receiveCall(Customer customer) {
		callCountMap.put(customer.customerId, callCountMap.getOrDefault(customer.customerId, 0)+1);
		
		if(customer.isVIP) {
			vipQueue.offer(customer);
		}else {
			normalQueue.offer(customer);
		}
		
		System.out.println("Call received from : " + customer.name);
	}
	
	// Handle next call
	public void handleCall() {
		Customer customer;
		
		if(!vipQueue.isEmpty()) {
			customer = vipQueue.poll();
		} else if (!normalQueue.isEmpty()) {
			customer = normalQueue.poll();
		} else {
			System.out.println("No calls to handle");
			return;
		}
		
		System.out.println("Handling call from "+ customer.name);
	}
			
	// Display call frequency
	public void showCallstats() {
		System.out.println("\n Customer call frequency");
		for(Map.Entry<String, Integer> entry : callCountMap.entrySet()) {
			System.out.println("Customer Id " + entry.getKey() 
			+ " -> calls : " + entry.getValue());
		}
	}

}
