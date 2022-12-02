package com.kamiltalowski.One;
import com.kamiltalowski.Two.*;

public class A {
    protected String protectedMessage= "this is protected";

    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.publicMessage);
        B b = new B();
        //System.out.println(b.privateMessage);

    }
}
