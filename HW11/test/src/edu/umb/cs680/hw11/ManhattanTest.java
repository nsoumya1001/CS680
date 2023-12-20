package edu.umb.cs680.hw11;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static edu.umb.cs680.hw11.Normalization.generateCars;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ManhattanTest {

    static List<List<Double>> cars= new LinkedList<> ();


    @BeforeAll
    public static void setUp() {
        List<Car> generatedCars = generateCars(1100);
        Normalization normalization = new Normalization();
        cars = normalization.NormalizeCars(generatedCars.toArray(new Car[0]));
    }



    @Test
    public void ManhattanDistanceTest () {

        Manhattan man = new Manhattan ();
        double expected =1.2316145752746404;
        double distanceman = man.distance (cars.get (1), cars.get (4));
        assertEquals (expected, distanceman);
    }


    @Test
    public void MatrixSizeTest(){
        Manhattan manhattan = new Manhattan ();
        List<List<Double>> manhattanMatrix = Distance.matrix( cars, manhattan);
        assertEquals (1100,manhattanMatrix.size ());

    }

}
