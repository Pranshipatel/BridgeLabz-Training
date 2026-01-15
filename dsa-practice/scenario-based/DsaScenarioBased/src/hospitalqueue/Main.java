package hospitalqueue;

public class Main {
	public static void main(String[] args) {
		PatientData p1  = new PatientData("Pranshi", 21, 3);
		PatientData p2  = new PatientData("Aarav", 30, 5);
		PatientData p3  = new PatientData("Riya", 25, 2);
		PatientData p4  = new PatientData("Karan", 40, 7);
		PatientData p5  = new PatientData("Neha", 28, 4);
		PatientData p6  = new PatientData("Rahul", 35, 6);
		PatientData p7  = new PatientData("Ananya", 22, 1);
		PatientData p8  = new PatientData("Vikram", 45, 9);
		PatientData p9  = new PatientData("Pooja", 27, 3);
		PatientData p10 = new PatientData("Suresh", 50, 10);
		PatientData p11 = new PatientData("Meera", 33, 5);

		PatientRecord pr = new PatientRecord();
		pr.addPatient(p1);
		pr.addPatient(p2);
		pr.addPatient(p3);
		pr.addPatient(p4);
		pr.addPatient(p5);
		pr.addPatient(p6);
		pr.addPatient(p7);
		pr.addPatient(p8);
		pr.addPatient(p9);
		pr.addPatient(p10);
		pr.addPatient(p11);
		
		pr.sortPatientCritically();
		pr.displayRecords();
	}
	

}
