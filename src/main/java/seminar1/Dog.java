package seminar1;

public class Dog extends Animal {

    private String breed;

    public double ageInHumanYears(double age) {
        return 16 * Math.log(this.getAge() + 31);
    }
}
