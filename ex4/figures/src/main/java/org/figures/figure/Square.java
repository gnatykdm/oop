package org.figures.figure;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Square {
    private String name = "Square";
    private int side;

    public int squareArea() {
        return side * side;
    }
}
