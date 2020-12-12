package ru.oshkina.demo3;

//Главный клас
public class Demo {
    public static void main(String[] args) {
        System.out.println("Первый объект:");
        Bravo a = new Bravo();
        System.out.println("Второй объект:");
        Bravo b = new Bravo(200, 'B');
    }
}
