package main;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ARZTPRAXIS {
    private List<PERSON> arzt = new LinkedList<>();
    private List<PERSON> patient = new LinkedList<>();
    public Queue<PERSON> warteListe = new LinkedList<>();

    public String add_warteZimmer(PERSON person) {
        warteListe.add(person);
        return person.getVorname() + " " + person.getNachname() + " wurde zur warteschlange hinzugefügt!";
    }

    public PERSON nextPatient() {
        return warteListe.poll();
    }

    public String add_Arzt(PERSON person) {
        arzt.add(person);
        return person.getVorname() + " " + person.getNachname() + " wurde zur Arzt Liste hinzugefügt!";
    }

    public String add_Patient(PERSON person) {
        patient.add(person);
        return person.getVorname() + " " + person.getNachname() + " wurde zur Patienten Liste hinzugefügt!";
    }

    //AUTO Getter & Setter
    public List<PERSON> getArzt() {
        return arzt;
    }

    public List<PERSON> getPatient() {
        return patient;
    }

    public Queue<PERSON> getWarteListe() {
        return warteListe;
    }
}
