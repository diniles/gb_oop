package seminar1;

public class Dog extends Animal {

    private String breed;

    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    public Dog(String name, double age, double weight, int height, String food, String breed) {
        super(name, age, weight, height, food);
        this.breed = breed;
    }

    public int getAgeInHumanYears() {
        return (int) (16 * Math.log(this.getAge()) + 31);
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public void voice() {
        System.out.println("Bark! Bark!");
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
