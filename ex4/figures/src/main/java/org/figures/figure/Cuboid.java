package org.figures.figure;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Cuboid {
    private String name = "Cuboid";
    private int sideA;
    private int sideB;
    private int sideC;
    private int height;

    public int cuboidArea() {
        return 2 * (sideA * sideB + sideA * sideC + sideB * sideC);
    }
}
