package model;


public class Model {

    private engGer[] engGerList = {new engGer("Hasty", "Hastig"), new engGer("Fool", "Narr"), new engGer("Hello", "Hallo"),};

    public Model() {

    }

    public String uPrufe(String wort) throws Exception {

        for (engGer engGer : engGerList) {
            String r = engGer.uebersetzer(wort);
            if (!r.equals("Nein")) {
                return r;
            }

        }
        throw new Exception("Kein Wort Gefunden");
    }

    public engGer[] getEngGerList() {
        return engGerList;
    }

    public void setEngGerList(engGer[] engGerList) {
        this.engGerList = engGerList;
    }
}



class engGer {

    private String enWort;
    private String gerWort;

    public engGer(String enWort, String gerWort) {
        this.enWort = enWort;
        this.gerWort = gerWort;
    }

    public String uebersetzer(String wort) {
        if (gerWort.equalsIgnoreCase(wort)) {
            return enWort;
        } else if (enWort.equalsIgnoreCase(wort)) {
            return gerWort;
        } else {
            return "Nein";
        }
    }
}




