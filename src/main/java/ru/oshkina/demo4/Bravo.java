package ru.oshkina.demo4;

public class Bravo extends Alpha {
    private char symbol;

    void show() {
        super.show();
        System.out.println("Поле symbol:" + symbol);
    }

    void set(int n, char s) {
        set(n);
        symbol = s;
    }

    Bravo(int n, char s) {
        //вызов конструктора суперкласса
        super(n);
        //присваивание значения символьному полю
        symbol = s;
    }
}
