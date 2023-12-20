package edu.umb.cs680.hw11;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static edu.umb.cs680.hw11.Normalization.generateCars;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CosineTest {



    protected static List<List<Double>> cars= new LinkedList<> ();


    @BeforeAll
    public static void setUp() {
        List<Car> generatedCars = generateCars(1100);
        Normalization normalization = new Normalization();
        cars = normalization.NormalizeCars(generatedCars.toArray(new Car[0]));
    }




    @Test
    public void CosineDistanceTest () {
        Cosine cosine = new Cosine ();
        double expected =0.21639907088189148;
        double cosinedistance = cosine.distance (cars.get (3), cars.get (10));
        assertEquals (expected, cosinedistance);
    }


    @Test
    public void MatrixSizeTest(){
        Cosine cosine = new Cosine ();
        List<List<Double>> cosineMatrix = Distance.matrix( cars, cosine);
        assertEquals (1100,cosineMatrix.size ());

    }

}
