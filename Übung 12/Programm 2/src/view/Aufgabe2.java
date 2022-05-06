package view;

import javax.swing.*;
import java.awt.*;

public class Aufgabe2 extends JFrame {

    private JLabel eingabe;
    private JTextField eingabe_text;
    private JLabel ausgabe;
    private JTextField ausgabe_text;

    private JLabel status_text;

    private JButton button1;
    private JButton button2;

    public Aufgabe2() {
        super("In Großbuschstaben umwandeln");

        setSize(550, 135);

        Container container = getContentPane();
        container.setLayout(new BorderLayout());

        JPanel pEinAusFeld = new JPanel();

        //Einagbe
        JPanel pEingabeFeld = new JPanel();
        eingabe = new JLabel("Eingabe: ");
        pEingabeFeld.add(eingabe);
        eingabe_text = new JTextField(15);
        eingabe_text.setActionCommand("ENTER");
        pEingabeFeld.add(eingabe_text);
        pEinAusFeld.add(pEingabeFeld, BorderLayout.WEST);

        //Ausgabe
        JPanel pAusgabeFeld = new JPanel();
        ausgabe = new JLabel("Ausgabe: ");
        pAusgabeFeld.add(ausgabe);
        ausgabe_text = new JTextField(15);
        //ausgabe_text.isEditable(false);
        pAusgabeFeld.add(ausgabe_text);
        pEinAusFeld.add(pAusgabeFeld, BorderLayout.EAST);

        container.add(pEinAusFeld, BorderLayout.NORTH);

        //Status
        JPanel pStatus = new JPanel();
        status_text = new JLabel("");
        status_text.setFont(new Font("Ubuntu", Font.BOLD, 10));
        pStatus.add(status_text, BorderLayout.NORTH);

        container.add(pStatus, BorderLayout.CENTER);

        JPanel pButtons = new JPanel();

        //Button 1
        button1 = new JButton("In Großbuchstaben");
        pButtons.add(button1, BorderLayout.WEST);

        //Button 2
        button2 = new JButton("Beenden");
        pButtons.add(button2, BorderLayout.EAST);

        container.add(pButtons, BorderLayout.SOUTH);


        setVisible(true);
    }

    public JTextField getEingabe_text() {
        return eingabe_text;
    }

    public void setEingabe_text(JTextField eingabe_text) {
        this.eingabe_text = eingabe_text;
    }

    public JTextField getAusgabe_text() {
        return ausgabe_text;
    }

    public void setAusgabe_text(JTextField ausgabe_text) {
        this.ausgabe_text = ausgabe_text;
    }

    public JLabel getStatus_text() {
        return status_text;
    }

    public void setStatus_text(JLabel status_text) {
        this.status_text = status_text;
    }

    public JButton getButton1() {
        return button1;
    }

    public void setButton1(JButton button1) {
        this.button1 = button1;
    }

    public JButton getButton2() {
        return button2;
    }

    public void setButton2(JButton button2) {
        this.button2 = button2;
    }
}
