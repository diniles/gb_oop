package seminar5.models;

public class Group {
    private static long count = 1;
    private long id;
    private String number;

    public Group(String number) {
        this.id = count + 1;
        this.number = number;
    }

    public long getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", name='" + number + '\'' +
                '}';
    }
}
