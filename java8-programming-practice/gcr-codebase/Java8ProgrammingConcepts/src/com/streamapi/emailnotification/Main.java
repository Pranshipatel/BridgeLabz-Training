package com.streamapi.emailnotification;

import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		 List<User> users = Arrays.asList(
	                new User("Pranshi", "pranshi.patel@gmail.com"),
	                new User("Riya", "riya.sharma@yahoo.com"),
	                new User("Amit", "amit.verma@outlook.com"),
	                new User("Rahul", "rahul.kumar@gmail.com"),
	                new User("Neha", "neha.singh@rediffmail.com"),
	                new User("Kunal", "kunal.mehta@gmail.com"),
	                new User("Sneha", "sneha.joshi@yahoo.com"),
	                new User("Vikram", "vikram.agarwal@outlook.com")
	        );
		 
		 users.forEach((user) -> sendNotification(user.getEmail(), user.getName()));

	}

	public static void sendNotification(String email, String name) {
		System.out.println(name +" ->  " + email + " got the notification " );
	}

}
