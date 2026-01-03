package hospitalpatientmanagement;

class OutPatient extends Patient {
    private double consultationFee;

    public OutPatient(int patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
    }

    @Override
    void displayInfo() {
        System.out.println(getSummary());
        System.out.println("Type: Out-Patient");
        System.out.println("Consultation Fee: " + consultationFee);
    }

    public double getConsultationFee() {
        return consultationFee;
    }
}
