package seminar5;

import java.time.LocalDate;
import java.util.UUID;

public class Lesson {
    private UUID id;
    private Group group;
    private LocalDate date;

    public Lesson(Group group, LocalDate date) {
        this.id = UUID.randomUUID();
        this.group = group;
        this.date = date;
    }

    public UUID getId() {
        return id;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
