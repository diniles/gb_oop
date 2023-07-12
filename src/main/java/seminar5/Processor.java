package seminar5;

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
        System.out.println("Group succefully created.");
    }

    public List<Group> getAllGroups() {
        return groups;
    }

    public void createStudent(String name, Group group) {
        Student student = new Student(name, group);
    }
}
