package ru.oshkina.demo9;

public class Bravo extends Alpha {
    int num;



    void set(char s, int n) {
        System.out.println("Я работаю!");
        symb = s;
        num = 99;
    }

    @Override
    void show() {
        System.out.println("класс  bravo");
        System.out.println("символ:" + symb);
        System.out.println("число:" + num);
    }
}
