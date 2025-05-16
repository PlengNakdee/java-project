import java.time.LocalDateTime;

// class Main {
//     public static void main(String[] args) {
//         LocalDateTime now = LocalDateTime.now();
//         Student student = new Student();
//         student.setStudent("s001", "John Doe", "john", "1234", now);
//   }
// }

public class Student {
    public String student_id;
    public String name;
    public String user_name;
    public String password;
    public LocalDateTime applied_date;

    public void setStudent(String student_id, String name, String user_name, String password, LocalDateTime applied_date) {
        System.out.println("Student");
        System.out.println("id: " + student_id);
        System.out.println("name: " + name);
        System.out.println("user name: " + user_name);
        System.out.println("password: " + password);
        System.out.println("applied: " + applied_date);
        System.out.println("------------------");
    }
}
