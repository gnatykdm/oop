package org.ex5;

public class Main {
    public static void main(String[] args) {
        Point[] points = new Point[] {
                new Point(),
                new Point(1.0, 2.0),
                new Point(4.7, 7.8)
        };

        for (Point obj : points) {
            obj.opis();
            obj.przesun(1.0, 1.0);
            obj.opis();
            obj.zeruj();
            obj.opis();
        }
    }
}
