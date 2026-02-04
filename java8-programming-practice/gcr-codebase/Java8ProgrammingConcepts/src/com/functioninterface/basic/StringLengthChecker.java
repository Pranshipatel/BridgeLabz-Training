package com.functioninterface.basic;

import java.util.function.Function;

public class StringLengthChecker {
	public static void main(String[] args) {
		int charLimit = 20;

        // Function to calculate string length
        Function<String, Integer> lengthFunction =
                msg -> msg.length();

        // Test messages
        String[] messages = {
                "Hello",
                "Java Functional Interface",
                "Short msg"
        };

        for (String msg : messages) {
            int length = lengthFunction.apply(msg);

            if (length > charLimit) {
                System.out.println("Message exceeds limit (" + length + " chars): " + msg);
            } else {
                System.out.println("Message within limit (" + length + " chars): " + msg);
            }
        }
	}

}
