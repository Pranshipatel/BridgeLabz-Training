package com.encapsulationandpolymorphism.hospitalpatientmanagement;

import java.util.ArrayList;
import java.util.List;

public abstract class Patient implements MedicalRecord {

    protected int patientId;
    protected String name;
    protected int age;

    private String diagnosis;                 // sensitive
    private List<String> medicalHistory = new ArrayList<>();

    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    // Concrete method
    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Encapsulation for sensitive data
    protected void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    protected String getDiagnosis() {
        return diagnosis;
    }

    @Override
    public void addRecord(String record) {
        medicalHistory.add(record);
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical History:");
        for (String record : medicalHistory) {
            System.out.println("- " + record);
        }
    }

    // Abstract billing method
    public abstract double calculateBill();
}
