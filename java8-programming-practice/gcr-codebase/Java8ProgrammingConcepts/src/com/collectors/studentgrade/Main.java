package com.collectors.studentgrade;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		
		 List<Student> students = Arrays.asList(
	                new Student("Pranshi", "A"),
	                new Student("Riya", "B"),
	                new Student("Amit", "A"),
	                new Student("Rahul", "C"),
	                new Student("Neha", "B"),
	                new Student("Kunal", "A"),
	                new Student("Sneha", "C")
	        );
		 
		 Map<String, List<String>> group = students.stream()
				 .collect(
						 Collectors.groupingBy(
						 Student::getGrade , Collectors.mapping(Student::getName, Collectors.toList())));
		 
		 group.forEach((grade , name) -> {
			 System.out.println(grade +  " -> " + name);
		 });
	}

}
