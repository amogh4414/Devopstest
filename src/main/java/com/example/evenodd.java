
package com.example;

public class evenodd {

    public static String checkEvenOdd(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";

        System.out.println("Number: " + number);
        System.out.println("Result: " + checkEvenOdd(number));
    }
}
