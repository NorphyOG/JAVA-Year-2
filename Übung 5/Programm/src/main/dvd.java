package main;

public class dvd extends artikel{

    private int dauer;

    public dvd(String artikelName, String artikelNum, double preis, int dauer) {
        super(artikelName, artikelNum, preis);
        this.dauer = dauer;
    }

    public String datenAusgabe3 () {
        return "Artikel Name: " + getArtikelName() + "\nArtikel Nummer: " + getArtikelNum() + "\nPreis: " + getPreis() + "\nDauer: " + getDauer();
    }

    public String laufzeit() {
        int min = dauer % 60;
        int stu = dauer / 60;
        return stu + " Stunden\n" + min + " Minuten";
    }

    public boolean checkArtikelNummer() {
        String firstLetter = getArtikelNum().substring(0,1);
        return firstLetter.equalsIgnoreCase("D");
    }

    //AUTO Getter & Setter
    public int getDauer() {
        return dauer;
    }

    public void setDauer(int dauer) {
        this.dauer = dauer;
    }
}
