package com.encapsulationandpolymorphism.hospitalpatientmanagement;

public class HospitalService {

    public static void generateBill(Patient patient) {
        patient.getPatientDetails();
        System.out.println("Total Bill: ₹" + patient.calculateBill());
        System.out.println("----------------------------------");
    }
}
