package main;

public class Trommel implements MusicalInstrument{

    private String Rhythmus;

    @Override
    public String playInstrument() {
        return getRhythmus() + " Trommel, Trommel";
    }

    public String getRhythmus() {
        return Rhythmus;
    }

    public void setRhythmus(String rhythmus) {
        Rhythmus = rhythmus;
    }
}
