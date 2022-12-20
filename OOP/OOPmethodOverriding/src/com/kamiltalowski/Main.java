package com.kamiltalowski;

public class Main {

    public static void main(String[] args) {
	    //method-overriding = Declaring a method in sub class,
        //                      witch is already present in paren class
        //                      done so that a child class can give its own implementation

        Dog dog= new Dog();
        Animal animal= new Animal();

        animal.speak();
        dog.speak();

    }
}
