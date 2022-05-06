package main.person;

import java.time.LocalDate;

public class Person {

    private String vorname;
    private String nachname;
    private LocalDate alter;
    private String land;
    private String gebOrt;
    private String augenFabe;
    private int groesse;
    private int plz;
    private String stadt;
    private String strasse;
    private int hausNum;

    public Person(String vorname, String nachname, LocalDate alter, String land, String gebOrt, String augenFabe, int groesse, int plz, String stadt, String strasse, int hausNum) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.alter = alter;
        this.land = land;
        this.gebOrt = gebOrt;
        this.augenFabe = augenFabe;
        this.groesse = groesse;
        this.plz = plz;
        this.stadt = stadt;
        this.strasse = strasse;
        this.hausNum = hausNum;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public void setAlter(LocalDate alter) {
        this.alter = alter;
    }

    public void setLand(String land) {
        this.land = land;
    }

    public void setGebOrt(String gebOrt) {
        this.gebOrt = gebOrt;
    }

    public void setAugenFabe(String augenFabe) {
        this.augenFabe = augenFabe;
    }

    public void setGroesse(int groesse) {
        this.groesse = groesse;
    }

    public void setPlz(int plz) {
        this.plz = plz;
    }

    public void setStadt(String stadt) {
        this.stadt = stadt;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public void setHausNum(int hausNum) {
        this.hausNum = hausNum;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public LocalDate getAlter() {
        return alter;
    }

    public String getLand() {
        return land;
    }

    public String getGebOrt() {
        return gebOrt;
    }

    public String getAugenFabe() {
        return augenFabe;
    }

    public int getGroesse() {
        return groesse;
    }

    public int getPlz() {
        return plz;
    }

    public String getStadt() {
        return stadt;
    }

    public String getStrasse() {
        return strasse;
    }

    public int getHausNum() {
        return hausNum;
    }
}
