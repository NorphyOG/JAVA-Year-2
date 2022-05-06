package main;

public abstract class Schiff {

    private String schiffsname;
    private Person Kapitän;
    private int besatzung;
    private int schiffsID;

    public Schiff(String schiffsname, Person kapitän, int besatzung) {
        this.schiffsname = schiffsname;
        this.Kapitän = kapitän;
        this.besatzung = besatzung;
        this.schiffsID++;
    }

    public String info() {
        return "Schiffsname: " + getSchiffsname() + "\nKapitän: " + getKapitän().toString() + "\nBesatzungs Menge: " + getBesatzung() + "\nSchiff ID: " + getSchiffsID();
    }

    @Override
    public String toString() {
        return "schiff{" +
                "schiffsname='" + schiffsname + '\'' +
                ", Kapitän=" + Kapitän +
                ", besatzung=" + besatzung +
                ", schiffsID=" + schiffsID +
                '}';
    }

    public String getSchiffsname() {
        return schiffsname;
    }

    public void setSchiffsname(String schiffsname) {
        this.schiffsname = schiffsname;
    }

    public Person getKapitän() {
        return Kapitän;
    }

    public void setKapitän(Person kapitän) {
        Kapitän = kapitän;
    }

    public int getBesatzung() {
        return besatzung;
    }

    public void setBesatzung(int besatzung) {
        this.besatzung = besatzung;
    }

    public int getSchiffsID() {
        return schiffsID;
    }

    public void setSchiffsID(int schiffsID) {
        this.schiffsID = schiffsID;
    }
}
