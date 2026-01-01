package com.inheritance.basics.animal;

class Cat extends Animal {
	
	public Cat(String name, int age) {
		super(name,age);
	}
	
	public void makeSound() {
		System.out.println(name + " says : meow meow");
	}

}
