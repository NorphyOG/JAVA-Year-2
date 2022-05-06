package main;

import java.time.LocalDate;

public class PERSON {
    private String vorname;
    private String nachname;
    private LocalDate geb;
    private boolean isArzt;
    private String[] diagnose = new String[99];

    public boolean add_Diagnose(String diagnoseName) {
        for (int i = 0; i < diagnose.length; i++) {
            if (diagnose[i] == null) {
                diagnose[i] = diagnoseName;
                return true;
            }
        }
        return false;
    }

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

    public boolean isArzt() {
        return isArzt;
    }

    public void setArzt(boolean arzt) {
        isArzt = arzt;
    }

    public String[] getDiagnose() {
        return diagnose;
    }
}
