package com.collectors.sumorders;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		List<Order> orders = Arrays.asList(
                new Order("Pranshi", 1200.50),
                new Order("Riya", 800.00),
                new Order("Pranshi", 450.75),
                new Order("Amit", 2200.00),
                new Order("Riya", 1200.25),
                new Order("Amit", 300.50)
        );
		
		Map<String , Double> total = orders.stream()
				.collect(Collectors.groupingBy(
						Order :: getCustomerName , Collectors.summingDouble(Order :: getOrderAmount)
						));
		
		total.forEach((name, amount)->{
			System.out.println(name + " -> " + amount);
		});
	}

}
