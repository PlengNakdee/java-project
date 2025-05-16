// class Main {
//         public static void main(String[] args) {
//         Course course = new Course();
//         course.setCourse("c001", "Intro to Programming", 3);
//   }
// }

public class Course {
    public String course_id;
    public String name;
    public Integer credit;

    public void setCourse(String course_id, String name, Integer credit) {
        System.out.println("Course");
        System.out.println("id: " + course_id);
        System.out.println("name: " + name);
        System.out.println("credit: " + credit);
        System.out.println("------------------");
    }
}
