package main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Klasse {

    private String name;
    private ArrayList<Person> schuelerList = new ArrayList<>();
    private ArrayList<Person> klassensprecherList = new ArrayList<>();
    private ArrayList<Person> klassenLeherer = new ArrayList<>();
    private LocalDate[] klassenDauer;

    public Klasse(String name, LocalDate[] klassenDauer) {
        this.name = name;
        this.klassenDauer = klassenDauer;
    }


    public void addSchueler(Person person) {
        getSchuelerList().add(person);
    }

    public void addSKlassensprecher(Person person) {
        getKlassensprecherList().add(person);
    }

    public void addKlassenLeherer(Person person) {
        getKlassenLeherer().add(person);
    }

    public boolean removeSchueler(String schuelerID) {
        boolean r = false;
        for (Person person : schuelerList) {
            if (person.getID().equalsIgnoreCase(schuelerID)) {
                schuelerList.remove(person);
                r = true;
                break;
            }
        }
        return r;
    }

    public double schnittAlter() {
        int all = 0, row = 0;
        for (Person person : schuelerList) {
            all = all + person.getGebDate().getYear() - LocalDate.now().getYear();
            row++;
        }
        return all / row;
    }

    @Override
    public String toString() {
        return "Klasse{" +
                "name='" + name + '\'' +
                ", schuelerList=" + schuelerList +
                ", klassensprecherList=" + klassensprecherList +
                ", klassenLeherer=" + klassenLeherer +
                ", klassenDauer=" + Arrays.toString(klassenDauer) +
                '}';
    }

    public ArrayList<Person> getKlassenLeherer() {
        return klassenLeherer;
    }

    public void setKlassenLeherer(ArrayList<Person> klassenLeherer) {
        this.klassenLeherer = klassenLeherer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Person> getSchuelerList() {
        return schuelerList;
    }

    public ArrayList<Person> getKlassensprecherList() {
        return klassensprecherList;
    }

    public LocalDate[] getKlassenDauer() {
        return klassenDauer;
    }

    public void setKlassenDauer(LocalDate[] klassenDauer) {
        this.klassenDauer = klassenDauer;
    }
}
