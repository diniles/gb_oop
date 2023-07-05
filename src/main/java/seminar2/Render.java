package seminar2;

public class Render {
    /**
     * Если объект обладает уровнем здоровья, то отображается индикатор с текущим уровнем здоровья.
     * Если объект обладает уровнем магический энергии, то отображается индикатор с текущим уровнем энергии.
     * * В качестве упрощения, пусть вывод на дисплей = запись информации в консоль.
     */

    private int total;
    private int current;

    public void showIndicator(Object object) {
        // Не должно быть упоминания конкретных классов!!!
        // В консоли должно быть примерно так: Текущий уровень здоровья: 50,
        // максимальный уровень здоровья: 100

        if (object instanceof Health h) {
            total = h.getHealthMax();
            current = h.getHealth();
            System.out.print("Health: ");
            System.out.println(this);
        }
        if (object instanceof Mana m) {
            total = m.getManaMax();
            current = m.getMana();
            System.out.print("Mana: ");
            System.out.println(this);
        }

    }

    @Override
    public String toString() {
        return "Total = " + total + ", current = " + current;
    }
}
