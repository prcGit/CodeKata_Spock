package com.adidas.transdeps;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void test() throws Exception {
        String[] input = new String[6];
        input[0] = "A B C";
        input[1] = "B C E";
        input[2] = "C G";
        input[3] = "D A F";
        input[4] = "E F";
        input[5] = "F H";

        String[] output = Dependencies.findFullDependencies(input);
        for (String line : output) {
            System.out.println(line);
        }
    }
}