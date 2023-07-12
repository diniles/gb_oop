package seminar5;

import java.util.List;

public class LessonView {
    public static void displayLessons(List<Lesson> lessons) {
        System.out.println("List of lessons:");
        for (Lesson lesson : lessons) {
            System.out.printf("ID: %s, Group: %s, Date: %s\n", lesson.getId(), lesson.getGroup().getNumber(), lesson.getDate());
        }
    }
}
