package main;

import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;

public class Ausflugsboot extends Schiff {

    private Person[] passagierListe = new Person[20];


    public Ausflugsboot(String schiffsname, Person kapitän, int besatzung) {
        super(schiffsname, kapitän, besatzung);
    }

    public String info() {
        return super.info() + "\nPassagier Liste: " + Arrays.toString(getPassagierListe());
    }

    public double mittelAlter() {
        double a = 0, turn = 0;
        for (Person person : passagierListe) {
            if (person != null) {
                LocalDate now = LocalDate.now();
                Period per = Period.between(person.getGeburtstag(), now);
                a = a + per.getYears();
                turn = turn + 1;
            }
        }
        return a / turn;
    }

    public boolean addPassagier(Person person) {
        for (int i = 0; i < passagierListe.length; i++) {
            if (passagierListe[i] == null) {
                passagierListe[i] = person;
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "ausflugsboot{" +
                "passagierListe=" + Arrays.toString(passagierListe) +
                '}';
    }

    public Person[] getPassagierListe() {
        return passagierListe;
    }

    public void setPassagierListe(Person[] passagierListe) {
        this.passagierListe = passagierListe;
    }
}
