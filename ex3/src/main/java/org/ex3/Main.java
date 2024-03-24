package org.ex3;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ex3");
    }

    // Task 1

    private static int[] createArr(int size, int x, int y) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            Random random = new Random();
            arr[i] = random.nextInt(y - x + 1) + x;
        }
        return arr;
    }
    private static void sumMiddleArr(int[] arr) {
        int sum = 0;
        double middle = 0;
        for (int j : arr) {
            sum += j;
            middle += j;
        }

        System.out.println("**Middle number is - " + middle / arr.length + " **");
        System.out.println("**Sum of numbers is - " + sum + " **");
    }

    // Task 2
    private static void printArr() {
        int[] pair = createArr(10, 10, 99);
        int[] notPair = createArr(10, 10, 99);

        for (int j : pair) {
            if (j % 2 == 0) {
                System.out.print(j + " ");
            }
        }

        for (int j : notPair) {
            if (j % 2 != 0) {
                System.out.print(j + " ");
            }
        }
    }

    // Task 3






}
