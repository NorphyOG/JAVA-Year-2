package main;

import java.time.LocalDate;

public class PERSON {

    private String vorname;
    private String nachname;
    private LocalDate geb;
    private char sex;
    private String adresse;

    public static PERSON isAelter1 (PERSON person1, PERSON person2) {
        if (person1.getGeb().isAfter(person2.getGeb())) {
            return person1;
        } else {
            return person2;
        }
    }

    /* TODO isAelter2
    public boolean isAelter2() {

    }
    */

    //AUTO Getter & Setter
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

    public LocalDate getGeb() {
        return geb;
    }

    public void setGeb(LocalDate geb) {
        this.geb = geb;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
}
