package seminar5;

import java.util.List;

public class GroupView {
    public static void displayGroups(List<Group> groups) {
        System.out.println("List of groups:");
        for (Group group : groups) {
            System.out.printf("ID: %s, Number: %s", group.getId(), group.getNumber());
        }
        System.out.println();
    }
}
