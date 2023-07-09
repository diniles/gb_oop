package seminar3;

import java.util.Comparator;

public class ContainerCountComparator implements Comparator<Container> {
    @Override
    public int compare(Container container1, Container container2) {
        int count1 = container1.getBoxesQuantity();
        int count2 = container2.getBoxesQuantity();
        return Integer.compare(count1, count2);
    }
}
