package com.inheritance.hybrid.restaurantmanagement;

//Superclass
public class Person {
 protected String name;
 protected int id;

 Person(String name, int id) {
     this.name = name;
     this.id = id;
 }

 void showDetails() {
     System.out.println("Name: " + name);
     System.out.println("ID: " + id);
 }
}
