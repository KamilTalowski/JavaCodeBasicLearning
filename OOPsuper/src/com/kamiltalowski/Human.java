package com.kamiltalowski;

public class Human {
    String name;
    int age;

    Human(String name, int age){
        this.name= name;
        this.age= age;
    }
    public String toString(){
        return this.name+ "\n" +this.age+"\n";
    }
}

