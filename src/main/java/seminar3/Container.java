package seminar3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Container implements Comparable<Container>, Iterable<Box> {
    private List<Box> boxes;
    private String name;

    public Container() {
        boxes = new ArrayList<Box>();
        this.name = name;
    }

    public void addBox(Box box) {
        boxes.add(box);
    }

    public int getWeight() {
        int totalWeight = 0;
        for (Box box : boxes) {
            totalWeight += box.getWeight();
        }
        return totalWeight;
    }

    public int getBoxesQuantity() {
        return this.boxes.size();
    }

    @Override
    public int compareTo(Container other) {
        int thisWeight = this.getWeight();
        int otherWeight = other.getWeight();
        if (thisWeight < otherWeight) {
            return -1;
        } else if (thisWeight > otherWeight) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public Iterator<Box> iterator() {
        return boxes.iterator();
    }
    
}

