package EduMentor;

class Instructor extends User {

    public Instructor(String name, String email, int userId) {
        super(name, email, userId);
    }

    @Override
    void displayRole() {
        System.out.println("Role: Instructor");
    }
}
