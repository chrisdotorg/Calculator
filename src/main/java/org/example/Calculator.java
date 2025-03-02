package org.example;

public class Calculator {

    // Square Root Function
    public static double squareRoot(double x) {
        if (x < 0) throw new IllegalArgumentException("Cannot calculate square root of a negative number.");
        return Math.sqrt(x);
    }

    // Factorial Function
    public static long factorial(int x) {
        if (x < 0) throw new IllegalArgumentException("The factorial is not defined for negative numbers.");
        long fact = 1;
        for (int i = 2; i <= x; i++) {
            fact *= i;
        }
        return fact;
    }

    // Natural Logarithm (ln)
    public static double naturalLog(double x) {
        if (x <= 0) throw new IllegalArgumentException("Logarithm is only defined for positive numbers.");
        return Math.log(x);
    }

    // Power Function (x^b)
    public static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }
}