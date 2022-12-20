package com.kamiltalowski.Two;
import com.kamiltalowski.One.*;

public class Asub extends A{

    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.defaultMessage);
        Asub asub = new Asub();
        System.out.println(
        asub.protectedMessage
        );

    }
}
