package seminar1;

public class Cat extends Animal {

    private String breed;

    public Cat(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    public Cat(String name, double age, double weight, int height, String food, String breed) {
        super(name, age, weight, height, food);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public void voice() {
        System.out.printf("Cat %s breed is Meows! Meow! Meow!. \n", breed);
    }

    @Override
    public void eat() {
        System.out.printf("Cat %s breed is eating %s. \n", breed, getFood());
    }

    @Override
    public void sleep() {
        System.out.printf("Cat %s breed is sleeping. Hums.... Hum....\n", breed, getFood());
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + this.getName() + '\'' +
                ", age=" + this.getAge() +
                ", weight=" + this.getWeight() +
                ", height=" + this.getHeight() +
                ", food='" + this.getFood() +
                ", breed='" + this.breed + '\'' +
                '}';
    }
}
