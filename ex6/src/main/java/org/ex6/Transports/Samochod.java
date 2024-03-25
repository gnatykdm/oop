package org.ex6.Transports;

import lombok.Data;

import java.util.Date;

@Data
public class Samochod {

    private String marka;
    private String model;
    private String nadwozie;
    private Date rokProdukcji;
    private double przebieg;

    public Samochod(String marka, String model, String nadwozie, Date rokProdukcji, double przebieg) {
        this.marka = marka;
        this.model = model;
        this.nadwozie = nadwozie;
        this.rokProdukcji = rokProdukcji;
        this.przebieg = przebieg;
    }

    public String opis() {
        return "Samochód marki " + marka + " model " + model + " z nadwoziem " + nadwozie + " z roku produkcji " + rokProdukcji + " o przebiegu " + przebieg + "\n";
    }
}
