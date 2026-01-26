package com.regexandjunit;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExtractor {

	public static void main(String[] args) {

		String text = "Contact us at support@example.com and info@company.org";

		// Regex pattern for email
		String regex = "[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}";

		// Compile pattern
		Pattern pattern = Pattern.compile(regex);

		// Create matcher
		Matcher matcher = pattern.matcher(text);

		// Find and print all email addresses
		while (matcher.find()) {
			System.out.println(matcher.group());
		}
	}
}