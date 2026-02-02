package com.streamapi.basics;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TransformingNames {
	public static void main(String[] args) {
		  List<String> customers = Arrays.asList(
	                "Pranshi",
	                "Riya",
	                "Amit",
	                "Rahul",
	                "Neha",
	                "Kunal",
	                "Sneha",
	                "Vikram",
	                "Anjali",
	                "Arjun"
	        );
		  
		  List<String> sorted = customers.stream()
				  .map(String :: toUpperCase)
				  .sorted()
				  .collect(Collectors.toList());
		  
		  sorted.forEach(System.out::println);

	}

}
