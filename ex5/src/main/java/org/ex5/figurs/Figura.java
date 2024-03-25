package org.ex5.figurs;

import org.ex5.Point;

public class Figura {

	protected Point punkt;
	protected String kolor = "bialy";
	
	
	public Figura(){
		punkt = new Point(0,0);
	}
	protected Figura(String kolor){
		this.kolor=kolor;
	}
	protected Figura(Point punkt){
		this.punkt=punkt;
	}
	protected String opis(){
		return "Klass Figura. Kolor obiektu: "+kolor;
	}
}
