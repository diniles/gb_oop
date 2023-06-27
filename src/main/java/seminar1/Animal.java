package seminar1;

import java.util.ArrayList;
import java.util.Objects;

public class Animal {
    private static int index = 1;
    private static ArrayList<String> names = new ArrayList<>();

    private String name;
    private double age;
    private double weight;
    private int height;
    private String food;

    public Animal() {
        this("", 0, 0, 0, "");
    }

    public Animal(String name) {
        this(name, 0, 0, 0, "");
    }

    public Animal(String name, double age, double weight, int height, String food) {
        if (name.isEmpty() || name.isBlank() || Character.isDigit(name.charAt(0)) || Animal.names.contains(name)) {
            this.name = String.format("AnimalName_%d", index);
        } else {
            this.name = name;
        }
        Animal.names.add(this.name);
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.food = food;
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

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void voice() {
        System.out.println("Animal voice");
    }

    public void eat() {
        System.out.println("Animal is eating");
    }

    public void sleep() {
        System.out.println("Animal is sleeping");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                ", food='" + food + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Double.compare(animal.getAge(), getAge()) == 0 &&
                Double.compare(animal.getWeight(), getWeight()) == 0 &&
                getHeight() == animal.getHeight() && Objects.equals(getName(), animal.getName()) &&
                Objects.equals(getFood(), animal.getFood());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getWeight(), getHeight(), getFood());
    }
}
