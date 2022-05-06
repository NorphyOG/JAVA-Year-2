package main;

import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;

public class KLASSE {

    private String name;
    private PERSON[] schuelerlist = new PERSON[30];
    private PERSON[] klassenSprecher = new PERSON[2];
    private PERSON klassenLehrer;
    private LocalDate start;
    private LocalDate ende;

    public boolean addSchueler(PERSON schueler) {
        boolean r = false;
        for (int i = 0; i < schuelerlist.length; i++) {
            if (schuelerlist[i] == null) {
                schuelerlist[i] = schueler;
                break;
            } else {
                r = true;
            }
        }
        return !r;
    }

    public boolean removeSchueler(String vorname, String nachname) {
        boolean r = false;
        for (int i = 0; i < schuelerlist.length; i++) {
            if (schuelerlist[i].getVorname().equals(vorname) && schuelerlist[i].getNachname().equals(nachname)) {
                schuelerlist[i] = null;
            } else {
                r = true;
            }
        }
        return !r;
    }

    public boolean setKlassenSprecher1(PERSON person) {
        boolean r = false;
        for (int i = 0; i < klassenSprecher.length; i++) {
            if (klassenSprecher[i] == null) {
                klassenSprecher[i] = person;
                break;
            } else {
                r = true;
            }
        }

        return !r;
    }
    
    public boolean setKlassenSprecher(PERSON person, boolean set) {
        boolean r = false;
        for (int i = 0; i < schuelerlist.length; i++) {
            if (schuelerlist[i].equals(person)) {
                if (set) {
                    for (int k = 0; k < klassenSprecher.length; k++) {
                        if (klassenSprecher[k] == null) {
                            klassenSprecher[k] = person;
                            r = true;
                            break;
                        } else {
                            System.err.println("Error Bereits Besetzt");
                        }
                    }
                } else {
                    for (int k = 0; k < klassenSprecher.length; k++) {
                        if (klassenSprecher[k] == person) {
                            klassenSprecher[k] = null;
                            r = true;
                            break;
                        } else {
                            System.err.println("Kein Klassen Sprecher mit dem Namen");
                        }
                    }
                }
            }
        }
        return r;
    }

    public boolean setKlassenLehrer (PERSON lehrer) {
        boolean r = false;
        if (klassenLehrer == null) {
            klassenLehrer = lehrer;
        } else {
            r = true;
        }
        return !r;
    }

    public boolean removeKlassenLehrer (boolean confirm) {
        boolean r = false;
        if (confirm) {
            klassenLehrer = null;
            r = true;
        }
        return r;
    }

    public PERSON isAeltester() {
        int confirm = schuelerlist.length;
        PERSON p = null;
        for (PERSON person : schuelerlist) {
            for (PERSON person1 : schuelerlist) {
                if (person.getGeb().isAfter(person1.getGeb())) {
                    confirm--;
                }
            }
            if (confirm == 0) {
                p = person;
            }
        }
        return p;
    }

    public int alter(PERSON person1) {
        Period between;
        LocalDate now = LocalDate.now();
        between = Period.between(person1.getGeb(), now);
        return between.getYears();
    }

    public int durschnitt() {
        int[] alterList = new int[schuelerlist.length];
        for (int i = 0; i < schuelerlist.length; i++) {
            alterList[i] = alter(schuelerlist[i]);
        }
        int schnitt = 0;
        for (int j : alterList) {
            schnitt = schnitt + j;
        }
        return schnitt = schnitt / alterList.length;
    }


    @Override
    public String toString() {
        return "KLASSE{" +
                "name='" + name + '\'' +
                ", schuelerlist=" + Arrays.toString(schuelerlist) +
                ", klassenSprecher=" + Arrays.toString(klassenSprecher) +
                ", klassenLehrer=" + klassenLehrer +
                ", start=" + start +
                ", ende=" + ende +
                '}';
    }

    //AUTO Getter & Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PERSON getKlassenLehrer() {
        return klassenLehrer;
    }

    public LocalDate getStart() {
        return start;
    }

    public void setStart(LocalDate start) {
        this.start = start;
    }

    public LocalDate getEnde() {
        return ende;
    }

    public void setEnde(LocalDate ende) {
        this.ende = ende;
    }
}
