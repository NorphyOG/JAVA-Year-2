package model;

import view.YFoodMaschiene;

public class Model {

    private int tassen = 0;

    private int maxPulver = 1000;
    private int pulver = 0;

    private int maxWasser = 15000;
    private int wasser = 0;

    private int reinigung = 12;

    public void infoUpdate(YFoodMaschiene yFoodMaschiene) {
        yFoodMaschiene.getoAusgabe().setText(
                "   INFORMATION\n" +
                "--------------------------\n" +
                "MAX Wasser: " + maxWasser +
                "\nMAX Pulver: " + maxPulver +
                "\nWasser: " + wasser +
                "\nPulver: " + pulver +
                "\nTassen: " + tassen +
                "\nNächste Reinigung: " + reinigung + " Tassen"
        );
    }

    public void pulverAuffuellen(int menge) throws Exception {
        if (menge <= maxPulver && pulver <= maxPulver) {
            pulver = pulver + menge;
        } else {
            throw new Exception("Pulver ist beriets befüllt");
        }
    }

    public void wasserAuffuellen(int menge) throws Exception {
        if (menge <= maxWasser && wasser <= maxWasser) {
            wasser = wasser + menge;
        } else {
            throw new Exception("Wasser ist beriets befüllt");
        }
    }

    public void reinigung(YFoodMaschiene yFoodMaschiene) {
        if (reinigung == 0) {
            reinigung = 12;
            wasser = 0;
            pulver = 0;

            yFoodMaschiene.getoStatus().setText("Maschiene wurde gereinigt!");
        }
    }

    public void yFoodZubereitung(YFoodMaschiene yFoodMaschiene) {
        if (wasser >= 500 && pulver >= 140) {
            wasser = wasser - 500;
            pulver = pulver - 140;

            tassen++;
            reinigung--;

            yFoodMaschiene.getoStatus().setText("YFood Wurde hergestellt");
        }
    }





}
