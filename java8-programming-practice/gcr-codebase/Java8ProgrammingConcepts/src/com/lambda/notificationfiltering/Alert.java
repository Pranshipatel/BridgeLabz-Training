package com.lambda.notificationfiltering;

public class Alert {
	String message;
	String type;
	
	public Alert(String message, String type) {
		super();
		this.message = message;
		this.type = type;
	}
	
	public String toString() {
	    return type + " Alert: " + message;
	}

}
