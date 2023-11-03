package edu.umb.cs680.hw01;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class PrimeGeneratorTest {

    @Test
    void test1to50(){
        PrimeGenerator primeGenerator=new PrimeGenerator(1,50);
        primeGenerator.generatePrimes();
        List<Long> listOFPrimesto50=primeGenerator.getPrimes();
        List<Long> primeto50= List.of(2L, 3L, 5L, 7L, 11L, 13L, 17L, 19L, 23L, 29L, 31L, 37L, 41L, 43L, 47L);
        assertEquals(primeto50,listOFPrimesto50);
    }

    @Test
    void testIsPrime(){
        PrimeGenerator primeGenerator=new PrimeGenerator(1,20);
        boolean result=primeGenerator.isPrime(7);
        assertTrue(result);
    }

    @Test
    void testNegativePrime(){
        try {
            PrimeGenerator primeGenerator = new PrimeGenerator(-1, 10);
            fail("This action is failed");
        } catch (Exception error) {
            assertEquals("Wrong input values: from=-1 to=10",error.getMessage().toString());
        }
    }

    @Test
    void testZeroValue(){
        try {
            PrimeGenerator primeGenerator = new PrimeGenerator(0, 10);
            fail("This action is failed");
        } catch (Exception error) {
            assertEquals("Wrong input values: from=0 to=10",error.getMessage().toString());
        }
    }

    @Test
    void testIsEven(){
        PrimeGenerator primeGenerator=new PrimeGenerator(1,20);
        boolean result=primeGenerator.isEven(4);
        assertTrue(result);
    }
}