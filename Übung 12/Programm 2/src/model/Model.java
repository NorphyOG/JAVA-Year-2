package model;

import java.util.Locale;

public class Model {

    public Model() {

    }

    public String grossSchreiben(String text) throws Exception {
        if (text.equals("") || text.trim().length() == 0) {
            throw new Exception("Keine Eingabe");
        }

        String grossWort = text.toUpperCase(Locale.ROOT);
        return grossWort;
    }

}
