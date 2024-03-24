package org.figures.figure;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Wheel {
    private String name = "Wheel";
    private int radius;

    public double wheelArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
