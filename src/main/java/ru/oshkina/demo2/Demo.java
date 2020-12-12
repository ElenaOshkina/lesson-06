package ru.oshkina.demo2;

//Главный класс
public class Demo {
    public static void main(String[] args) {
        //Объект подкласса
        Bravo b = new Bravo();

        //Вызов унаследованных методов
        b.set('b');
        b.show();
    }
}
