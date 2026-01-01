package com.inheritance.basics.animal;

class Bird extends Animal {

	public Bird(String name, int age) {
		super(name,age);
	}
	
	public void makeSound() {
		System.out.println(name + " says : Chi chi");
	}
}
