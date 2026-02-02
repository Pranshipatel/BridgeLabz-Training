package com.methodreferences.hospitalpatient;

import java.util.Arrays;
import java.util.List;

import com.lambda.customsorting.Product;

public class Main {
	public static void main(String[] args) {
		List<Patients> patient = Arrays.asList(
	            new Patients("Pranshi", 1),
	            new Patients("Vasu", 2),
	            new Patients("Ayush", 3)
	    );		
		
		patient.forEach(Patients:: patientID);
	}

}
