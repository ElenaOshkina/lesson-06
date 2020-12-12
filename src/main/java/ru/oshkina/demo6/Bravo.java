package ru.oshkina.demo6;

public class Bravo extends Alpha {
    int code;

    void setCode(int m, int n) {
        super.code = m;
        code = n;
    }

    void show() {
        System.out.println("alpha:" + super.code);
        System.out.println("bravo" + code);
    }
}
