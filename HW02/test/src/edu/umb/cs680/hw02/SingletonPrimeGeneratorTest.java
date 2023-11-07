package edu.umb.cs680.hw02;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SingletonPrimeGeneratorTest {

    @Test
    void testThrowException() {
        boolean thrown = false;
        try {
            SingletonPrimeGenerator singletonPrimeGenerator = new SingletonPrimeGenerator();
            singletonPrimeGenerator.setBoundary(-1,100);
            SingletonPrimeGenerator.getInstance();
            fail("Fail statement executed");
        } catch (RuntimeException ex) {
            thrown = true;
        }
        assertTrue(thrown);
    }


    @Test
    void test_single_instance(){
        SingletonPrimeGenerator singletonPrimeGenerator=SingletonPrimeGenerator.getInstance();
        SingletonPrimeGenerator singletonPrimeGenerator1=SingletonPrimeGenerator.getInstance();
        assertSame(singletonPrimeGenerator,singletonPrimeGenerator1);
    }

    @Test
    void test_single_instance_1(){
        SingletonPrimeGenerator singletonPrimeGenerator=SingletonPrimeGenerator.getInstance();
        SingletonPrimeGenerator singletonPrimeGenerator1=SingletonPrimeGenerator.getInstance();
        assertEquals(singletonPrimeGenerator.hashCode(),singletonPrimeGenerator1.hashCode());
    }

    @Test
    void test_not_null(){
        SingletonPrimeGenerator singletonPrimeGenerator=SingletonPrimeGenerator.getInstance();
        assertNotNull(singletonPrimeGenerator);
    }

    @Test
    void test_get_primes(){
        SingletonPrimeGenerator singletonPrimeGenerator=SingletonPrimeGenerator.getInstance();
        singletonPrimeGenerator.setBoundary(1,20);
        singletonPrimeGenerator.generatePrimes();
        ArrayList<Long> expected = new ArrayList<>(Arrays.asList(2L, 3L, 5L, 7L, 11L, 13L, 17L, 19L));
        assertIterableEquals(expected,singletonPrimeGenerator.getPrimes());
    }

}




