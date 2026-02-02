package com.streamapi.basics;

import java.util.Arrays;
import java.util.List;

public class IotCensors {
	public static void main(String[] args) {
		 double threshold = 75.0;
		 
		 List<Double> readings = Arrays.asList(
	                68.5,
	                72.3,
	                75.0,
	                78.6,
	                80.2,
	                74.1,
	                82.9,
	                69.8,
	                76.4
	        );
		 
		 System.out.println("Reading above threshold are : ");
		 
		 readings.forEach((reading) -> {
			if (reading >= threshold) {
				System.out.println(reading);
			}
		 });

	       
	        
	}

}
