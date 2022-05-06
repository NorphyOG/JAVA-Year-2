package main;

public class ArtikelMain {
    public static void main(String[] args) {
        buch a1 = new buch("Warum", "B1234", 38.00, 2000);
        dvd a2 = new dvd("Center Stage", "d55", 34.80, 111);
        ComputerBuch a3 = new ComputerBuch("Alle Java-Klausuren", "F3000", 999.99, 2001, "Java");

        artikel[] ArtikelListe = {a1, a2, a3};

        erhoeePreis(a2);
        a2.laufzeit();

        a1.datenAusgeben2();
        a1.checkArtikelNummer();
        a2.datenAusgabe3();
        a2.checkArtikelNummer();
        a3.datenAusgeben4();
        a3.checkArtikelNummer();

    }

    public static void erhoeePreis(artikel artikel) {
        artikel.setPreis(artikel.getPreis() * 1.05);
    }



}
