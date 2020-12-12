package ru.oshkina.demo3;


//суперкласс
public class Alpha {
    //целочисленное поле
    int number;

    void show() {
        System.out.println("Поле number:" + number);
    }
    //конструктор без аргументов
    Alpha() {
        //присваиваем значение полю
        number = 100;
        //отображение значения поля
        show();
    }

    // конструктор с целочисленным аргументом
    Alpha(int n) {
        //присваиваем значение полю
        number = n;
        //отображение значения поля
        show();
    }
}
