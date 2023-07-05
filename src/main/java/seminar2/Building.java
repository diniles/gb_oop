package seminar2;

public class Building implements Health {

    private final int maxHealthPoint; // максимально количество здоровья
    private int currentHealthPoint; // текущее количество здоровья

    public Building(int maxHealthPoint) {
        this.maxHealthPoint = maxHealthPoint;
        this.currentHealthPoint = maxHealthPoint;
    }

    public void setCurrentHealthPoint(int currentHealthPoint) {
        this.currentHealthPoint = currentHealthPoint;
    }

    // FIXME: 29.06.2023 Дописать нужное

    @Override
    public int getHealth() {
        return this.currentHealthPoint;
    }

    @Override
    public int getHealthMax() {
        return this.maxHealthPoint;
    }
}
