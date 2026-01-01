package com.inheritance.basics.animal;

public class AnimalTest {
	public static void main(String[] args) {
		Bird b1 = new Bird("Chiw",2);
		Dog d1 = new Dog("Whiskey",4);
		Cat c1 = new Cat("Kitty",1);
		
		b1.makeSound();
		c1.makeSound();
		d1.makeSound();
	}

}
