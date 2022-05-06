package main;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        DatumTest date = new DatumTest();
        date.nextDay(4);

        Datum date1 = new Datum();
        date1.zeitDiffMath(LocalDate.of(2002, 1, 12), LocalDate.of(2019, 8, 13));

    }
}
