package seminar5.models;

public class Student {
    private static long counter = 0;
    private final long id;
    private final String name;
    private String group;

    public Student(String name) {
        this.id = ++counter;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", groupId=" + group +
                '}';
    }
}
