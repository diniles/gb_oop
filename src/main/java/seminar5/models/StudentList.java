package seminar5.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class StudentList {
    private final List<Student> students = new ArrayList<>();

    public Student add(String name) {
        Student student = new Student(name);
        students.add(student);
        return student;
    }

    public void setGroup(long id, String groupName) {
        Student student = getById(id);
//        if (student != null) {
        student.setGroup(groupName);
//        } else {
//            throw new IllegalArgumentException("Can't find student!");
//        }
    }

    public List<Student> getStudents() {
        return List.copyOf(this.students);
    }

    public Student getById(long id) {
        return students.stream()
                .filter(student -> Objects.equals(student.getId(), id))
                .findFirst()
                .orElse(null);
    }

    public Student getByName(String name) {
        return students.stream()
                .filter(student -> Objects.equals(student.getName(), name))
                .findFirst()
                .orElse(null);
    }

    public List<Student> getByGroup(String group) {
        return students.stream()
                .filter(student -> student.getGroup().equals(group))
                .toList();
    }
}
