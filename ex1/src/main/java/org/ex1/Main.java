package org.ex1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        simpleCalc(2.1, 3.0);
    }

    // Exercise 1:
    private static void quadEquat(double numA, double numB, double numC) {
        double head = Math.pow(numB, 2) - 4 * numA * numC;
        double sqr = 0;

        double x1, x2;
        if (head > 0) {
            sqr = Math.sqrt(head);

            x1 = (-numB - sqr) / 2 * numA;
            x2 = (-numB + sqr) / 2 * numA;

            System.out.printf("**Solution: x1 - %f, x2 - %f\n", x1, x2);
        } else if (head == 0) {
            x1 = -numB/(2 * numA);

            System.out.printf("**Solution: x1 - %f\n", x1);
        } else {
            System.out.println("**There are no solutions");
        }
    }

    // Exercise 2:
    private static double aFunc(double x) {
        if (x > 0) {
            return 2 * x;
        } else if (x == 0) {
            return 0;
        } else {
            return -3 * x;
        }
    }

    private static double bFunc(double x) {
        return x >= 1 ? x * x : x;
    }

    private static double cFunc(double x) {
        if (x > 2)
            return 2 + x;
        return x < 2 ? x - 4 : 8;
    }

    //Exercise 3:
    private static int[] numSort(int numX, int numY, int numZ) {
        int[] arr = {numX, numY, numZ};
        Arrays.sort(arr);

        return arr;
    }

    // Exercise 4:
    private static void simpleCalc(double numA, double numB) {
        System.out.println("**Welcome to Simple Calculator:");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type operation[+,-,*,/,%]:");
        String op = scanner.nextLine();

        double numC = 0;
        switch (op) {
            case "+":
                numC = numA + numB;
                System.out.printf("\t#Result is - %f\n", numC);
                break;
            case "-":
                numC = numA - numB;
                System.out.printf("\t#Result is - %f\n", numC);
                break;
            case "*":
                numC = numA * numB;
                System.out.printf("\t#Result is - %f\n", numC);
                break;
            case "/":
                numC = numA / numB;
                System.out.printf("\t#Result is - %f\n", numC);
                break;
            case "%":
                numC = numA % numB;
                System.out.printf("\t#Result is - %f\n", numC);
                break;
            default:
                System.out.println("**Invalid operation");
                break;
        }
    }


}