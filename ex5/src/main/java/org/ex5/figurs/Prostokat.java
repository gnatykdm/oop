package org.ex5.figurs;

public class Prostokat extends Figura {
	public double wys=0, szer=0;
	
	public Prostokat(double wys,double szer){
		this.wys = wys;
		this.szer = szer;
	}

	public Prostokat(float wys, float szer, String color) {
		super(color);
		this.wys = wys;
		this.szer = szer;
	}

   public double getPowierzchnia() {
        return (szer * wys);
    }

	public void przesun(double x, double y) {
		punkt.setX(punkt.getX() + x);
		punkt.setY(punkt.getY() + y);
	}

	@Override
	public String opis() {
		return "Klasa Prostokat. Kolor obiektu: " + kolor;
	}
}