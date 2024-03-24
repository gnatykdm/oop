package org.figures.figure;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Cube {
    private String name = "Cube";
    private int side;
    private int height;
    private int width;

    public int cubeArea() {
        return 2 * (side * height + side * width + height * width);
    }
}
