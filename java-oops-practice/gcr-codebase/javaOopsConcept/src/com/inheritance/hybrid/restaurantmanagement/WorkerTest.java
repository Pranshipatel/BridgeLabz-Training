package com.inheritance.hybrid.restaurantmanagement;

public class WorkerTest {
    public static void main(String[] args) {

        Chef chef = new Chef("Ramesh", 101);
        Waiter waiter = new Waiter("Suresh", 102);

        chef.showDetails();
        chef.performDuties();

        System.out.println();

        waiter.showDetails();
        waiter.performDuties();
    }
}
