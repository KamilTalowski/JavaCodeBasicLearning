package com.kamiltalowski;

public class Main {

    public static void main(String[] args) {
	    // toString() = special method that all object inherit,
        //              that returns a sting that "textually represents" an object.
        //              can be used both implicitly and explicitly

        Car car= new Car();
        /*System.out.println(car.maker);
        System.out.println(car.model);
        System.out.println(car.color);
        System.out.println(car.year);*/

        //explicitly
        //System.out.println(car.toString());
        //implicitly
        System.out.println(car);

    }
}
