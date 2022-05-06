package main;

import java.util.List;

public class F_DVD {

    private String title;
    private List<String> genre;
    private int alter;
    private int dauer;
    private double kennGroesse;
    private boolean isReduziert;



    //Getter / Setter

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public int getDauer() {
        return dauer;
    }

    public void setDauer(int dauer) {
        this.dauer = dauer;
    }

    public double getKennGroesse() {
        return kennGroesse;
    }

    public void setKennGroesse(double kennGroesse) {
        this.kennGroesse = kennGroesse;
    }

    public boolean isReduziert() {
        return isReduziert;
    }

    public void setReduziert(boolean reduziert) {
        isReduziert = reduziert;
    }
}
