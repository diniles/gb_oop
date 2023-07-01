package seminar1;

public class Main {

    public static void main(String[] args) {

        Dog firstDog = new Dog("firstDog", 5, 15, 35, "meat", "cocker");
        Cat firstCat = new Cat("firstCat", 2, 6, 22, "meat", "sphinx");
        firstDog.eat();
        firstDog.voice();
        firstDog.sleep();
        firstCat.eat();
        firstCat.voice();
        firstCat.sleep();
    }


}
