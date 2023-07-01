package seminar1;

import java.util.Objects;

public class Cow extends Animal {

    private int milkProductivity;

    public Cow(String name, double age, double weight, int height, String food, int milkProductivity) {
        super(name, age, weight, height, food);
        this.milkProductivity = milkProductivity;
    }

    public Cow(String name) {
        super(name);
        this.milkProductivity = 12;
    }

    public int getMilkProductivity() {
        return milkProductivity;
    }

    public void setMilkProductivity(int milkProductivity) {
        this.milkProductivity = milkProductivity;
    }

    @Override
    public void voice() {
        System.out.println("Cow says Moooo! Moooo!.");
    }

    @Override
    public void eat() {
        System.out.printf("Cow is eating %s. \n", getFood());
    }

    @Override
    public void sleep() {
        System.out.println("Cow is sleeping. No sounds");
    }

    @Override
    public String toString() {
        return "Cow{" +
                "name='" + this.getName() + '\'' +
                ", age=" + this.getAge() +
                ", weight=" + this.getWeight() +
                ", height=" + this.getHeight() +
                ", food='" + this.getFood() +
                "milkProductivity=" + milkProductivity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cow cow = (Cow) o;
        return getMilkProductivity() == cow.getMilkProductivity();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getMilkProductivity());
    }
}
