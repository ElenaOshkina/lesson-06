package ru.oshkina.demo1;

public class Demo {

    public static void main(String[] args) {

        //Объект суперкласса
        Alpha a = new Alpha();
        System.out.println("Объект А");
        a.number = 100;
        a.show();

        //объект подкласса
        Bravo b = new Bravo();
        System.out.println("Объект B");
        b.number = 200;
        b.value = 300;
        b.show();
        b.display();
        b.sum();
    }
}
