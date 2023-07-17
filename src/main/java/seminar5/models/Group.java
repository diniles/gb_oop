package seminar5.models;

public class Group {
    private static long counter = 0;
    private final long id;
    private final String number;

    public Group(String number) {
        this.id = ++counter;
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", name='" + number + '\'' +
                '}';
    }

}
