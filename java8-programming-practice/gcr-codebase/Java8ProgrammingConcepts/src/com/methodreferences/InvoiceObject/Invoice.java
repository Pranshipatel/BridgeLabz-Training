package com.methodreferences.InvoiceObject;

public class Invoice {
	String transactionId;

	public Invoice(String transactionId) {
		this.transactionId = transactionId;
	}
	
	 @Override
	    public String toString() {
	        return "Invoice [Transaction ID = " + transactionId + "]";
	    }

}
