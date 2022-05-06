package main;

import java.time.LocalDate;

public class Person {

    private String ID;
    private String vorname;
    private String nachname;
    private LocalDate gebDate;
    private char sex;
    private String adress;

    public Person(String ID, String vorname, String nachname, LocalDate gebDate, char sex, String adress) {
        this.ID = ID;
        this.vorname = vorname;
        this.nachname = nachname;
        this.gebDate = gebDate;
        this.sex = sex;
        this.adress = adress;
    }

    public Person isAelter(Person person1, Person person2) {
        if (person1.getGebDate().isAfter(person2.getGebDate())) {
            return person1;
        } else {
            return person2;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "ID='" + ID + '\'' +
                ", vorname='" + vorname + '\'' +
                ", nachname='" + nachname + '\'' +
                ", gebDate=" + gebDate +
                ", sex=" + sex +
                ", adress='" + adress + '\'' +
                '}';
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
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

    public LocalDate getGebDate() {
        return gebDate;
    }

    public void setGebDate(LocalDate gebDate) {
        this.gebDate = gebDate;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
