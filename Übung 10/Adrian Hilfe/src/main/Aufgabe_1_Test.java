package main;

public class Aufgabe_1_Test {
    public static void main(String[] args) {

        AQueue aQueue = new AQueue();

        //Erstellt die Array (3 Platz)
        aQueue.create(3);

        //Fügt 3x ein Wert ein.
        aQueue.add(2);
        aQueue.add(55);
        aQueue.add(223);

        //Zeigt die Array
        System.out.println(aQueue.show());

        //Zeigt das sie nicht leer ist
        System.out.println(aQueue.isEmpty());
    }
}
