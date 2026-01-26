package com.reflectionandannotation.annotation.serialization;

public class JsonTest {

	public static void main(String[] args) {

		User user = new User("Pranshi", 22, "secret123");

		String json = JsonSerializer.toJson(user);

		System.out.println(json);
	}
}