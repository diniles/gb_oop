package seminar5;

import java.util.ArrayList;
import java.util.List;

public class StudentModel {
    private List<Student> students = new ArrayList<>();

    public void create(String name) {
        students.add(new Student(name));
    }

    public List<Student> getAll() {
        return List.copyOf(students);
    }
}
