package main;

import java.util.ArrayList;

public class Orchester {

    private ArrayList<MusicalInstrument> orchesterList = new ArrayList<>();

    public void setOrchester(int groesse, String[] instTackt) {
        for (int i = groesse; i >= 0; i--) {
            int rdmInst = (int) (Math.random() * 2);

            switch (rdmInst) {
                case 0 -> {
                    Trommel tl = new Trommel();
                    tl.setRhythmus(instTackt[0]);
                    orchesterList.add(tl);
                }
                case 1 -> {
                    Trompete tp = new Trompete();
                    tp.setTonart(instTackt[1]);
                    orchesterList.add(tp);
                }
            }

        }
    }

    public void playOrchester() {
        for (MusicalInstrument musicalInstrument : orchesterList) {
            System.out.println(musicalInstrument.playInstrument());
        }
    }

}
