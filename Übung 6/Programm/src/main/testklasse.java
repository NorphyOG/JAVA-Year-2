package main;

import java.time.LocalDate;

public class testklasse {
    public static void main(String[] args) {

        Person schiff_1_Kapitän = new Person("Egon", "Meier", "Schiffsweg 13", 12345, "0111213131", 'M', LocalDate.of(1996, 3, 18));
        Person schiff_Passagier0 = new Person("Thomas", "Kek", "Kekona Str. 69", 69696, "06969696969", 'X', LocalDate.of(1835, 6, 14));
        Person schiff_Passagier1 = new Person("Nori", "Sai", "Tekonigo Str. 1", 32322, "032342323", 'W', LocalDate.of(2003, 2, 9));

        Ausflugsboot schiff_1 = new Ausflugsboot("Rheinblick", schiff_1_Kapitän, 18);

        schiff_1.addPassagier(schiff_Passagier0);
        schiff_1.addPassagier(schiff_Passagier1);

        System.out.println(schiff_1.info());

        System.out.println("Durschnitts Alter: " + schiff_1.mittelAlter());


        Person schiff_2_Kapitän = new Person("Rudi", "Carrell", "Darum Weg 819", 15552, "012121221", 'M', LocalDate.of(1980, 9, 28));
        FrachtSchiff schiff_2 = new FrachtSchiff("Holland", schiff_2_Kapitän, 11, 1000, 700);

        System.out.println("\n\nInfo:\n");
        System.out.println(schiff_2.info());

        System.out.println("\n\nInfo Beladen 300T:\n");
        schiff_2.beladen(300);
        System.out.println(schiff_2.info());

        System.out.println("\n\nInfo Entladen 400T:\n");
        schiff_2.entladen(400);
        System.out.println(schiff_2.info());

        System.out.println("\n\nInfo Entladen 400T:\n");
        schiff_2.entladen(400);
        System.out.println(schiff_2.info());

        System.out.println("\n\nInfo Beladen 300T:\n");
        schiff_2.beladen(300);
        System.out.println(schiff_2.info());


    }
}
