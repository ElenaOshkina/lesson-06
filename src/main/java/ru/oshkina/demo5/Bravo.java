package ru.oshkina.demo5;

public class Bravo extends Alpha {
    //символьное поле
    char symbol;

    @Override
    void show() {
        System.out.println("Класс Bravo:");
        System.out.println("Поле number: " + number);
        System.out.println("Поле symbol: " + symbol);
    }

    @Override
    void set() {
        number = 200;
        symbol = 'B';
    }

    void displayParent() {
        super.show();
    }
}
