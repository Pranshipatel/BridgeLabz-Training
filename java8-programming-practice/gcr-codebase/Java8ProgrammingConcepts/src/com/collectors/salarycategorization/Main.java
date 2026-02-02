package com.collectors.salarycategorization;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		  List<Employee> employees = Arrays.asList(
	                new Employee("Pranshi", "IT", 60000),
	                new Employee("Riya", "HR", 45000),
	                new Employee("Amit", "IT", 70000),
	                new Employee("Rahul", "Finance", 55000),
	                new Employee("Neha", "HR", 50000),
	                new Employee("Kunal", "Finance", 65000)
	        );
		  
		  Map<String , Double> map = employees.stream()
				  .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee:: getSalary)));
		  
		  System.out.println("Department \t Salary");
		  System.out.println("-----------------------------------");
		  map.forEach((department, salary)->{
			  System.out.println(department + "   ->   " + salary);
		  });
	}

}
