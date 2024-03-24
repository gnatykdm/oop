package  org.ex2;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    }

    // Task 1
    private static void middleMark9(int n) {
        Scanner scanner = new Scanner(System.in);
        double middleM = 0;

        while (n > 0) {
            System.out.print("Type marK: ");
            middleM += scanner.nextDouble();
            n--;
        }
        System.out.println("Middle mark: " + middleM / n);
    }

    // Task 2
    private static void numberSum() {
        int amount = 0;
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Type number: ");
            int number = new Scanner(System.in).nextInt();
            if (number > 0) {
                amount++;
                sum += number;
            }
        }
        System.out.println("Amount of positive numbers: " + amount);
        System.out.println("Sum of positive numbers: " + sum);
    }

    // Task 3
    private static int doublesSum(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            if (j > 0) {
                sum += j;
            }
        }
        return sum;
    }

    // Task 4
    private static int randomSum(int n, Random random) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int number  = random.nextInt(-10, 45);
            if (number > 0) {
                sum += number;
            }
        }
        return sum;
    }

    // Task 5
    private static boolean palindromeCheck(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}
