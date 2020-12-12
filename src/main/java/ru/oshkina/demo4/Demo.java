package ru.oshkina.demo4;

public class Demo {
    public static void main(String[] args) {
        Alpha a = new Alpha(10);
        //вызов методов из объекта супер класса
        a.show();
        a.set(20);
        a.show();

        //Создание объекта подкласса
        Bravo b = new Bravo(100, 'B');
        b.show();
        b.set(200, 'Z');
        b.show();
        b.set(300);
        b.show();
    }
}
