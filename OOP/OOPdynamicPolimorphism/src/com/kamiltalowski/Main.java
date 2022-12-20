package com.kamiltalowski;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // polymorphism = many forms
        //dynamic = after compilation
        //ex. A corvette ia a: corvette, and a car, and a vehicle, and an object
        Scanner scanner = new Scanner(System.in);

        Animal animal;
        System.out.println("What Animal do you want?");
        System.out.println("1= Dog or 2= Cat");
        int choice = scanner.nextInt();
        if(choice==1){
            animal= new Dog();
            animal.speak();
        }else  if(choice==2){
            animal = new Cat();
            animal.speak();
        }else {
            System.out.println("wrong choice");
        }


    }
}
