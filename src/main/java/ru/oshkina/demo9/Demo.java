package ru.oshkina.demo9;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLMessage;

public class Demo {
    public static void main(String[] args) {
        Alpha a;
        Bravo b = new Bravo();
        a = b;
        b.set('B', 8);
        b.show();

        a.set('A');
        a.show();

    }

    void showDataLenaMy() {

    }
}
