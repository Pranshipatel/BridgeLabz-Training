package com.streamapi.basics;

import java.util.Arrays;
import java.util.List;

public class StockPrices {
	public static void main(String[] args) {
		 List<Double> stockPrices = Arrays.asList(
	                1520.50,
	                1532.75,
	                1518.20,
	                1540.10,
	                1555.60,
	                1548.90,
	                1562.30,
	                1550.00,
	                1575.80,
	                1580.40
	        );
		 
		 stockPrices.forEach(System.out:: println);
	}

}
