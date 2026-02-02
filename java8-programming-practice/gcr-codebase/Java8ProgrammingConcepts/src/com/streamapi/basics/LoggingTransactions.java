package com.streamapi.basics;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class LoggingTransactions {
	public static void main(String[] args) {
		 List<String> transactionIds = Arrays.asList(
	                "TXN1001",
	                "TXN1002",
	                "TXN1003",
	                "TXN1004",
	                "TXN1005",
	                "TXN1006",
	                "TXN1007",
	                "TXN1008",
	                "TXN1009",
	                "TXN1010"
	        );
		 
		 transactionIds.forEach(id -> System.out.println(LocalDateTime.now() + " - Transaction: " + id));

	}

}
