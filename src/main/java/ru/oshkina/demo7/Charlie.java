package ru.oshkina.demo7;

public class Charlie extends Bravo {
    int charlie;

    public Charlie(int a, int b, int c) {
        super(a, b);
        charlie = c;
        System.out.println("Поле charlie:" + charlie);
    }
}
