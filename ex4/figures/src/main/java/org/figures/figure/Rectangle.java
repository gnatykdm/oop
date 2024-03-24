package org.figures.figure;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Rectangle {
    private String name = "Rectangle";
    private int sideA;
    private int sideB;

    public int rectangleArea() {
        return sideA * sideB;
    }
}
