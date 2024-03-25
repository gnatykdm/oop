package org.ex5.figurs;

import lombok.Data;
import org.ex5.Point;

@Data
public class Okrag extends Figura {

    public Point point;
    public double promien;

    public Okrag(Point point, double promien) {
        this.point = point;
        this.promien = promien;
    }

    public double getPowierzchnia() {
        return Math.PI * Math.pow(promien, 2);
    }

    public double getSrednica() {
        return 2 * promien;
    }

    public boolean wSrodku(Point point) {
        return Math.pow(point.getX() - this.point.getX(), 2) + Math.pow(point.getY() - this.point.getY(), 2) <= Math.pow(promien, 2);
    }

    @Override
    public String opis() {
        return "Klasa Okrag. Kolor obiektu: " + kolor;
    }

}
