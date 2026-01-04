package com.encapsulationandpolymorphism.hospitalpatientmanagement;

public class HospitalAppTest {
    public static void main(String[] args) {

        Patient p1 = new InPatient(101, "Pranshi", 22, 5, 2000);
        Patient p2 = new OutPatient(202, "Amit", 30, 800);

        p1.setDiagnosis("Viral Infection");
        p1.addRecord("Admitted on Jan 2");
        p1.addRecord("Given IV fluids");

        p2.setDiagnosis("Fever");
        p2.addRecord("Consultation completed");

        HospitalService.generateBill(p1);
        HospitalService.generateBill(p2);

        p1.viewRecords();
        p2.viewRecords();
    }
}
