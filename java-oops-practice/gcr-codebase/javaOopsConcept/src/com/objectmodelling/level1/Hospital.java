package com.objectmodelling.level1;

import java.util.ArrayList;

public class Hospital {
    private String hospitalName;
    private ArrayList<HospitalDoctor> doctors;
    private ArrayList<HospitalPatient> patients;

    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
        doctors = new ArrayList<>();
        patients = new ArrayList<>();
    }

    public void addDoctor(HospitalDoctor doctor) {
        doctors.add(doctor);
    }

    public void addPatient(HospitalPatient patient) {
        patients.add(patient);
    }

    public void showHospitalDetails() {
        System.out.println("Hospital: " + hospitalName);
    }
}
