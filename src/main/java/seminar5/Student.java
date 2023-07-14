package seminar5;

public class Student {
    private static long count = 1;
    private long id;
    private String name;
    private long groupId;

    public Student(String name) {
        this.id = count + 1;
        this.name = name;
        this.groupId = 0;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public long getGroupId() {
        return groupId;
    }

    public void setGroupId(long groupId) {
        this.groupId = groupId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", groupId=" + groupId +
                '}';
    }
}
