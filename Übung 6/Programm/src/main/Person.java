package main;

import java.time.LocalDate;

public class Person {

    private String vorname;
    private String nachname;
    private String adresse;
    private int PLZ;
    private String telNum;
    private char geschlecht;
    private LocalDate geburtstag;

    public Person(String vorname, String nachname, String adresse, int PLZ, String telNum, char geschlecht, LocalDate geburtstag) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.adresse = adresse;
        this.PLZ = PLZ;
        this.telNum = telNum;
        this.geschlecht = geschlecht;
        this.geburtstag = geburtstag;
    }

    @Override
    public String toString() {
        return "person{" +
                "vorname='" + vorname + '\'' +
                ", nachname='" + nachname + '\'' +
                ", adresse='" + adresse + '\'' +
                ", PLZ=" + PLZ +
                ", telNum='" + telNum + '\'' +
                ", geschlecht=" + geschlecht +
                ", geburtstag=" + geburtstag +
                '}';
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getPLZ() {
        return PLZ;
    }

    public void setPLZ(int PLZ) {
        this.PLZ = PLZ;
    }

    public String getTelNum() {
        return telNum;
    }

    public void setTelNum(String telNum) {
        this.telNum = telNum;
    }

    public char getGeschlecht() {
        return geschlecht;
    }

    public void setGeschlecht(char geschlecht) {
        this.geschlecht = geschlecht;
    }

    public LocalDate getGeburtstag() {
        return geburtstag;
    }

    public void setGeburtstag(LocalDate geburtstag) {
        this.geburtstag = geburtstag;
    }
}
