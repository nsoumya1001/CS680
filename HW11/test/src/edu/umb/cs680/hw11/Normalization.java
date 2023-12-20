package edu.umb.cs680.hw11;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Normalization {



    List<Car> carss= generateCars (1100);


    public static List<List<Double>> NormalizeCars(Car... carss) {
        List<List<Double>> carData = new ArrayList<> ();

        double minYear = Double.MAX_VALUE;
        double maxYear = Double.MIN_VALUE;
        double minPrice = Double.MAX_VALUE;
        double maxPrice = Double.MIN_VALUE;
        double minMileage = Double.MAX_VALUE;
        double maxMileage = Double.MIN_VALUE;


        for (Car car : carss) {
            double year = car.getYear();
            double price = car.getPrice();
            double mileage = car.getMileage();

            minYear = Math.min(minYear, year);
            maxYear = Math.max(maxYear, year);
            minPrice = Math.min(minPrice, price);
            maxPrice = Math.max(maxPrice, price);
            minMileage = Math.min(minMileage, mileage);
            maxMileage = Math.max(maxMileage, mileage);
        }

        // Normalize each set of values and add them to the main list containing all normalized values of car objects
        for (Car car : carss) {
            List<Double> normalizedCarValues = List.of(
                    (car.getMileage() - minMileage) / (maxMileage - minMileage),
                    (car.getPrice() - minPrice) / (maxPrice - minPrice),
                    (car.getYear() - minYear) / (maxYear - minYear)
            );
            carData.add(normalizedCarValues);
        }

        return carData;
    }

    private static final Random random = new Random(123); // 123 is an example seed

    private static int getRandomValue(int min, int max) {
        return min + random.nextInt(max - min + 1);
    }


    static List<Car> generateCars (int numberOfCars) {
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < numberOfCars; i++) {
            cars.add(new Car("Make" + i, "Model" + i, getRandomValue(2000, 2023), getRandomValue(15, 35), getRandomValue(15000, 60000)));
        }
        return cars;
    }




}
