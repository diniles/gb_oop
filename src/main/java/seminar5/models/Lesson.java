package seminar5.models;

import java.time.LocalDate;

public class Lesson {
    private static long counter = 0;
    private final long id;
    private final LocalDate date;
    private String group;

    public Lesson(String group, LocalDate date) {
        this.id = ++counter;
        this.group = group;
        this.date = date;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Long getId() {
        return id;
    }

    public String getGroup() {
        return this.group;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "id=" + id +
                ", date=" + date +
                ", group='" + group + '\'' +
                '}';
    }
}
