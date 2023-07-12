package seminar5;

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

}
