package seminar1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Animal> animals = new ArrayList<>();
//        Dog oscar=new Dog("Oscar", 12, 15,25,"meat", "cocker");
        animals.add(new Dog("Oscar", 12, 15, 25, "meat", "cocker"));
        animals.add(new Cat("Murka", 3, 5, 20, "milk", "sphinx"));
        animals.add(new Cow("Zorka", 5, 120, 120, "grass", 12));

        for (Animal animal : animals) {
            System.out.println(animal);
            animal.voice();
            animal.eat();
            animal.sleep();
            System.out.println("--------------------");
        }

    }


}
