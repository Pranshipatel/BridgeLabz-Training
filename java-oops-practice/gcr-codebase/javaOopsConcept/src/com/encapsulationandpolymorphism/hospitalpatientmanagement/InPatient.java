package com.encapsulationandpolymorphism.hospitalpatientmanagement;

public class InPatient extends Patient {

    private int daysAdmitted;
    private double dailyCharge;

    public InPatient(int id, String name, int age, int days, double dailyCharge) {
        super(id, name, age);
        this.daysAdmitted = days;
        this.dailyCharge = dailyCharge;
    }

    @Override
    public double calculateBill() {
        return daysAdmitted * dailyCharge;
    }
}
