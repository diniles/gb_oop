package seminar5.models;

import java.time.LocalDate;
import java.util.List;

public class Model {
    private final GroupList groupList;
    private final StudentList studentList;
    private final LessonList lessonList;

    public Model() {
        this.groupList = new GroupList();
        this.studentList = new StudentList();
        this.lessonList = new LessonList();
    }

    public void createGroup(String number) {
        groupList.createGroup(number);
    }

    public List<Group> getGroups() {
        return this.groupList.getGroups();
    }

    public void createStudent(String name) {
        studentList.add(name);
    }

    public List<Student> getStudents() {
        return this.studentList.getStudents();
    }

    public void addStudentToGroup(long studentId, String groupName) {
        this.studentList.setGroup(studentId, groupName);
    }

    public List<Student> getStudentsByGroup(String group) {
        return this.studentList.getByGroup(group);
    }

    public void createLesson(String groupNumber, LocalDate date) {
        this.lessonList.createLesson(groupNumber, date);
    }

    public List<Lesson> getLessonByStudentId(long id) {
        String group = this.studentList.getById(id).getGroup();
        return this.lessonList.getByGroup(group);
    }
}
