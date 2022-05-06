package main;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String praxisName = "FKKFORFUN";

        boolean firstStart = true;
        boolean[] run = {true, true};
        while (run[0]) {
            try {
                if (firstStart) {
                    System.out.printf("Willkommen in der Arztparxis " + praxisName + "\n");
                    firstStart = false;
                } else {
                    System.out.printf("Info\t\t\t\t1: \nRegister Patient\t2: \nWarteschlange\t\t3: \nBeenden\t\t\t\t4: \n:: ");
                    switch (sc.nextInt()) {
                        case 1:
                            break;
                        case 2:
                            PERSON p = new PERSON();
                            p.setArzt(false);

                            System.out.print("Vorname\t-: ");
                            p.setVorname(sc.next());

                            System.out.print("Nachname\t-: ");
                            p.setNachname(sc.next());

                            while (run[1]) {
                                try {
                                    System.out.print("Geburtsdatum (TT-MM-YYYY)\t-: ");
                                    String date = sc.next();
                                    if (date.length() < 9) {
                                        String[] split = date.split("-");
                                        for (String a : split) {

                                        }
                                        run[1] = false;
                                    } else {
                                        System.err.printf("Falsches Formart!");
                                    }
                                } catch (InputMismatchException e) {
                                    System.out.printf(e.getMessage());
                                }
                            }
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        default:
                            System.err.println("Keine Verfügbare eingabe!");
                            break;
                    }
                }
            } catch (InputMismatchException e) {
                System.err.println(e.getMessage());
                sc = null;
            }
        }

    }
}
