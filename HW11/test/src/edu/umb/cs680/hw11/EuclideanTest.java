package edu.umb.cs680.hw11;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static edu.umb.cs680.hw11.Normalization.generateCars;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EuclideanTest {

    static List<List<Double>> cars= new LinkedList<> ();


    @BeforeAll
    public static void setUp() {
        List<Car> generatedCars = generateCars(1100);
        Normalization normalization = new Normalization();
        cars = normalization.NormalizeCars(generatedCars.toArray(new Car[0]));
    }

    @Test
    public void EuclideanDistanceTest () {
        Euclidean euclidean = new Euclidean ();
        double expected =1.2387221329268079;
        double euclideandistance = euclidean.distance (cars.get (3), cars.get (10));
        assertEquals (expected, euclideandistance);
    }


    @Test
    public void MatrixSizeTest(){
        Euclidean euclidean = new Euclidean ();
        List<List<Double>> euclideanMatrix = Distance.matrix( cars, euclidean);
        assertEquals (1100,euclideanMatrix.size ());

    }
}
