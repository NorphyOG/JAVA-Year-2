package main;

public class SonderParket {

    private artikel[] inhalt = new artikel[99];

    public SonderParket(artikel[] inhalt) {
        this.inhalt = inhalt;
    }

    public double preisBerechnen(int num) {
        double r = inhalt[num].getPreis() * 0.85;
        inhalt[num].setPreis(r);
        return r;
    }

    //AUTO Setter & Getter
    public artikel[] getInhalt() {
        return inhalt;
    }

    public void setInhalt(artikel[] inhalt) {
        this.inhalt = inhalt;
    }
}
