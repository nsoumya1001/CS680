package edu.umb.cs680.hw06;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class StepCounterTest {

    private StepCounter stepCounter;
    private StepCounterObserver<StepCount> observerA;
    private StepCounterObserver<StepCount> observerB;

    @BeforeEach
    void setUp() {
        stepCounter = new StepCounter();
    }

    @Test
    void addObserverTest() {
        stepCounter.addObserver(observerA);
        assertEquals(1, stepCounter.countObservers());
    }

    @Test
    void removeObserverTest() {
        stepCounter.addObserver(observerA);
        stepCounter.removeObserver(observerA);
        assertEquals(0, stepCounter.countObservers());
    }

    @Test
    void clearObserversTest() {
        stepCounter.addObserver(observerA);
        stepCounter.addObserver(observerB);
        stepCounter.clearObservers();
        assertEquals(0, stepCounter.countObservers());
    }
}
