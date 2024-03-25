package org.ex6.Transports;

import lombok.Getter;
import java.util.Date;

@Getter
public class Samochod implements Cloneable {

    private final String marka;
    private final String model;
    private final String nadwozie;
    private final Date rokProdukcji;
    private final double przebieg;

    public Samochod(String marka, String model, String nadwozie, Date rokProdukcji, double przebieg) {
        this.marka = marka;
        this.model = model;
        this.nadwozie = nadwozie;
        this.rokProdukcji = rokProdukcji;
        this.przebieg = przebieg;
    }

    public String opis() {
        return "**Samochód marki " + marka + " model " + model + " z nadwoziem " + nadwozie
                + " z roku produkcji " + rokProdukcji + " o przebiegu " + przebieg + "**\n";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Samochod samochod))
            return false;
        return samochod.marka.equals(marka) && samochod.model.equals(model) && samochod.nadwozie.equals(nadwozie)
                && samochod.rokProdukcji.equals(rokProdukcji) && samochod.przebieg == przebieg;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + marka.hashCode();
        result = 31 * result + model.hashCode();
        result = 31 * result + nadwozie.hashCode();
        result = 31 * result + rokProdukcji.hashCode();
        result = 31 * result + (int)przebieg;
        return result;
    }

    @Override
    public Samochod clone() {
        try {
            return (Samochod) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
