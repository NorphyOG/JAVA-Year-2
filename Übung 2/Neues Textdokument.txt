package main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class kaffeemaschiene {

    //Vars
    private int maxWasser = 3000;
    private int maxKaffee = 200;
    private int kaffeeStand;
    private int wasserStand;
    private int tassen;
    private String name;

    //SETTER / GETTER


    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public int getMaxWasser() {
        return maxWasser;
    }

    public int getMaxKaffee() {
        return maxKaffee;
    }

    public int getWasserStand() {
        return wasserStand;
    }

    public void setWasserStand(int wasserStand) {
        this.wasserStand = wasserStand;
    }

    public int getKaffeeStand() {
        return kaffeeStand;
    }

    public void setKaffeeStand(int kaffeeStand) {
        this.kaffeeStand = kaffeeStand;
    }

    public int getTassen() {
        return tassen;
    }

    public void setTassen(int tassen) {
        this.tassen = tassen;
    }


    //Methodes
    public int tassenKochen() {

        return tassenKochen();
    }

    public int auffuellen(boolean isKaffee, int menge) {

        if (isKaffee) {

        } else {

        }

        return menge;
    }

    public void reinigung() {

    }

    public String info() {

        return info();
    }

    //Main
    public void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean[] run = {true};
        int turn = 0;

        while (run[0]) {
            try {
                if (turn == 0) {
                    System.out.println("Willkommen...\n\nName: ");
                    setName(sc.next());
                    System.out.println("Willkommen " + getName() + "\nDies ist die Kaffee-Maschiene6000");
                } else {

                }
                turn++;
            } catch (InputMismatchException e) {
                System.err.println(e.getMessage());
            }
        }

    }
}
