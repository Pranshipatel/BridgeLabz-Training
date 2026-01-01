package com.inheritance.basics.animal;

class Dog extends Animal {
	
	public Dog(String name, int age) {
		super(name,age);
	}
	
	public void makeSound() {
		System.out.println(name + " says : Bhow Bhow");
	}

}
