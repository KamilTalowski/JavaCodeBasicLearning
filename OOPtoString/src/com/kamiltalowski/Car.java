package com.kamiltalowski;

public class Car {
    String maker="Ford";
    String model="Mustang";
    String color= "red";
    int year =2021;

    @Override
    public String toString(){
        return maker +"\n" + model +"\n"+ color+"\n" + year;
    }


}
