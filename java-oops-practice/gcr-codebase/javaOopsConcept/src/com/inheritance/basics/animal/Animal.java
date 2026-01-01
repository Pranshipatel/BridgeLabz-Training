package com.inheritance.basics.animal;

public class Animal {
	String name;
	int age;
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void makeSound() {
		System.out.println("Animal makes sound");
	}

}
