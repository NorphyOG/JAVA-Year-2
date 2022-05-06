package GUI.model;

/*

    Versuch dein Model ordentlich zu halten mit vielen Enters und Leerzeichen.


 */

import GUI.view.View;

public class Model {

    /*
    Erstell alle Wichtigen Variablen oben!

    versuch bei Variablen den anfang immer Klein zu schreiben und bei einem nächsten wort Groß wieder.
     */
    private String halloButtonText = "Hallo";



    /*
    Versuch mal auf Klick Rechtsklick zu machen und dort auf
    Refactor -> Extract Delegate
    Damit kannst du Methoden in einzelne Klassen Packen

    Oben Name und dann auswählen welche Klassen.

     */

    public void Klick(View view){
        view.getbButton().setText(halloButtonText);
    }

}
