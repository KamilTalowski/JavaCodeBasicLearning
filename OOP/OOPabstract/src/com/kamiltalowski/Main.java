package com.kamiltalowski;

public class Main {

    public static void main(String[] args) {
	    // abstract = abstract classes cannot be instantiated(created), but they can have subclass
        //           abstract methods are declared without an implementation

        //Vehicle vehicle= new Vehicle(); // cannot be be created
        Car car = new Car();
        car.go();

    }
}
