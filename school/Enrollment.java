import java.time.LocalDateTime;

class Main {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        Student student = new Student();
        student.setStudent("s001", "John Doe", "john", "1234", now);

        Course course = new Course();
        course.setCourse("c001", "Intro to Programming", 3);

        Enrollment enrollment = new Enrollment();
        enrollment.showEnrollment(student, course, now);
  }
}

public class Enrollment {
    public Student student;
    public Course course;
    public LocalDateTime enrolled_date;

    public void showEnrollment(Student student, Course course, LocalDateTime enrolled_date) {
        System.out.println("Enrollment");
        System.out.println("student: " + student);
        System.out.println("course: " + course);
        System.out.println("enrolled date: " + enrolled_date);
    }
}
