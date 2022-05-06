package main;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Datum {

    public void zeitDiffMath(LocalDate erstesDatum, LocalDate zweitesDatum) {
        Period per = Period.between(erstesDatum, zweitesDatum);
        System.out.println(per.toString().replace('P', ' ')); //TODO
        DateTimeFormatter form = DateTimeFormatter.ofPattern("EEEE, dd.MMMM uuuu", Locale.GERMANY);
        System.out.println(form.format(erstesDatum) + " --> +" + per + " Days --> " + form.format(zweitesDatum)); //TODO
    }

}
