package seminar5.models;

public class Group {
    private static long counter = 1;
    private final long id;
    private final String number;

    public Group(String number) {
        this.id = counter + 1;
        this.number = number;
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
