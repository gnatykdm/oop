package com.exceptions;


// Task 4
public class DividingByZeroExceptionExample extends Exception {

    public DividingByZeroExceptionExample(String message) {
        super(message);
    }

    public double divideExample(double a, double b) throws DividingByZeroExceptionExample {
        if (b == 0) {
            throw new DividingByZeroExceptionExample("You can't divide by zero");
        }
        return a / b;
    }
}
