package org.ex6;

import org.ex6.Transports.Samochod;
import org.ex6.Transports.SamochodOsobowy;

import java.util.Date;

public class  Main {
    public static void main(String[] args) {
        Samochod samochod = new Samochod("Audi", "A4", "Sedan", new Date(2022, 6, 23), 100000);
        System.out.println(samochod.opis());


        SamochodOsobowy samochodOsobowy = new SamochodOsobowy("Audi", "R7", "Sport-Car", new Date(2022, 6, 23), 100000, 3.0, 2.0, 5);
        System.out.println(samochodOsobowy.opis());
    }
}