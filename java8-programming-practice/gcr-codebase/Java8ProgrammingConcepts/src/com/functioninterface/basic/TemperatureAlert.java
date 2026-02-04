package com.functioninterface.basic;

import java.util.function.Predicate;

public class TemperatureAlert {
	public static void main(String[] args) {
		double threshold = 37.5;
		
		Predicate<Double> isHigh = temp -> temp > threshold;
		
		double[] temperatures = {36.2, 37.8, 38.5, 36.9};
		
		for (double temp : temperatures) {
            if (isHigh.test(temp)) {
                System.out.println("ALERT! High temperature: " + temp);
            } else {
                System.out.println("Temperature normal: " + temp);
            }
        }
	}

}
