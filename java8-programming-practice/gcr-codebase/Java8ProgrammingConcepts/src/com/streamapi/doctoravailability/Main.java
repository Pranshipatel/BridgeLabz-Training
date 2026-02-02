package com.streamapi.doctoravailability;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		 List<Doctor> doctors = Arrays.asList(
	                new Doctor("Dr. Mehta", "Cardiologist", true),
	                new Doctor("Dr. Sharma", "Dermatologist", false),
	                new Doctor("Dr. Rao", "Orthopedic", true),
	                new Doctor("Dr. Gupta", "Pediatrician", true),
	                new Doctor("Dr. Verma", "Neurologist", false),
	                new Doctor("Dr. Singh", "ENT Specialist", true),
	                new Doctor("Dr. Iyer", "Gynecologist", false),
	                new Doctor("Dr. Khan", "General Physician", true)
	    );
		 
		List<Doctor> availability = doctors.stream()
				.filter(Doctor :: isAvailableOnWeekend)
				.sorted(Comparator.comparing(Doctor::getSpeciality))
				.collect(Collectors.toList());
		
		availability.forEach(System.out :: println);

	}

}
