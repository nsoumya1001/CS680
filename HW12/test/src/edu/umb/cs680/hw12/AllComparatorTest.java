package edu.umb.cs680.hw12;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AllComparatorTest {

    public static List<edu.umb.cs680.hw12.Car> ListOfCars() {

        List<Car> List = new ArrayList<>();

        edu.umb.cs680.hw12.Car car1 = new edu.umb.cs680.hw12.Car ("Toyota", "Highlander", 2016, 20, 12000);
        edu.umb.cs680.hw12.Car car2 = new edu.umb.cs680.hw12.Car ("Honda", "Accord", 2015, 22, 13000);
        edu.umb.cs680.hw12.Car car3 = new edu.umb.cs680.hw12.Car ("Mercedes", "Benz", 2014, 25, 14000);
        edu.umb.cs680.hw12.Car car4 = new edu.umb.cs680.hw12.Car ("Chevorlet", "Cruze", 2013, 26, 15000);
        edu.umb.cs680.hw12.Car car5 = new edu.umb.cs680.hw12.Car ("BMW", "Series 10", 2012, 29, 16000);

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
        Collections.sort(Cars,new PriceComparator ());
        for(edu.umb.cs680.hw12.Car car: Cars){
            sortedcar.add(car.getModel());
        }
        String expected="[Highlander, Accord, Benz, Cruze, Series 10]";
        assertEquals(expected,sortedcar.toString());

    }


    @Test
    public void MileageComparatorTest(){
        List<String> sortedcar = new ArrayList<> ();
        Collections.sort(Cars,new MileageComparator ());
        for(Car car: Cars){
            sortedcar.add(car.getModel());
        }
        String expected= "[Highlander, Accord, Benz, Cruze, Series 10]";
        assertEquals(expected,sortedcar.toString());

    }

    @Test
    public void YearComparatorTest(){
        List<String> sortedcar = new ArrayList<> ();
        Collections.sort(Cars,new YearComparator ());
        for(Car car: Cars){
            sortedcar.add(car.getModel());
        }
        String expected="[Series 10, Cruze, Benz, Accord, Highlander]";
//        Cars.forEach((car)-> System.out.println("year for :"+car.getModel()+" is "+car.getYear() ));
        assertEquals(expected,sortedcar.toString());

    }

    @Test
    public void ParetoComparatorTest(){
        for(Car car:Cars){
            car.setDominationcount(Cars);
        }
        List<String> sortedcar = new ArrayList<> ();
        Collections.sort(Cars,new ParetoComparator ());
        for(Car car: Cars){
            sortedcar.add(car.getModel());
        }
        String expected ="[Highlander, Accord, Benz, Cruze, Series 10]";
        assertEquals(expected,sortedcar.toString());

    }

}
