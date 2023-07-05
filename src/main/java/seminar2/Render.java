package seminar2;

public class Render {
    /**
     * Если объект обладает уровнем здоровья, то отображается индикатор с текущим уровнем здоровья.
     * Если объект обладает уровнем магический энергии, то отображается индикатор с текущим уровнем энергии.
     * * В качестве упрощения, пусть вывод на дисплей = запись информации в консоль.
     */
//    public static final String ANSI_RESET = "\u001B[0m";
//    public static final String ANSI_BLACK = "\u001B[30m";
//    public static final String ANSI_RED = "\u001B[31m";
//    public static final String ANSI_GREEN = "\u001B[32m";
//    public static final String ANSI_YELLOW = "\u001B[33m";
//    public static final String ANSI_BLUE = "\u001B[34m";
//    public static final String ANSI_PURPLE = "\u001B[35m";
//    public static final String ANSI_CYAN = "\u001B[36m";
//    public static final String ANSI_WHITE = "\u001B[37m";

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
