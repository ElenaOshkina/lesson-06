package ru.oshkina.demo2;

//Суперкласс с закрытым полем
public class Alpha {

    //Закрытое символьное поле
    private char symbol;

    //Открытый метод для отображения значения поля
    void show() {
        System.out.println("Символ: " + symbol);
    }

    //открытый метод для присваивания значения полю
    void set(char s) {
        symbol = s;
    }
}
