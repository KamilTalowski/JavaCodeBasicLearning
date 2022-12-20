package com.kamiltalowski;

public class Car {
    private String maker;
    private String model;
    private int year;

    Car(String maker, String model, int year){
        this.setMaker(maker);
        this.setModel(model);
        this.setYear(year);
    }
    Car(Car x){
        this.copy(x);
    }
    public String getMaker(){
        return maker;
    }
    public String getModel(){
        return model;
    }
    public int getYear(){
        return year;
    }
    public void setMaker(String maker){
        this.maker=maker;
    }
    public void setModel(String model){
        this.model=model;
    }
    public void setYear(int year){
        this.year=year;
    }
    public void copy(Car x){
        this.setMaker(x.getMaker());
        this.setModel(x.getModel());
        this.setYear(x.getYear());
    }
}
