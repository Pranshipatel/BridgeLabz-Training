package skillforge;

import java.util.Arrays;


public class SkillForgeApp {

  public static void main(String[] args) {

     
      Instructor instructor = new Instructor("Dr. Sharma", "sharma@skillforge.com");

     
      Student student = new Student("Arif", "arif@student.com");

      // Create Course with custom modules
      Course javaCourse = new Course(
              "Java Programming",
              instructor,
              Arrays.asList("OOP", "Collections", "Streams")
      );

      // Progress & grading using operators
      student.updateProgress(3, javaCourse.getTotalModules());
      student.assignScore(85);

      // Generate certificate
      student.generateCertificate();

    
      javaCourse.addReview("Excellent content");
      System.out.println(javaCourse.getInternalReviews());
  }
}