package main;

public class ComputerBuch extends buch{

    private String gebiet;

    public ComputerBuch(String artikelName, String artikelNum, double preis, int erscheinungsjahr, String gebiet) {
        super(artikelName, artikelNum, preis, erscheinungsjahr);
        this.gebiet = gebiet;
    }

    public boolean checkArtikelNummer() {
        String firstLetter = getArtikelNum().substring(0,1);
        return firstLetter.equalsIgnoreCase("C");
    }

    public String datenAusgeben4() {
        return "Artikelnummer: " + getArtikelNum() + "\nArtikelbezeichnung: " + getArtikelName() + "\nVerkaufspreis: " + getPreis() + "\nErscheinungsjahr: " + getErscheinungsjahr() + "\nGebiet: " + getGebiet();
    }

    @Override
    public String toString() {
        return "ComputerBuch{" +
                "gebiet='" + gebiet + '\'' +
                '}';
    }

    //AUTO Getter & Setter
    public String getGebiet() {
        return gebiet;
    }

    public void setGebiet(String gebiet) {
        this.gebiet = gebiet;
    }
}
