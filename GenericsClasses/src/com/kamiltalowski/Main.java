package com.kamiltalowski;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        //bounded types = you can create the objects of a generic class to have data of specific derived types ex.Number

/*      MyIntegerClass myInt = new MyIntegerClass(1);
        MyDoubleClass myDouble = new MyDoubleClass(3.14);
        MyCharacterClass myChar = new MyCharacterClass('@');
        MyStringClass myString = new MyStringClass("Hello");*/

        MyGenericClass <Integer, Integer> myInt = new MyGenericClass<>(1, 9); //generic class
        MyGenericClass <Double, Double> myDouble = new MyGenericClass<>(3.14, 1.09);
        /*MyGenericClass <Character, Character> myChar = new MyGenericClass<>('@', '!');
        MyGenericClass <String, String> myString = new MyGenericClass<>("Hello", "Value");*/

        /*ArrayList<String> myFriends = new ArrayList<>();*/
        HashMap<Integer, String> users = new HashMap<>();

        System.out.println(myInt.getValue());
        System.out.println(myDouble.getValue());
        /*System.out.println(myChar.getValue());
        System.out.println(myString.getValue());*/

    }
}
