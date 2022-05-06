package main;

public class Main {
    public static void main(String[] args) {

        Reader reader = new Reader();
        AQueue aQueue = new AQueue();

        //txt Erstellen [true ändern um werte hinzuzufügen]
        reader.createMyData(true);


        //Create Array Queue [5 Plätze]
        System.out.println("\nCreate Array Queue [5 Plätze]\n");
        aQueue.create(5);

        //Array Anzeigen
        System.out.println("Array Anzeigen: " + aQueue.show() + "\n");

        //isEmpty Abfrage [Mit nix in der Array Queue]
        if (aQueue.isEmpty()) {
            System.out.println("isEmpty Abfrage: Ist Leer");
        } else {
            System.out.println("isEmpty Abfrage: Nicht Leer");
        }

        //Einfügen aus einer Datei "myData.txt"
        System.out.println("\nEinfügen aus einer Datei \"myData.txt\"\n");
        reader.myData(aQueue);

        //Array Anzeigen
        System.out.println("Array Anzeigen: " + aQueue.show() + "\n");

        //Erstes Element der Array Entfernen und zurück geben
        System.out.println("Erstes Element: " + aQueue.remove() + "\n");

        //isEmpty Abfrage [Mit etwas in der Array Queue]
        if (aQueue.isEmpty()) {
            System.out.println("isEmpty Abfrage: Ist Leer\n");
        } else {
            System.out.println("isEmpty Abfrage: Nicht Leer\n");
        }

        //Array Anzeigen
        System.out.println("Array Anzeigen: " + aQueue.show() + "\n");

    }
}
