package com.adidas.kata.fizzbuzz;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void test() {
        System.out.println(FizzBuzz.print(1, 100));
    }

    @Test
    public void testSingleFizz() {
        assertTrue("Fizz".equals(FizzBuzz.print(3, 3)));
    }

    @Test
    public void testSingleBuzz() {
        assertTrue("Buzz".equals(FizzBuzz.print(5, 5)));
    }

    @Test
    public void testFizzBuzz() {
        assertTrue("FizzBuzz".equals(FizzBuzz.print(15, 15)));
    }

    @Test
    public void testFailBuzz() {
        assertFalse("Buzz".equals(FizzBuzz.print(4, 4)));
    }
}