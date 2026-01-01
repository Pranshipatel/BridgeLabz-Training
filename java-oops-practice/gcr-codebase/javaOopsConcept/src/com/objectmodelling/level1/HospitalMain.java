package com.objectmodelling.level1;

public class HospitalMain {
	 public static void main(String[] args) {

	        Hospital hospital = new Hospital("City Hospital");

	        HospitalDoctor d1 = new HospitalDoctor("Dr. Sharma");
	        HospitalDoctor d2 = new HospitalDoctor("Dr. Mehta");

	        HospitalPatient p1 = new HospitalPatient("Pranshi");
	        HospitalPatient p2 = new HospitalPatient("Amit");

	        hospital.addDoctor(d1);
	        hospital.addDoctor(d2);
	        hospital.addPatient(p1);
	        hospital.addPatient(p2);

	        d1.consult(p1);
	        d1.consult(p2);
	        d2.consult(p1);

	        System.out.println();
	        p1.showDoctors();
	    }

}
