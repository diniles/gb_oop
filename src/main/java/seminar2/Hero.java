package seminar2;

public class Hero implements Health, Mana {

    private int maxHealthPoint; // максимально количество здоровья
    private int currentHealthPoint; // текущее количество здоровья

    private int maxManaPoint; // максимально количество магический энергии
    private int currentManaPoint; // текущее количество магический энергии

    public Hero(int maxHealthPoint, int maxManaPoint) {
        this.maxHealthPoint = maxHealthPoint;
        this.maxManaPoint = maxManaPoint;

        this.currentHealthPoint = maxHealthPoint;
        this.currentManaPoint = maxManaPoint;
    }

    public void setCurrentHealthPoint(int currentHealthPoint) {
        this.currentHealthPoint = currentHealthPoint;
    }

    public void setCurrentManaPoint(int currentManaPoint) {
        this.currentManaPoint = currentManaPoint;
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

    @Override
    public int getMana() {
        return this.maxManaPoint;
    }

    @Override
    public int getManaMax() {
        return this.maxManaPoint;
    }
}
