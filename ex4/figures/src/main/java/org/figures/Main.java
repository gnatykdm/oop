package org.figures;

import java.util.Scanner;

/* @author Dmytro Gnatyk */
/* @date 2021-01-20 */
/* @version 1.0 */

public class Main extends CalculateRunner{
    public static void main(String[] args) {
        clearScreen(); // --> Clear the console
        System.out.println("**Welcome to SimpleGeometry calculator**");
        Scanner scanner = new Scanner(System.in);
        boolean step = true;

        while (step) {
            showMenu();
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the side of the square: ");
                    int sideA = scanner.nextInt();
                    showSquare(sideA);
                    scanner.next();
                    clearScreen();
                    break;
                case 2:
                    System.out.println("Enter the sides of the rectangle: ");
                    int sideA1 = scanner.nextInt();
                    int sideB1 = scanner.nextInt();
                    showRectangle(sideA1, sideB1);
                    scanner.next();
                    clearScreen();
                    break;
                case 3:
                    System.out.println("Enter the sides of the triangle: ");
                    int sideA2 = scanner.nextInt();
                    int sideB2 = scanner.nextInt();
                    int sideC2 = scanner.nextInt();
                    System.out.println("Enter the height of the triangle: ");
                    int triangleHeight = scanner.nextInt();
                    showTriangle(sideA2, sideB2, sideC2, triangleHeight);
                    scanner.next();
                    clearScreen();
                    break;
                case 4:
                    System.out.println("Enter the sides of the cuboid: ");
                    int sideA3 = scanner.nextInt();
                    int sideB3 = scanner.nextInt();
                    int sideC3 = scanner.nextInt();
                    System.out.println("Enter the height of the cuboid: ");
                    int height = scanner.nextInt();
                    showCuboid(sideA3, sideB3, sideC3, height);
                    scanner.next();
                    clearScreen();
                    break;
                case 5:
                    System.out.println("Enter the side of the cube: ");
                    int sideA4 = scanner.nextInt();
                    System.out.println("Enter the height of the cube: ");
                    int height1 = scanner.nextInt();
                    System.out.println("Enter the width of the cube: ");
                    int width = scanner.nextInt();
                    showCube(sideA4, height1, width);
                    scanner.next();
                    clearScreen();
                    break;
                case 6:
                    System.out.println("Enter the radius of the boll: ");
                    int radius = scanner.nextInt();
                    showBoll(radius);
                    scanner.next();
                    clearScreen();
                    break;
                case 7:
                    clearScreen();
                    System.out.println("**Goodbye!**");
                    step = false;
                    break;
                default:
                    System.out.println("Invalid choice");
                    scanner.next();
                    clearScreen();
            }
        }

    }

    private static void showMenu() {
        System.out.println("**Choose a figure to calculate its area:**");
        System.out.println("\t1. Square;");
        System.out.println("\t2. Rectangle;");
        System.out.println("\t3. Triangle;");
        System.out.println("\t4. Cuboid;");
        System.out.println("\t5. Cube;");
        System.out.println("\t6. Boll;");
        System.out.println("\t7. Exit;");
        System.out.print("**Enter your choice:");
    }

    private static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}