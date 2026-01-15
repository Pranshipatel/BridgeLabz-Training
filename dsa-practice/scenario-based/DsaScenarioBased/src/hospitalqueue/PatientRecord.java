package hospitalqueue;

import java.util.ArrayList;

public class PatientRecord {
	
	ArrayList<PatientData> array = new ArrayList<>();
	
	void addPatient(PatientData p) {
		array.add(p);
		System.out.println(p.name + " Patients data has been added");
	}
	
	void sortPatientCritically() {
		for(int i = 0 ; i < array.size()-1 ; i++) {
			for(int j = 0; j < array.size()-i-1 ; j++) {
				if(array.get(j).criticalLevel > array.get(j+1).criticalLevel) {
					PatientData temp = array.get(j);
					array.set(j,array.get(j+1));
					array.set(j+1, temp);
				}
			}
		}
	}
	
	void displayRecords() {
		System.out.println("-------------------------Patient Records--------------------");
		for(int i = 0 ; i < array.size() ; i++) {
			System.out.println("Name = " + array.get(i).name);
			System.out.println("Age = " + array.get(i).age);
			System.out.println("Critical Level = " + array.get(i).criticalLevel);
			System.out.println("---------------------------------------------------------");
		}
	}

}
