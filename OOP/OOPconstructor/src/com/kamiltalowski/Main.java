package com.kamiltalowski;

public class Main {

    public static void main(String[] args) {

	Human human1 = new Human("Rick", 65, 70);
	Human human2 = new Human("Morty", 16, 50);

	System.out.println(human1.name);
	System.out.println(human2.name);

	human1.drink();
	human2.eat();


    }
}
