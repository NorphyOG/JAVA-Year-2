package main;

public class artikel {

    private String artikelName;
    private String artikelNum;
    private double preis;

    public artikel(String artikelName, String artikelNum, double preis) {
        this.artikelName = artikelName;
        this.artikelNum = artikelNum;
        this.preis = preis;
    }

    @Override
    public String toString() {
        return "aufgabe1{" +
                "artikelName='" + artikelName + '\'' +
                ", artikelNum='" + artikelNum + '\'' +
                ", preis=" + preis +
                '}';
    }


    public String datenAusgeben () {
        return "Artikelnummer: " + artikelNum + "\nArtikelbezeichnung: " + artikelName + "\nVerkaufspreis: " + preis;
    }

    public void preisErhoehen (double prozent) {
        double einProzent = preis / 100;
        preis += prozent * einProzent;
    }

    //AUTO Getter & Setter
    public String getArtikelName() {
        return artikelName;
    }

    public void setArtikelName(String artikelName) {
        this.artikelName = artikelName;
    }

    public String getArtikelNum() {
        return artikelNum;
    }

    public void setArtikelNum(String artikelNum) {
        this.artikelNum = artikelNum;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

}
