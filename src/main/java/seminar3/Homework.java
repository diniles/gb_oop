package seminar3;

import java.util.ArrayList;
import java.util.List;

public class Homework {
    public static void main(String[] args) {
        Container container1 = new Container();
        container1.addBox(new Box(1));
        container1.addBox(new Box(1));
        container1.addBox(new Box(1));

        System.out.println("Boxes in first container");
        for (Box box : container1) {
            System.out.printf("Box weight is %d\n", box.getWeight());
        }

        Container container2 = new Container();
        container2.addBox(new Box(2));
        container2.addBox(new Box(2));
        container2.addBox(new Box(2));
        container2.addBox(new Box(2));

        System.out.println("Boxes in second container");
        for (Box box : container2) {
            System.out.printf("Box weight is %d\n", box.getWeight());
        }

        System.out.printf("Total weight of boxes in first container is %d\n", container1.getWeight());
        System.out.printf("Total weight of boxes in second container is %d\n", container2.getWeight());

        int compare = container1.compareTo(container2);
        switch (compare) {
            case -1 -> System.out.println("Container 1 is lighter");
            case 1 -> System.out.println("Container 1 is heavier");
            default -> System.out.println("Containers are equal");
        }

        List<Container> containers = new ArrayList<>();
        containers.add(container1);
        containers.add(container2);

        Container container3 = new Container();
        container3.addBox(new Box(1));

        containers.add(container3);

        for (Container container : containers) {
            System.out.printf("Total boxes in container: %d\n", container.getBoxesQuantity());
        }

        System.out.println("Containers sorted");
        containers.sort(new ContainerCountComparator());

        for (Container container : containers) {
            System.out.printf("Total boxes in container: %d\n", container.getBoxesQuantity());

        }

    }
}

