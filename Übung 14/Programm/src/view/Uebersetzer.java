package view;

import javax.swing.*;
import java.awt.*;

public class Uebersetzer extends JFrame{

    private JLabel sprache1;
    private JTextField sprache1_text;
    private JLabel sprache2;
    private JTextField sprache2_text;

    private JTextField status_text;

    private JButton button1;

    public JTextField getStatus_text() {
        return status_text;
    }

    public void setStatus_text(JTextField status_text) {
        this.status_text = status_text;
    }

    public Uebersetzer() {

        super("Übersetzer");

        setSize(380, 130);

        Container container = getContentPane();
        container.setLayout(new BorderLayout());

        JPanel pUebersezer = new JPanel();
        pUebersezer.setLayout(new BoxLayout(pUebersezer, BoxLayout.Y_AXIS));

        //Sprache 1
        JPanel pSprache1Feld = new JPanel();
        sprache1 = new JLabel("Englisch/Deutsch: ");//TODO
        pSprache1Feld.add(sprache1);
        sprache1_text = new JTextField(15);
        sprache1_text.setActionCommand("TXT_DEUTSCH");
        pSprache1Feld.add(sprache1_text);
        pUebersezer.add(pSprache1Feld, BorderLayout.NORTH);

        //Sprache 2
        JPanel pSprache2Feld = new JPanel();
        sprache2 = new JLabel("Übersetzung: ");
        pSprache2Feld.add(sprache2);
        sprache2_text = new JTextField(15);
        sprache2_text.setActionCommand("TXT_ENGLISH");
        sprache2_text.setEditable(false);
        pSprache2Feld.add(sprache2_text);
        pUebersezer.add(pSprache2Feld, BorderLayout.SOUTH);


        JPanel pButtons = new JPanel();

        //Button 1
        button1 = new JButton("GO");
        button1.setActionCommand("BUTTON");
        pButtons.add(button1, BorderLayout.WEST);

        JPanel all = new JPanel();

        all.add(pUebersezer, BorderLayout.WEST);
        all.add(pButtons, BorderLayout.EAST);


        status_text = new JTextField("");
        status_text.setEditable(false);
        status_text.setActionCommand("STATUS");


        container.add(all, BorderLayout.NORTH);
        container.add(status_text, BorderLayout.SOUTH);


        setVisible(true);
    }

    public JTextField getSprache1_text() {
        return sprache1_text;
    }

    public void setSprache1_text(JTextField sprache1_text) {
        this.sprache1_text = sprache1_text;
    }

    public JTextField getSprache2_text() {
        return sprache2_text;
    }

    public void setSprache2_text(JTextField sprache2_text) {
        this.sprache2_text = sprache2_text;
    }

    public JButton getButton1() {
        return button1;
    }

    public void setButton1(JButton button1) {
        this.button1 = button1;
    }
}
