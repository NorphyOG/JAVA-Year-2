package main;

import java.util.ArrayList;

public class Schule {

    private String name;
    private String adress;
    private ArrayList<Person>[] klassenList = new ArrayList[99];

    public Schule(String name, String adress) {
        this.name = name;
        this.adress = adress;
    }

    public void addKlasse(ArrayList<Person> schuelerList, ArrayList<Person> klassensprecherList, ArrayList<Person> klassenLehrer) {
        for (int i = 0; i < klassenList.length; i++) {
            if (klassenList[i] == null) {
                klassenList[i] = schuelerList;
                klassenList[i+1] = klassensprecherList;
                klassenList[i+2] = klassenLehrer;
                break;
            }
        }
    }

    public String getKlassenList() {
        int count = 0;
        String string = "";
        for (ArrayList<Person> personArrayList : klassenList) {
            String type = "";
            switch (count) {
                case 0:
                    type = "\n< Schüler >";
                    break;
                case 1:
                    type = "\n< Klassen Sprecher >";
                    break;
                case 2:
                    type = "\n< Lehrer >";
                    break;
            }
            if (personArrayList != null) {
                //System.out.println(type);
                string = string + "\n" + type;
                for (Person person : personArrayList) {
                    //System.out.println(person);
                    string = string + "\n" + person;
                }
            }
            count++;
        }
        return string;
    }

    public void setKlassenList(ArrayList<Person>[] klassenList) {
        this.klassenList = klassenList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }


}
