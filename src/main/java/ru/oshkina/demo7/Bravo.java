package ru.oshkina.demo7;

public class Bravo extends Alpha {
    int bravo;

    public Bravo(int a, int b) {
        super(a);
        bravo = b;
        System.out.println("Поле bravo: " + bravo);
    }
}
