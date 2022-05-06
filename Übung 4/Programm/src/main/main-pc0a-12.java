package main;

import main.*;

import java.time.LocalDate;

public class main {
    public static void main(String[] args) {
        BEHANDLUNG bh = new BEHANDLUNG();
        ARZTPRAXIS ap = new ARZTPRAXIS();

        PERSON patient = new PERSON();
        patient.setArzt(false);
        patient.add_Diagnose("Krebs");
        patient.add_Diagnose("Koi");
        patient.add_Diagnose("HemoMemo");
        patient.add_Diagnose("Johannes");
        patient.setVorname("Johannes");
        patient.setNachname("Emde");
        patient.setGeb(LocalDate.of(2002,10,31));
        ap.add_Patient(patient);

        System.out.println();

        PERSON arzt = new PERSON();
        arzt.setArzt(true);
        arzt.setVorname("Jerome");
        arzt.setNachname("Weber");
        arzt.setGeb(LocalDate.of(2002, 4, 30));
        ap.add_Arzt(arzt);

        System.out.println();

        ap.add_Patient(patient);

        System.out.println();

        System.out.println(bh.alter(patient));

        System.out.println();

        ap.add_warteZimmer(patient);
        ap.add_warteZimmer(patient);
        ap.add_warteZimmer(patient);

        System.out.println("\n" + ap.nextPatient().getVorname());

        System.out.println();

        ap.getWarteListe();
        ap.getArzt();
        ap.getPatient();

        System.out.println();


    }
}
