//Create a Person class with a copy constructor that clones another person's attributes./

package com.constructor.level1;

public class Person {
	// Attributes
	String name;
	int age;
	
	// Parameterized Constructor
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	// Copy Constructor
	Person(Person p){
		this.name = p.name;
		this.age = p.age;
	}
	
	// main method
	public static void main(String[] args) {
		Person p = new Person("Pranshi", 20);
		Person p2 = new Person(p);
		
		System.out.println("The person's name is " + p2.name + " and age is " + p2.age);
		
	}
}
