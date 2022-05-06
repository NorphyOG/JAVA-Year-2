package main;

import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;

public class BEHANDLUNG {
    private LocalDate behandlungsDate;
    private PERSON arzt;

    public String patientKarte(PERSON person) {
        return "Name: " + person.getVorname() + " " + person.getNachname() + "\nGeboren am: " + person.getGeb().toString() + "\nArzt: " + getArzt() + "\nBehandlung am: " + getBehandlungsDate().toString() + "\nDiagnose: " + Arrays.toString(person.getDiagnose());
    }

    public int alter(PERSON person) {
        LocalDate p1 = person.getGeb();
        Period period = Period.between(p1, LocalDate.now());
        return period.getYears();
    }

    //AUTO Getter & Setter
    public LocalDate getBehandlungsDate() {
        return behandlungsDate;
    }

    public void setBehandlungsDate(LocalDate behandlungsDate) {
        this.behandlungsDate = behandlungsDate;
    }

    public PERSON getArzt() {
        return arzt;
    }

    public void setArzt(PERSON arzt) {
        this.arzt = arzt;
    }
}
