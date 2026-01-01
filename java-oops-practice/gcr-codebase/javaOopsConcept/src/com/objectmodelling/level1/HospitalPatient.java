package com.objectmodelling.level1;

import java.util.ArrayList;

public class HospitalPatient {
    private String patientName;
    private ArrayList<HospitalDoctor> doctors;

    public HospitalPatient(String patientName) {
        this.patientName = patientName;
        doctors = new ArrayList<>();
    }

    public void addDoctor(HospitalDoctor doctor) {
        doctors.add(doctor);
    }

    public String getPatientName() {
        return patientName;
    }

    public void showDoctors() {
        System.out.println("Doctors consulted by " + patientName + ":");
        for (HospitalDoctor d : doctors) {
            System.out.println("- " + d.getDoctorName());
        }
    }
}
