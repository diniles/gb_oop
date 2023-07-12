package seminar4;

import java.util.ArrayList;
import java.util.List;

// FIXME: 06.07.2023 Добавить нужный дженерик.
public class Box<T extends Fruit> {
    // FIXME: 06.07.2023 Реализовать методы согласно заданию.

    private int weight;
    List<T> box;

    public Box() {
        this.box = new ArrayList<>();
    }

    public void add(T fruit) {
        this.box.add(fruit);
    }

    public int getWeight() {
        for (T fruit : this.box) {
            this.weight += fruit.getWeight();
        }
        return this.weight;
    }

    public void moveTo(Box<? super T> newBox) {
        for (T fruit : this.box) {
            newBox.add(fruit);
        }
        this.box.clear();
        this.weight = 0;
    }
}
