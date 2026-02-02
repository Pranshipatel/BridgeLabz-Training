package com.methodreferences.InvoiceObject;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		List<String> transactionId = Arrays.asList("XXIV", "XXIX");
		
		List<Invoice> invoice = transactionId.stream().map(Invoice::new).collect(Collectors.toList());
		
		invoice.forEach(System.out::println);
		
				
	}

}
