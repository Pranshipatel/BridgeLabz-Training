package hospitalpatientmanagement;

abstract class Patient {
    private int patientId;
    private String name;
    private int age;
    private String medicalHistory; // sensitive data

    // Normal admission constructor
    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.medicalHistory = "Not Disclosed";
    }

    // Emergency admission constructor (Overloaded)
    public Patient(int patientId, String name, int age, String medicalHistory) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.medicalHistory = medicalHistory;
    }

    // Encapsulation via getters
    public int getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public String getSummary() {
        return "Patient ID: " + patientId +
               ", Name: " + name +
               ", Age: " + age;
    }

    // Polymorphism
    abstract void displayInfo();
}
