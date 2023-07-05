package seminar2;

public class Render {
    /**
     * Если объект обладает уровнем здоровья, то отображается индикатор с текущим уровнем здоровья.
     * Если объект обладает уровнем магический энергии, то отображается индикатор с текущим уровнем энергии.
     * * В качестве упрощения, пусть вывод на дисплей = запись информации в консоль.
     */

    private int total;
    private int current;
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";

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
        int percent = (int) Math.ceil((double) this.current / this.total * 100);
        String color = percent > 60 ? ANSI_GREEN : percent > 20 ? ANSI_YELLOW : ANSI_RED;
        return String.format("Total = , %d,%s current = %d %s", total, color, current, ANSI_RESET);
    }
}
