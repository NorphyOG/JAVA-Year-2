package minidatabank;

import java.util.*;

public class lotto {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<String> allData = new ArrayList<>();
        List<String> name = new ArrayList();
        List<String> nachName = new ArrayList();
        List<Integer> alter = new ArrayList();
        List<Integer> plz = new ArrayList();
        List<String> lottoNums = new ArrayList();

        int kNr = 0;

        boolean runInput = true;
        boolean menu = true;

        while (menu) {
            try {
                System.out.println("\n\nMini-Database\n1: Daten Eingabe\n2: Daten Ausgabe\n3: Beenden");
                int input = sc.nextInt();
                switch (input) {
                    case 1:

                        //Setzung
                        System.out.print("Name: ");
                        while (runInput) {
                            try {
                                name.add(sc.next());
                                runInput = false;
                            } catch (InputMismatchException e) {
                                e.getMessage();
                            }
                        }
                        runInput = true;

                        System.out.print("Nachname: ");
                        while (runInput) {
                            try {
                                nachName.add(sc.next());
                                runInput = false;
                            } catch (InputMismatchException e) {
                                e.getMessage();
                            }
                        }
                        runInput = true;

                        System.out.print("Alter: ");
                        while (runInput) {
                            try {
                                alter.add(sc.nextInt());
                                runInput = false;
                            } catch (InputMismatchException e) {
                                e.getMessage();
                            }
                        }
                        runInput = true;

                        System.out.print("PLZ: ");
                        while (runInput) {
                            try {
                                plz.add(sc.nextInt());
                                runInput = false;
                            } catch (InputMismatchException e) {
                                e.getMessage();
                            }
                        }
                        runInput = true;

                        int[] rNums = new int[6];
                        for (int i = 0; i < rNums.length; i++) {
                            rNums[i] = (int) Math.round(Math.random() * 10);
                        }

                        StringBuilder rdmNumsS = new StringBuilder();
                        for (int i = 0; i < rNums.length; i++) {
                            if (i == 0) {
                                rdmNumsS = new StringBuilder(String.valueOf(rNums[i]));
                            } else {
                                rdmNumsS.append(".").append(rNums[i]);
                            }
                        }

                        System.out.println("Lotto Zahlen: " + rdmNumsS);

                        kNr++;






                        //Eintrag
                        try {

                            data d = new data();

                            for (String s : name) {
                                d.setName(s);
                            }
                            for (String s : nachName) {
                                d.setNachname(s);
                            }
                            for (Integer value : alter) {
                                d.setAlter(value);
                            }
                            for (Integer integer : plz) {
                                d.setPLZ(integer);
                            }

                            d.setLottoNums(rdmNumsS.toString());



                            allData.add(
                                    "/KundenNr: " + kNr +
                                    "/Name: " + d.getName() +
                                    "/Nachname: " + d.getNachname() +
                                    "/Alter: " + d.getAlter() +
                                    "/PLZ: " + d.getPLZ() +
                                    "/Lotto Zahlen: " + rdmNumsS
                            );

                        } catch (Exception e) {
                            e.getMessage();
                        }

                        break;
                    case 2:


                        if (!allData.isEmpty()) {
                            for (String dIn : allData) {
                                System.out.println(dIn);
                            }
                        } else {
                            System.err.print("Keine Daten Vorhanden!");
                        }

                        break;
                    case 3:
                        menu = false;
                        break;
                    default:
                        System.err.print("\nFalsche eingabe!\n");
                        break;
                }

            } catch (InputMismatchException e) {
                e.getMessage();
            }
        }

    }
}
