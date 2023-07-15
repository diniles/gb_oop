package seminar5;

import seminar5.models.Model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Presenter {
    View view;
    Model model;

    public Presenter() {
    }

    public void start() {
        view.menu();
        Scanner scanner = new Scanner(System.in);
        int choice;
        String groupNumber = "";
        long studentId;
        while (true) {
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1 -> {
                    System.out.println("Enter group number:");
                    groupNumber = scanner.nextLine();
                    model.createGroup(groupNumber);
                }
                case 2 -> {
                    System.out.println(model.getGroups());
                }
                case 3 -> {
                    System.out.println("Enter student Id:");
                    studentId = scanner.nextLong();
                    System.out.println("Enter group number:");
                    groupNumber = scanner.nextLine();
                    model.addStudentToGroup(studentId, groupNumber);
                }
                case 4 -> {
                    System.out.println("Enter group number:");
                    groupNumber = scanner.nextLine();
                    System.out.println(model.getStudentsByGroup(groupNumber));
                }
                case 5 -> {
                    System.out.println("Enter group number:");
                    groupNumber = scanner.nextLine();
                    System.out.println("Enter lesson date (dd-MM-yyyy):");
                    String dateStr = scanner.nextLine();
                    LocalDate date = parseDate(dateStr);
                    model.createLesson(groupNumber, date);
                }
                case 6 -> {
                    System.out.println("Enter student ID:");
                    studentId = scanner.nextLong();
                    System.out.println(model.getLessonByStudentId(studentId));
                }
                case 0 -> {
                    System.out.println("Bye!");
                    return;
                }
                default -> System.out.println("Wrong choice. Try again.");
            }
        }
    }

    private static LocalDate parseDate(String dateStr) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy", Locale.getDefault());
        return LocalDate.parse(dateStr, formatter);
    }
}
