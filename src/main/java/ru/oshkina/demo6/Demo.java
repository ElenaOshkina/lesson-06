package ru.oshkina.demo6;

public class Demo {
    public static void main(String[] args) {
        Bravo obj = new Bravo();
        obj.setCode(100, 200);
        obj.show();
        obj.code = 300;
        obj.show();
    }
}
