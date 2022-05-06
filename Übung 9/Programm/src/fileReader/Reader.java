package fileReader;

import main.Klasse;
import main.Person;
import main.Schule;

import java.io.*;
import java.time.LocalDate;

public class Reader {

    public void addText(String changes, boolean overrite) {
        FileWriter fileWriter;
        try {

            fileWriter = new FileWriter("history.txt", !overrite);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.newLine();
            bufferedWriter.write(changes);
            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void showText(int num) {

        String[] datei = {"history.txt", "myData.txt"};

        BufferedReader bufferedReader;
        try {

            bufferedReader = new BufferedReader(new FileReader(datei[num]));
            String txt;
            while ((txt = bufferedReader.readLine()) != null) {
                System.out.println(txt);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void createMyData(boolean overrite) {
        FileWriter fileWriter;
        try {

            fileWriter = new FileWriter("myData.txt", !overrite);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("S=Schüler K=Klassensprecher L=Lehrer: Vorname, Nachname, yyyy.mm.dd, Sex(M,W,D), Adresse; /\n");
            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public void myData(Klasse klasse, Schule schule) {

        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new FileReader("myData.txt"));
            String myData;

            while ((myData = bufferedReader.readLine()) != null) {

                String removedInfo = myData.replace("S=Schüler K=Klassensprecher L=Lehrer: Vorname, Nachname, yyyy.mm.dd, Sex(M,W,D), Adresse", "");
                String removedLeer = removedInfo.replace(" ", "");

                String[] personAll = removedLeer.split(";");


                for (String s : personAll) {

                    String[] split1 = s.split(":");

                    String type = split1[0];
                    String[] personData = split1[1].split(",");
                    String[] gebDateTxt = personData[2].split("\\.");
                    LocalDate gebDate = LocalDate.of(Integer.parseInt(gebDateTxt[0]), Integer.parseInt(gebDateTxt[1]), Integer.parseInt(gebDateTxt[2]));

                    String id = personData[0].charAt(0) + personData[1].charAt(0) + String.valueOf(gebDate.getYear()).substring(2, 3) + personData[3].charAt(0) + type;


                    Person person = new Person(id, personData[0], personData[1], gebDate, personData[3].charAt(0), personData[4]);

                    if (type.equalsIgnoreCase("S")) {
                        klasse.addSchueler(person);
                    } else if (type.equalsIgnoreCase("K")) {
                        klasse.addSKlassensprecher(person);
                    } else if (type.equalsIgnoreCase("L")) {
                        klasse.addKlassenLeherer(person);
                    } else {
                        System.err.println("Falsches Formart (Type)");
                    }


                }

            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        schule.addKlasse(klasse.getSchuelerList(), klasse.getKlassensprecherList(), klasse.getKlassenLeherer());
    }

}
