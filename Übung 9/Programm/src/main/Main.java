package main;

import fileReader.Reader;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Reader reader = new Reader();


        LocalDate[] schulZeitraum = {LocalDate.of(2019, 9, 22), LocalDate.of(2023, 8, 10)};

        Klasse klasse = new Klasse("bbm3h20a", schulZeitraum);
        Schule schule = new Schule("bib", "Mühlheimer Str. 123");

        //reader.createMyData(true);
        reader.myData(klasse, schule);
        reader.addText(schule.getKlassenList(), true);


        //reader.addText("Hello", false);
        //reader.showText(1);

        reader.showText(0);

    }
}
