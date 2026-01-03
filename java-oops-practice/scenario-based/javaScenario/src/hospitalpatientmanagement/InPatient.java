package hospitalpatientmanagement;

class InPatient extends Patient {
    private int daysAdmitted;

    public InPatient(int patientId, String name, int age, int daysAdmitted) {
        super(patientId, name, age);
        this.daysAdmitted = daysAdmitted;
    }

    @Override
    void displayInfo() {
        System.out.println(getSummary());
        System.out.println("Type: In-Patient");
        System.out.println("Days Admitted: " + daysAdmitted);
    }

    public int getDaysAdmitted() {
        return daysAdmitted;
    }
}
