package main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DatumTest {
    public void nextDay(int Days) {
        LocalDate next = LocalDate.now().plusDays(Days);
        DateTimeFormatter form = DateTimeFormatter.ofPattern("EEEE, dd.MMMM uuuu", Locale.GERMANY);
        System.out.println(form.format(LocalDate.now()) + " --> +" + Days + " Days --> " + form.format(next));
    }
}
