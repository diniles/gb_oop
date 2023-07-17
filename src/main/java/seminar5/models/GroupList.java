package seminar5.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GroupList {
    private final List<Group> groups = new ArrayList<>();


    public void createGroup(String number) {
        Group group = new Group(number);
        this.groups.add(group);
    }

    public List<Group> getGroups() {
        return List.copyOf(this.groups);
    }

    public Group getByNumber(String number) {
        return groups.stream()
                .filter(group -> Objects.equals(group.getNumber(), number))
                .findFirst()
                .orElse(null);
    }

}
