# Объектно-ориентированное программирование (семинары)

## Урок 3. Некоторые стандартные интерфейсы Java и примеры их использования

Создать класс Контейнер - Container.
В контейнере могут быть ящики (класс Box).

У каждого ящика есть вес.
У каждого контейнера есть метод "получить вес" - это сумма всех весов ящиков, которые находятся в контейнере.

Класс Контейнер должен быть Comparable. Сравнивать он должен по весам контейнера (чем меньше вес, тем меньше контейнер).
Класс ContainerCountComparator - Comparator, который сравнивает контейнеры по количеству ящиков (чем меньше ящиков, тем
меньше контейнер).
Класс контейнер должен быть Iterable - итерирование должно происходить по ящикам внутри контейнера.

        Container c = new Container(...);
        // ...
        for (Box box: c) {
            box - это контейнер
        }