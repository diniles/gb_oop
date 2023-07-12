package seminar5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Processor processor = new Processor();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose action:");
            System.out.println("\t1. Create group");
            System.out.println("\t2. List all groups");
            System.out.println("\t3. Create student in a group");
            System.out.println("\t4. List all students in the group");
            System.out.println("\t5. Create a lesson for the group");
            System.out.println("\t6. List all lessons for the student");
            System.out.println("\t0. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            String groupNumber = "";

            switch (choice) {
                case 1:
                    System.out.println("Enter group number:");
                    groupNumber = scanner.nextLine();
                    processor.createGroup(groupNumber);
                    break;
                case 2:
                    List<Group> groups = processor.getAllGroups();
                    GroupView.displayGroups(groups);
                    break;
                case 3:
                    System.out.println("Enter student name:");
                    String name = scanner.nextLine();
                    System.out.println("Enter group number:");
                    groupNumber = scanner.nextLine();
                    processor.createStudent(name, groupNumber);
                    break;
                case 4:
                    System.out.println("Enter group number:");
                    groupNumber = scanner.nextLine();
                    List<Student> students = processor.getStudentsByGroup(groupNumber);
                    StudentView.displayStudents(students);
                    break;
                case 5:
                    System.out.println("Enter group number:");
                    groupNumber = scanner.nextLine();
                    System.out.println("Enter lesson date (dd-MM-yyyy):");
                    String dateStr = scanner.nextLine();
                    LocalDate date = parseDate(dateStr);
                    processor.createLesson(groupNumber, date);
                    break;
                case 6:
                    System.out.println("Enter student nam:");
                    String studentName = scanner.nextLine();
                    List<Lesson> lessons = processor.getLessonsByStudent(studentName);
                    LessonView.displayLessons(lessons);
                    break;
                case 0:
                    System.out.println("Bye!");
                    return;
                default:
                    System.out.println("Wrong choice. Try again.");
            }
        }
    }

    private static LocalDate parseDate(String dateStr) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy", Locale.getDefault());
        return LocalDate.parse(dateStr, formatter);
    }
}
