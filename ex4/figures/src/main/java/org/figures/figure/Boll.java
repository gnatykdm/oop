package org.figures.figure;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Boll {
    private String name = "Boll";
    private int radius;

    public double bollArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }
}
