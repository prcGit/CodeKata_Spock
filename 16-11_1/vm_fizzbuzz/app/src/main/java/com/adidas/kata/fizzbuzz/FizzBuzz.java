package com.adidas.kata.fizzbuzz;

public class FizzBuzz {

    public static String print(int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i <= end; i++) {
            String line = "";
            if (i % 3 == 0) {
                line += "Fizz";
            }
            if (i % 5 == 0) {
                line += "Buzz";
            }
            if (line.length() == 0) {
                line = String.valueOf(i);
            }
            if (i > start) {
                sb.append("\n");
            }
            sb.append(line);
        }
        return sb.toString();
    }
}
