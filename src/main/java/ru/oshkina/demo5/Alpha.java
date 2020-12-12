package ru.oshkina.demo5;

public class Alpha {
    int number;

    Alpha() {
        set();
    }

    void show() {
        System.out.println("Класс Aplha");
        System.out.println("Поле number: " + number);
    }

    void set() {
        number = 100;
    }

    void display() {
        show(); //версия метода определяется классом объекта, из которого вызывается этот метод
    }

}
