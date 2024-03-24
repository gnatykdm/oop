package org.figures.figure;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Triangle {
    private String name = "Triangle";
    private int sideA;
    private int sideB;
    private int sideC;
    private int triangleHeight;

    public double triangleArea() {
        return 0.5 * sideA * triangleHeight;
    }
}
