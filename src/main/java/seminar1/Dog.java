package seminar1;

import javax.sound.midi.Soundbank;

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
        System.out.printf("Dog %s breed is Barking! Bark! Bark!. \n", breed);
    }

    @Override
    public void eat() {
        System.out.printf("Dog %s breed is eating %s. \n", breed, getFood());
    }

    @Override
    public void sleep() {
        System.out.printf("Dog %s breed is sleeping. Hrrrr.... Hr....\n", breed, getFood());
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
