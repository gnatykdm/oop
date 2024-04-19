package com.exceptions;

// Task 1
public class MathOperation {
    public Double ownAbs(double num) {
        if (num > 0) {
            return Math.abs(num);
        } else {
            throw new IllegalArgumentException("The number must be greater than 0");
        }
    }
}
