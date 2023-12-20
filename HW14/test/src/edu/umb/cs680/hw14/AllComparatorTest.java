package edu.umb.cs680.hw14;

import edu.umb.cs680.hw14.Car;
import edu.umb.cs680.hw14.AllComparatorTest;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AllComparatorTest {

    public static List<Car> ListOfCars() {

        List<Car> List = new ArrayList<>();

        Car car1 = new Car ("Toyota", "Highlander", 2016, 20, 12000);
        Car car2 = new Car ("Honda", "Accord", 2015, 22, 13000);
        Car car3 = new Car ("Mercedes", "Benz", 2014, 25, 14000);
        Car car4 = new Car ("Chevorlet", "Cruze", 2013, 26, 15000);
        Car car5 = new Car ("BMW", "Series 10", 2012, 29, 16000);

        List.add(car1);
        List.add(car2);
        List.add(car3);
        List.add(car4);
        List.add(car5);
        return List;

    }

    List<Car> Cars= ListOfCars ();


    @Test
    public void PriceComparatorTest(){
        List<String> sortedcar = new ArrayList<> ();
        Collections.sort(Cars, Comparator.comparing((Car car)-> car.getPrice()));
        for(Car car: Cars){
            sortedcar.add(car.getModel());
        }
        String expected="[Highlander, Accord, Benz, Cruze, Series 10]";
        assertTrue(sortedcar.toString().equals(expected));

    }

    @Test
    public void PriceComparatorTest_reversed(){
        List<String> sortedcar = new ArrayList<> ();
        Collections.sort(Cars, Comparator.comparing((Car car)-> car.getPrice()).reversed());
        for(Car car: Cars){
            sortedcar.add(car.getModel());
        }
        String expected="[Series 10, Cruze, Benz, Accord, Highlander]";
        assertTrue(sortedcar.toString().equals(expected));

    }


    @Test
    public void MileageComparatorTest(){
        List<String> sortedcar = new ArrayList<> ();
        Collections.sort(Cars, Comparator.comparing((Car car)-> car.getMileage ()));
        for(Car car: Cars){
            sortedcar.add(car.getModel());
        }
        String expected= "[Highlander, Accord, Benz, Cruze, Series 10]";
        assertEquals(expected,sortedcar.toString());

    }

    @Test
    public void MileageComparatorTest_reversed(){
        List<String> sortedcar = new ArrayList<> ();
        Collections.sort(Cars, Comparator.comparing((Car car)-> car.getMileage ()).reversed());
        for(Car car: Cars){
            sortedcar.add(car.getModel());
        }
        String expected="[Series 10, Cruze, Benz, Accord, Highlander]";
        assertEquals(expected,sortedcar.toString());

    }

    @Test
    public void YearComparatorTest(){
        List<String> sortedcar = new ArrayList<> ();
        Collections.sort(Cars, Comparator.comparing((Car car)-> car.getYear ()));
        for(Car car: Cars){
            sortedcar.add(car.getModel());
        }
        String expected="[Series 10, Cruze, Benz, Accord, Highlander]";
        assertEquals(expected,sortedcar.toString());

    }

    @Test
    public void YearComparatorTest_reversed(){
        List<String> sortedcar = new ArrayList<> ();
        Collections.sort(Cars, Comparator.comparing((Car car)-> car.getYear ()).reversed());
        for(Car car: Cars){
            sortedcar.add(car.getModel());
        }
        String expected= "[Highlander, Accord, Benz, Cruze, Series 10]";
        assertEquals(expected,sortedcar.toString());

    }

    @Test
    public void ParetoComparatorTest(){
        for(Car car:Cars){
            car.setDominationcount(Cars);
        }
        List<String> sortedcar = new ArrayList<> ();
        Collections.sort(Cars, Comparator.comparing((Car car)-> car.getDominationcount()));
        for(Car car: Cars){
            sortedcar.add(car.getModel());
        }
        String expected ="[Highlander, Accord, Benz, Cruze, Series 10]";
        assertEquals(expected,sortedcar.toString());

    }

    @Test
    public void ParetoComparatorTest_reversed(){
        for(Car car:Cars){
            car.setDominationcount(Cars);
        }
        List<String> sortedcar = new ArrayList<> ();
        Collections.sort(Cars, Comparator.comparing((Car car)-> car.getDominationcount()).reversed());
        for(Car car: Cars){
            sortedcar.add(car.getModel());
        }
        String expected="[Series 10, Cruze, Benz, Accord, Highlander]";
        assertEquals(expected,sortedcar.toString());

    }

}
