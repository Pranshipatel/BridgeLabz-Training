package com.lambda.notificationfiltering;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
	public static void main(String[] args) {
		List<Alert> alerts = Arrays.asList(
		   new Alert("Patient heart rate critical", "EMERGENCY"),
	       new Alert("Take blood pressure medicine", "MEDICINE"),
	       new Alert("Appointment scheduled tomorrow", "GENERAL")
	
	     );
		
		  Predicate<Alert> emergencyOnly =
	                alert -> alert.type.equals("EMERGENCY");

	      System.out.println("Filtered Alerts:");

	      alerts.stream().filter(emergencyOnly)  
	                      .forEach(System.out::println);
	}

}
