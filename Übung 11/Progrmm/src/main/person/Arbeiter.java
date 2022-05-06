package main.person;

import java.time.LocalDate;

public class Arbeiter extends Person {

    private String jobName;
    private boolean hatDeanst;

    public Arbeiter(String vorname, String nachname, LocalDate alter, String land, String gebOrt, String augenFabe, int groesse, int plz, String stadt, String strasse, int hausNum, String jobName, boolean hatDeanst) {
        super(vorname, nachname, alter, land, gebOrt, augenFabe, groesse, plz, stadt, strasse, hausNum);
        this.jobName = jobName;
        this.hatDeanst = hatDeanst;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public boolean isHatDeanst() {
        return hatDeanst;
    }

    public void setHatDeanst(boolean hatDeanst) {
        this.hatDeanst = hatDeanst;
    }
}
