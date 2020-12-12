package ru.oshkina.demo1;

//Подкласс
public class Bravo extends Alpha {
    //целочисленное поле
    int value;

    //Метод для отображения значения поля
    void display() {
        System.out.println("Поле value:" + value);
    }

    //метод для вычисления суммы полей
    void sum() {
        //Обращение к унаследованному полю:
        System.out.println("Сумма:" + number + value);
    }
}
