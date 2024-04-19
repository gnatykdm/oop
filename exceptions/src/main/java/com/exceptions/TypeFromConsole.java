package com.exceptions;

import java.util.Scanner;


// Task 2
public class TypeFromConsole {
    private Scanner scanner;

    public TypeFromConsole() {
        scanner = new Scanner(System.in);
    }

    public int typeSomething() {
        try {
            return scanner.nextInt();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
}
