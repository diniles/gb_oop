package seminar5;

public class StudentView {
    public static void displayStudents(List<Student> students) {
        System.out.println("List of students:");
        for (Student student : students) {
            System.out.printf("ID: %s, Name: %s, Group: %s\n", student.getId(), student.getName(), student.getGroup().getNumber());
        }
        System.out.println();
    }
}
