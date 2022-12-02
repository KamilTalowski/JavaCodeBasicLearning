package com.kamiltalowski;

public class Main {

    public static void main(String[] args) {
        //Overloaded constructors with different parameters
	    //Pizza pizza = new Pizza("thin crust","tomatoes","mozzarella", "salami");
        //Pizza pizza = new Pizza("thin crust","tomatoes","mozzarella");
        //Pizza pizza = new Pizza("thin crust","tomatoes");
        Pizza pizza = new Pizza("thin crust");

        System.out.println("Here are ingredients of pizza");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);
        System.out.println(pizza.topping);
    }
}
