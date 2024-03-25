package org.ex6.Transports;

import lombok.Data;
import lombok.Getter;

import java.util.Date;


public class SamochodOsobowy extends Samochod{
    @Getter
    private double waga;

    @Getter
    private double pojemnoscSilnika;

    @Getter
    private int liczbaOsob;

    public SamochodOsobowy(String marka, String model, String nadwozie, Date rokProdukcji, double przebieg, double waga, double pojemnoscSilnika, int liczbaOsob) {
        super(marka, model, nadwozie, rokProdukcji, przebieg);

        if (waga >= 2.0 && waga <= 4.5) {
            this.waga = waga;
        } else {
            System.out.println("Waga musi być z przedziału 2-4.5ton");
        }

        if (pojemnoscSilnika >= 0.8 && pojemnoscSilnika <= 3.0) {
            this.pojemnoscSilnika = pojemnoscSilnika;
        } else {
            System.out.println("Pojemność silnika musi być z przedziału 0.8-3.5l");
        }

        this.liczbaOsob = liczbaOsob;
    }

    @Override
    public String opis() {
        return super.opis() + " o wadze " + waga + " o pojemności silnika " + pojemnoscSilnika + " o liczbie miejsc " + liczbaOsob + "\n";
    }
}
