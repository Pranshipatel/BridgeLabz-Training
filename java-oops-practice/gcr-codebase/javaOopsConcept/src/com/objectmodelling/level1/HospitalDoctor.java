package com.objectmodelling.level1;

import java.util.ArrayList;

public class HospitalDoctor {
    private String doctorName;
    private ArrayList<HospitalPatient> patients;

    public HospitalDoctor(String doctorName) {
        this.doctorName = doctorName;
        patients = new ArrayList<>();
    }

    // Communication method
    public void consult(HospitalPatient patient) {
        patients.add(patient);
        patient.addDoctor(this);

        System.out.println(
            "Doctor " + doctorName +
            " is consulting Patient " + patient.getPatientName()
        );
    }

    public String getDoctorName() {
        return doctorName;
    }
}
