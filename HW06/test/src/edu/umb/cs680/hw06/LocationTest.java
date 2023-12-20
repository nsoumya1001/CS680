package edu.umb.cs680.hw06;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LocationTest {

    private LocationSensor locationSensor;
    private LocationObserver<edu.umb.cs680.hw06.Location> observerA;
    private LocationObserver<Location> observerB;

    @BeforeEach
    void setUp() {
        locationSensor = new LocationSensor();
    }

    @Test
    void addObserverTest() {
        locationSensor.addObserver(observerA);
        assertEquals(1, locationSensor.countObservers());
    }

    @Test
    void removeObserverTest() {
        locationSensor.addObserver(observerA);
        locationSensor.removeObserver(observerA);
        assertEquals(0, locationSensor.countObservers());
    }

    @Test
    void clearObserversTest() {
        locationSensor.addObserver(observerA);
        locationSensor.addObserver(observerB);
        locationSensor.clearObservers();
        assertEquals(0, locationSensor.countObservers());
    }
}
