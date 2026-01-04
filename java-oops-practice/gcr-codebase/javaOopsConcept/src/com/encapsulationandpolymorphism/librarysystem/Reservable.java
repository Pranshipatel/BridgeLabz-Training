package com.encapsulationandpolymorphism.librarysystem;

public interface Reservable {
    void reserveItem(String borrowerName);
    boolean checkAvailability();
}
