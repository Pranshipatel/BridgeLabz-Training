package com.streamapi.doctoravailability;


public class Doctor {

    private String name;
    private String speciality;
    private boolean availableOnWeekend;

    public Doctor(String name, String speciality, boolean availableOnWeekend) {
        this.name = name;
        this.speciality = speciality;
        this.availableOnWeekend = availableOnWeekend;
    }

    public String getName() {
        return name;
    }

    public String getSpeciality() {
        return speciality;
    }

    public boolean isAvailableOnWeekend() {
        return availableOnWeekend;
    }

    @Override
    public String toString() {
        return name + " | " + speciality + " | Weekend Available: " + availableOnWeekend;
    }
}
