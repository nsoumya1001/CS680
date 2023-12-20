package edu.umb.cs680.hw12;

import java.util.List;

public class Car {
    private String make, model;
    private int mileage, year, dominationcount;
    private float price;

    public Car (String make, String model, int year, int mileage, float price){
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

    public void setDominationcount(List<Car> Cars) {
        int dominationCount = 0;
        for (Car car : Cars) {
            if (this.getPrice() >= car.getPrice() && this.getMileage() >= car.getMileage() && this.getYear() <= car.getYear()) {
                if (this.getPrice() > car.getPrice() || this.getMileage() < car.getMileage() || this.getYear() < car.getYear()) {
                    dominationCount++;
                }
            }
        }
        // Assuming DominationCount is an instance variable, update it here
        this.dominationcount = dominationCount;
    }

    public int getDominationcount() {
        return dominationcount;
    }


    public static void main(String[] args) {

    }
}
