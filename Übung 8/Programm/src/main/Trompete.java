package main;

public class Trompete implements MusicalInstrument{

    private String Tonart;

    @Override
    public String playInstrument() {
        return getTonart() + " Troet, Troet";
    }

    public void setTonart(String tonart) {
        Tonart = tonart;
    }

    public String getTonart() {
        return Tonart;
    }
}
