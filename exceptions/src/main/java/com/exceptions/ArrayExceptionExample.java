package com.exceptions;

import java.util.ArrayList;

// Task 3
public class ArrayExceptionExample {
    private int[] numbers;

    public ArrayExceptionExample() {
        numbers = new int[] {1,2,3,4,5,6,7,8,9,10};;
    }

    public int getFromArray(int index) {
        try {
            return numbers[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            return 0;
        }
    }
}
