package org.ex5.figurs;

import lombok.Data;

@Data
public class Kwadrat extends Figura {
    public double bok=0;

    public Kwadrat(double bok){
        this.bok = bok;
    }

    public Kwadrat(float bok, String color) {
        super(color);
        this.bok = bok;
    }

    public double getPowierzchnia() {
        return (bok * bok);
    }

    public void przesun(double x, double y) {
        punkt.setX(punkt.getX() + x);
        punkt.setY(punkt.getY() + y);
    }

    @Override
    public String opis() {
        return "Klasa Kwadrat. Kolor obiektu: " + kolor;
    }
}
