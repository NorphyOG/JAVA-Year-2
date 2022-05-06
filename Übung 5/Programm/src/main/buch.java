package main;

public class buch extends artikel{

    public buch(String artikelName, String artikelNum, double preis, int erscheinungsjahr) {
        super(artikelName, artikelNum, preis);
        this.erscheinungsjahr = erscheinungsjahr;
    }

    public boolean checkArtikelNummer() {
        String firstLetter = getArtikelNum().substring(0,1);
        return firstLetter.equalsIgnoreCase("B");
    }

    private int erscheinungsjahr;

    @Override
    public String toString() {
        return "Buch: " + super.toString()  + "ErscheinungsJahr: " + erscheinungsjahr;
    }

    //TODO
    public String datenAusgeben2 () {
        return "Artikel Name: " + getArtikelName() + "\nArtikel Nummer: " + getArtikelNum() + "\nPreis: " + getPreis() + "\nErscheinungsjahr: " + getErscheinungsjahr();
    }

    //AUTO Getter & Setter
    public int getErscheinungsjahr() {
        return erscheinungsjahr;
    }

    public void setErscheinungsjahr(int erscheinungsjahr) {
        this.erscheinungsjahr = erscheinungsjahr;
    }
}
