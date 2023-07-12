package seminar5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Processor {
    private List<Group> groups;
    private List<Student> students;
    private List<Lesson> lessons;

    public Processor() {
        this.groups = new ArrayList<>();
        this.students = new ArrayList<>();
        this.lessons = new ArrayList<>();
    }

    public void createGroup(String number) {
        Group group = new Group(number);
        groups.add(group);
        System.out.println("Group successfully created.");
    }

    public List<Group> getAllGroups() {
        return groups;
    }

    public void createStudent(String name, Group group) {
        Student student = new Student(name, group);
        students.add(student);
        System.out.println("Student successfully created.");
    }

    public List<Student> getStudentsByGroup(Group group) {
        List<Student> result = new ArrayList<>();
        for (Student student : students) {
            if (student.getGroup().equals(group)) {
                result.add(student);
            }
        }
        return result;
    }

    public void createLesson(Group group, LocalDate date) {

    }
}
