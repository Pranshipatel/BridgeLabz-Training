package EduMentor;

class Learner extends User implements ICertificate {

    private String courseType; 

    public Learner(String name, String email, int userId, String courseType) {
        super(name, email, userId);
        this.courseType = courseType;
    }

    @Override
    public void generateCertificate() {
        if(courseType.equalsIgnoreCase("short")) {
            System.out.println("Short Course Certificate Generated for " + name);
        } else {
            System.out.println("Full-Time Course Certificate Generated for " + name);
        }
    }

    @Override
    void displayRole() {
    	System.out.println("------------------------------------------------");
        System.out.println("Role: Learner");
    }
}
