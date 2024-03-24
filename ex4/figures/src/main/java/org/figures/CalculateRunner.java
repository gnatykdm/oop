package org.figures;

import org.figures.figure.*;

public class CalculateRunner {
    protected static void showCuboid(int sideA, int sideB, int sideC, int height) {
        Cuboid cuboid = new Cuboid("Cuboid", sideA, sideB, sideC, height);
        System.out.println("Cuboid area: " + cuboid.cuboidArea());
    }

    protected static void showRectangle(int sideA, int sideB) {
        Rectangle rectangle = new Rectangle("Rectangle", sideA, sideB);
        System.out.println("Rectangle area: " + rectangle.rectangleArea());
    }

    protected static void showTriangle(int sideA, int sideB, int sideC, int triangleHeight) {
        Triangle triangle = new Triangle("Triangle", sideA, sideB, sideC, triangleHeight);
        System.out.println("Triangle area: " + triangle.triangleArea());
    }

    protected static void showSquare(int sideA) {
        Square square = new Square("Square", sideA);
        System.out.println("Square area: " + square.squareArea());
    }

    protected static void showBoll(int radius) {
        Boll boll = new Boll("Boll", radius);
        System.out.println("Boll area: " + boll.bollArea());
    }

    protected static void showCube(int sideA, int height, int width) {
        Cube cube = new Cube("Cube", sideA, height, width);
        System.out.println("Cube area: " + cube.cubeArea());
    }
}
