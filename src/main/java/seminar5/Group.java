package seminar5;

import java.util.UUID;

public class Group {
    private UUID id;
    private String name;

    public Group(String name) {
        this.id = UUID.randomUUID();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                '}';
    }
}
