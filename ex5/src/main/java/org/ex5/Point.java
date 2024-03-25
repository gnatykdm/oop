package org.ex5;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Point {
    private double x;
    private double y;

    public Point() {
        this.x = 3.2;
        this.y = 5.8;
    }


    public void zeruj() {
        this.x = 0.0;
        this.y = 0.0;
    }

    public void opis() {
        System.out.println("Punkt o współrzędnych: x=" + x + ", y=" + y);
    }

    public void przesun(double x, double y) {
        this.x += x;
        this.y += y;
    }


}
