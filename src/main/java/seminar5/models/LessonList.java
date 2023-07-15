package seminar5.models;

import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.Objects;

public class LessonList {
    private final List<Lesson> lessons = new ArrayList<>();

    public Lesson createLesson(LocalDate date) {
        Lesson newLesson = new Lesson(date);
        this.lessons.add(newLesson);
        return newLesson;
    }

    public Lesson getById(long id) {
        return lessons.stream()
                .filter(lesson -> Objects.equals(lesson.getId(), id))
                .findFirst()
                .orElse(null);
    }

    public List<Lesson> getByGroup(String group) {
        return lessons.stream()
                .filter(lesson -> lesson.getGroup().equals(group))
                .toList();
    }
}
