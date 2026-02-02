package com.streamapi.basics;

import java.util.Arrays;
import java.util.List;

public class WelcomeMessage {
	public static void main(String[] args) {
		 List<String> attendees = Arrays.asList(
	                "Pranshi",
	                "Riya",
	                "Amit",
	                "Rahul"
	        );
		 
		 attendees.forEach((attendee) -> System.out.println("Welcome -> " + attendee));
	}

}
