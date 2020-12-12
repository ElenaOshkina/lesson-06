package ru.oshkina.demo9;

//Объектная переменная супер класса
public class Alpha {
    char symb;

    void set(char symb) {
        this.symb = symb;
    }

    void show() {
        System.out.println("Класс alpha");
        System.out.println("символ:" + symb);
    }
}
