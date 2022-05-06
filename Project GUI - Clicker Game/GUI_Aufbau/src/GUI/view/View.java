package GUI.view;

/*

Versuch die View immer zu kommentieren um den Überblick zu behalten.

 */

import javax.swing.*;
import java.awt.*;

public class View extends JFrame {

    /*
    Alle Elemente der View die du außerhalb erreichen willst
    wie z.b. einen JButton.

    Versuch deinen Variablen einen Namen zu geben der zu ihnen passt um sie später besser zu erkennen.7
    z.b. für JButton mit einem kleinem "b" vor dem namen für Button (Siehe unten).
    Und vergiss nicht die Getter zu erstellen.
     */

    //Button
    private JButton bButton;


    public View() {
        // - super(""); super immer ganz oben.
        super("");
        setSize(300, 300);
        Container container = getContentPane();

        //Test Button
        JPanel pButtons = new JPanel();
        bButton = new JButton("Test");
        /*
        Erstell wenn möglich einen setActionCommand direkt dann kannst du direkt den
        Namen von dort nehmen für den ActionListener.

            if (e.getActionCommand().equals("TEST_BUTTON")) {
                //Code hier

            }

         */
        bButton.setActionCommand("TEST_BUTTON");
        pButtons.add(bButton);


        //Dein Code hier







        /*
        Versuch mal alles mit einem container.add() am ende hinzuzufügen.
        (Mit JPanel arbeiten -- Du kannst auch JPanel in JPanel machen.)
         */
        container.add(pButtons);

        // - setVisible(true); Sollte immer ganz unten sein.
        setVisible(true);
    }

    //Alle Getter
    public JButton getbButton() {
        return bButton;
    }
}
