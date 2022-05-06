package main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Orchester or = new Orchester();

        String[] insertTackt = new String[2];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < insertTackt.length; i++) {

            String menu;
            if (i == 0) {
                menu = "4/4 Tackt = 1\n3/4 Tackt = 2\n2/4 Tackt = 3";
            } else {
                menu = "A Tackt = 1\nB Tackt = 2\nC Tackt = 3";
            }

            boolean run = true;
            while (run) {
                try {
                    System.out.println();
                    System.out.println(menu);
                    int input = sc.nextInt();

                    switch (input) {
                        case 1 -> {
                            if (i == 0) {
                                insertTackt[0] = "4/4 Tackt ";
                            } else {
                                insertTackt[1] = "A Tackt ";
                            }
                            run = false;
                        }
                        case 2 -> {
                            if (i == 0) {
                                insertTackt[0] = "3/4 Tackt ";
                            } else {
                                insertTackt[1] = "B Tackt ";
                            }
                            run = false;
                        }
                        case 3 -> {
                            if (i == 0) {
                                insertTackt[0] = "2/4 Tackt ";
                            } else {
                                insertTackt[1] = "C Tackt ";
                            }
                            run = false;
                        }
                        default -> System.err.println("Ungültige Auswahl!");
                    }

                } catch (InputMismatchException e) {
                    sc.next();
                    System.err.println("Ungültige Auswahl!");
                }
            }

        }

        System.out.println("Wie viele Instrumente?");
        int groesse = 0;
        try {
            groesse = sc.nextInt();
        } catch (InputMismatchException e) {
            System.err.println("Ungültige Auswahl!");
        }


        or.setOrchester(groesse, insertTackt);
        or.playOrchester();
    }
}
