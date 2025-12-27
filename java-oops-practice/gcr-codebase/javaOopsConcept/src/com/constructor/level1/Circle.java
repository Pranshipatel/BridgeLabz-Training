// Write a Circle class with a radius attribute. Use constructor chaining to initialize radius with default and user-provided values.

package com.constructor.level1;

public class Circle {
	// Attribute
	int radius;
	
	Circle(){
		this(2);  // Constructor Chaining
	}
	
	Circle(int radius){
		this.radius = radius;
	}
	
	public static void main(String[] args) {
		Circle c = new Circle();
		Circle c2 = new Circle(5);
		
		System.out.println("Radius of circle is : " + c.radius);
		System.out.println("Radius of circle 2 is : " + c2.radius);
	}
}