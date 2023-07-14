package seminar5;

public class Group {
    private static long count = 1;
    private long id;
    private String name;

    public Group(String name) {
        this.id = count + 1;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
