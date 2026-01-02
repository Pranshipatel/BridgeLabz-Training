package com.inheritance.hierarchical.schoolsystem;

public class SchoolTest {
    public static void main(String[] args) {

        Teacher t = new Teacher("Mr. Sharma", 40, "Mathematics");
        Student s = new Student("Riya", 15, "10th Grade");
        Staff st = new Staff("Anil", 35, "Administration");

        t.showDetails();
        t.displayRole();

        System.out.println();

        s.showDetails();
        s.displayRole();

        System.out.println();

        st.showDetails();
        st.displayRole();
    }
}
