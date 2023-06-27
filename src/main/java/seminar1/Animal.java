package seminar1;

import java.util.ArrayList;
import java.util.Objects;

public class Animal {
    private static int index = 1;
    private static ArrayList<String> names;

    private String name;
    private double age;
    private double weight;
    private int height;


    protected Animal(String name) {
        this(name, 0, 0, 0);
    }

    protected Animal(String name, double age, double weight, int height) {
        if (name.isEmpty() || Character.isDigit(name.charAt(0)) || Animal.names.contains(name)) {
            this.name = String.format("AnimalName_%d", index);
        } else {
            this.name = name;
        }
        Animal.names.add(this.name);
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Double.compare(getAge(), animal.getAge()) == 0 && Double.compare(getWeight(), animal.getWeight()) == 0 && getHeight() == animal.getHeight() && Objects.equals(getName(), animal.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getWeight(), getHeight());
    }
}
