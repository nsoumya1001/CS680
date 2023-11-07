package edu.umb.cs680.hw03;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    private String[] carToStringArray(Car car){
        String[] value={car.getMake(),car.getModel(),String.valueOf(car.getYear())};
        return value;
    }

    @Test
    void verifyCarEqualityWithMakeModelYear(){
        Car car=new Car("Toyota","Highlander",2012,28,12000);
        String[] Expected= {"Toyota", "Highlander", "2012"};
        String[] actual=carToStringArray(car);
        assertArrayEquals(Expected,actual);
    }

    @Test
    void verifycarmake(){
        Car car=new Car("Honda","Accord",2013,29,11500);
        String expected="Honda";
        assertEquals(expected,car.getMake());
    }

    @Test
    void verifycarmodel(){
        Car car=new Car("Mercedes","Benz",2023,27,60000);
        String expected="Benz";
        assertEquals(expected,car.getModel());
    }

    @Test
    void verifycaryear(){
        Car car=new Car("Chevorlet","Cruze",2019,26,5000);
        int expected=2019;
        assertEquals(expected,car.getYear());
    }

    @Test
    void verifycarmileage(){
        Car car=new Car("BMW","Series 10",2023,29,10000);
        float expected=10000;
        assertEquals(expected,car.getPrice());
    }

}