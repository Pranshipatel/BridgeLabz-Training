package com.methodreferences.hospitalpatient;

public class Patients {
	String name;
	int id;
	
	
	public Patients(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	public void patientID() {
		System.out.println("Pateint ID " + id);
	}

}
