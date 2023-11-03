package edu.umb.cs680.hw03;

public class Car {
    private String make, model;
    private int mileage, year;
    private float price;

    public Car(String make,String model,int year,int mileage,float price){
        this.make=make;
        this.model=model;
        this.year=year;
        this.mileage=mileage;
        this.price=price;
    }

    public float getPrice() {
        return price;
    }

    public int getMileage() {
        return mileage;
    }

    public String getMake() {
        return make;
    }

    public int getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }

    public static void main(String[] args) {
       System.out.println("Main method is executed");
    }
}
