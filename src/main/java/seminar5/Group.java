package seminar5;

import java.util.Objects;
import java.util.UUID;

public class Group {
    private UUID id;
    private String number;

    public Group(String number) {
        this.id = UUID.randomUUID();
        this.number = number;
    }

    public UUID getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return Objects.equals(getId(), group.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", number='" + number + '\'' +
                '}';
    }
}
