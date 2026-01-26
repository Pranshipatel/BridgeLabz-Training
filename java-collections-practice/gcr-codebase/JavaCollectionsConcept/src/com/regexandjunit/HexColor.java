package com.regexandjunit;

import java.util.Scanner;

public class HexColor {

	// Method to validate hex color code
	public static boolean isValidHexColor(String color) {

		// Regex for hex color validation
		String regex = "^#[0-9A-Fa-f]{6}$";

		// Match color with regex
		return color.matches(regex);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Take hex color input
		System.out.print("Enter hex color code: ");
		String color = sc.nextLine();

		// Validate and print result
		if (isValidHexColor(color)) {
			System.out.println("Valid");
		} else {
			System.out.println("Invalid");
		}

		sc.close();
	}
}