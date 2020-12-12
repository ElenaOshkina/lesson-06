package ru.oshkina.demo4;

public class Alpha {
    private int number;

    void show() {
        System.out.println("Поле number:" + number);
    }

    void set(int n) {
        number = n;
    }

    Alpha(int n) {
        set(n);
    }
}
