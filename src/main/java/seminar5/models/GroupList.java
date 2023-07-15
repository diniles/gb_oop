package seminar5.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GroupList {
    private List<Group> groups = new ArrayList<>();

    public Group createGroup(String number) {
        if (getByNumber(number) != null) {
            Group group = new Group(number);
            this.groups.add(group);
            return group;
        } else {
            throw new IllegalArgumentException("This number already exist!");
        }
    }

    public void deleteGroup(Long number) {
        this.groups.removeIf(group -> Objects.equals(group.getNumber(), number));
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
