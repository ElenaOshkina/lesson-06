package ru.oshkina.demo3;
//подкласс
public class Bravo extends Alpha {
    //символьное поле
    char symbol;

    //Метод для отображения значения поля
    void display() {
        System.out.println("Поле symbol:" + symbol);
    }

    //конструктор без аргументов
    Bravo() {
        //вызов конструктора суперкласса
        super();
        //присваивание значения символьному плю
        symbol = 'A';
        //отображение значения символьного поля
        display();
    }


    Bravo(int n, char s) {
        //вызов конструктора суперкласса
        super(n);
        //присваивание значения символьному плю
        symbol = s;
        //отображение значения символьного поля
        display();
    }
}
