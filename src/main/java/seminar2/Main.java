/**
 * Задание
 * <p>
 * Предположим, вы разрабатываете какую-то компьютерную игру, в которой есть несколько типов объектов (классов):
 * 1. Здание (имеет текущий уровень здоровья)
 * 2. Герой (имеет текущий уровень здоровья и текущий уровень магической энергии)
 * 3. Нейтральный персонаж (имеет текущий уровень здоровья)
 * <p>
 * Также у вас есть класс Render с методом showIndicator, который срабатывает при наведении мышки на объект
 * и работает следующим образом:
 * 1. Если объект обладает уровнем здоровья, то отображается индикатор с текущим уровнем здоровья.
 * 2. Если объект обладает уровнем магический энергии, то отображается индикатор с текущим уровнем энергии.
 * * В качестве упрощения, пусть вывод на дисплей это запись информации в консоль.
 * * То есть вы пишете код, который выводит на консоль информацию.
 * <p>
 * <p>
 * Подсказка: нужно ввести 2 интерфейса: наличие здоровья и наличие магической энергии.
 * В классе Render проверять только на эти интерфейсы и выводить нужную информацию.
 * Необходимо продумать, какие методы должны быть в интерфейсе.
 * <p>
 * ЧТО ДЕЛАТЬ НЕ НУЖНО:
 * Нельзя завязываться на конкретные классы. Предполагается, что таких классов очень много и они постоянно добавляются.
 * <p>
 * * Необязательные задания, которые не относятся к теме, но при сильном желании можно реализовать.
 * * Со звездочкой: реализовать в консоли отображение индикатора.
 * Например, при максимальном уровне здоровья 100 и текущем 40 можно отобразить вот такую ленточку: [xxxx      ]
 * ** С двумя звездочками: раскрасить вывод. Чем меньше здоровья, тем "краснее" цвет индикатора.
 * Для полного здоровья - цвет зеленый.
 */
package seminar2;

public class Main {
    public static void main(String[] args) {
        Render render = new Render();

        Building building = new Building(100);
        building.setCurrentHealthPoint(50);
        Hero hero = new Hero(80, 100);
        hero.setCurrentHealthPoint(50);
        Neutral neutral = new Neutral(20);
        hero.setCurrentHealthPoint(10);


        System.out.println(building.getClass().getSimpleName());
        render.showIndicator(building);
        System.out.println();

        System.out.println(hero.getClass().getSimpleName());
        render.showIndicator(hero);
        hero.setCurrentManaPoint(50);
        hero.setCurrentHealthPoint(0);
        render.showIndicator(hero);
        System.out.println();

        System.out.println(neutral.getClass().getSimpleName());
        render.showIndicator(neutral);
        neutral.setCurrentHealthPoint(10);
        render.showIndicator(neutral);

    }
}




